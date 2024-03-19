package TicTacToe.Models;
import TicTacToe.Validations.CellValidation;

import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner scanner;
    @Override
    public Cell makeMove(Board board) {
        System.out.println(this.getName() + ", It's your move. Please input the row and column");
        int row,col;
        do{
            row = scanner.nextInt();
            col = scanner.nextInt();
        }while(!CellValidation.validateRowCol(board,row,col));

        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);

        return cell;
    }

    public HumanPlayer(String name, Integer gamerID, Character symbol, PlayerType playerType) {
        super(name, gamerID, symbol, playerType);
        scanner = new Scanner(System.in);
    }
}
