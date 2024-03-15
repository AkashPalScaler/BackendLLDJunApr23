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
        Player playerC = new HumanPlayer("Bard", 3, 'X', PlayerType.HUMAN);
        List<Player> players = new ArrayList<>();
        players.add(playerA);
        players.add(playerB);
        players.add(playerC);

        WinningStrategy rowWinning = new RowWinningStrategy();
        List<WinningStrategy> strategies = new ArrayList<>();
        strategies.add(rowWinning);

        Game game = gameController.startGame(4, players, strategies);

        game.printBoard();
    }
}
