package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.Player;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board, Player player);
}
