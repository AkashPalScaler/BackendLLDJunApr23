package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinningStrategy {
    boolean checkWin(Board board, Move lastMove);
}
