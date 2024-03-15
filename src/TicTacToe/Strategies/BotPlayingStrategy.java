package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}
