package TicTacToe.Validations;

import TicTacToe.Models.Board;
import TicTacToe.Models.CellState;

public class CellValidation {
    public static boolean validateRowCol(Board board, int row, int col){
        if(row>= board.getDimension() || row<0){
            System.out.println("Invalid row, please try again");
            return false;
        }
        if(col>= board.getDimension() || col<0){
            System.out.println("Invalid col, please try again");
            return false;
        }
        if(CellState.FILLED.equals(board.getBoard().get(row).get(col).getCellState())){
            System.out.println("Invalid move, please try again");
            return false;
        }
        return true;
    }
}
