package TicTacToe.Models;
import TicTacToe.Exceptions.BotCountExceedsLimitException;
import TicTacToe.Exceptions.DuplicateSymbolException;
import TicTacToe.Exceptions.PlayersCountDimensionMismatchException;
import TicTacToe.Strategies.WinningStrategy;
import TicTacToe.Validations.GameValidations;

import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private Integer nextPlayerIndex;
    private List<WinningStrategy> winningStrategyList;


    private Game(Integer dimension, List<Player> players, List<WinningStrategy> winningStrategyList) {
        this.players = players;
        this.winningStrategyList = winningStrategyList;
        this.board = new Board(dimension);
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public void printBoard(){
        board.display();
    }

    public void makeMove(){
        Player player = players.get(nextPlayerIndex);
        Cell cell = player.makeMove(this.board);

        Move move = new Move(player, cell);
        this.moves.add(move);

        if(checkWinner(this.board, move)){
            this.gameState = GameState.CONCLUDED;
            this.winner = player;
            return;
        }

        if(this.moves.size() == this.board.getDimension()* this.board.getDimension()){
            this.gameState = GameState.DRAW;
            return;
        }



        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
    }

    private boolean checkWinner(Board board, Move move){
        for(WinningStrategy ws: this.winningStrategyList){
            if(ws.checkWin(board, move)){
                return true;
            }
        }

        return false;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public  static class Builder {
        Integer dimension;
        List<Player> players;
        List<WinningStrategy> winningStrategyList;


        public Builder setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategyList(List<WinningStrategy> winningStrategyList) {
            this.winningStrategyList = winningStrategyList;
            return this;
        }

        public Game build() throws BotCountExceedsLimitException, DuplicateSymbolException, PlayersCountDimensionMismatchException {
            //validations
            GameValidations.validatePlayerCountAndBoardDimension(this.players, dimension);
            GameValidations.validateUniqueSymbolsForPlayers(this.players);
            GameValidations.validateBotCount(this.players, 1);
            return new Game(this.dimension, this.players, this.winningStrategyList);
        }
    }
}
