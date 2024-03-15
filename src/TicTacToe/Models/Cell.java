package TicTacToe.Models;

public class Cell {
    private Integer row;
    private Integer col;
    private CellState cellState;
    private Player player;

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }


}
