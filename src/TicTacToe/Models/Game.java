package TicTacToe.Models;
import TicTacToe.Strategies.WinningStrategy;

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

        public Game build(){
            //validations
            return new Game(this.dimension, this.players, this.winningStrategyList);
        }
    }
}
