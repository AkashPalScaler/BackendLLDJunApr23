package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Exceptions.BotCountExceedsLimitException;
import TicTacToe.Exceptions.DuplicateSymbolException;
import TicTacToe.Exceptions.PlayersCountDimensionMismatchException;
import TicTacToe.Models.*;
import TicTacToe.Strategies.EasyPlayingStrategy;
import TicTacToe.Strategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws PlayersCountDimensionMismatchException, BotCountExceedsLimitException, DuplicateSymbolException {
        GameController gameController = new GameController();

        Player playerA = new HumanPlayer("Akash", 1, 'X', PlayerType.HUMAN);
        Player playerB = new BotPlayer("ChatGPT", 2, 'O', PlayerType.BOT, BotDifficultyLevel.EASY);
        List<Player> players = new ArrayList<>();
        players.add(playerA);
        players.add(playerB);

        WinningStrategy rowWinning = new RowWinningStrategy();
        List<WinningStrategy> strategies = new ArrayList<>();
        strategies.add(rowWinning);

        Game game = gameController.startGame(3, players, strategies);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            game.printBoard();

            game.makeMove();
        }
        game.makeMove();
        if(game.getGameState().equals(GameState.CONCLUDED)){
            System.out.println(game.getWinner() + " have won");
        }

        if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("It's a draw");
        }
    }
}
