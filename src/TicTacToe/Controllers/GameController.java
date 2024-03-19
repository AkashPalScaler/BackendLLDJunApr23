package TicTacToe.Controllers;

import TicTacToe.Exceptions.BotCountExceedsLimitException;
import TicTacToe.Exceptions.DuplicateSymbolException;
import TicTacToe.Exceptions.PlayersCountDimensionMismatchException;
import TicTacToe.Models.Game;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(Integer dimension, List<Player> players, List<WinningStrategy> winningStrategyList) throws PlayersCountDimensionMismatchException, BotCountExceedsLimitException, DuplicateSymbolException {
        System.out.println("The game of TicTacToe begins!");
            return Game.getBuilder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .setWinningStrategyList(winningStrategyList)
                    .build();

    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void undo(){

    }
}
