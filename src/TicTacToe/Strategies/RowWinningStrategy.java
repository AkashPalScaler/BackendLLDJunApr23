package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, Move lastMove) {
        return false;
    }
}
