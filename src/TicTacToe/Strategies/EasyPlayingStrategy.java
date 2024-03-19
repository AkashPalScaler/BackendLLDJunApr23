package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.CellState;
import TicTacToe.Models.Player;

public class EasyPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board, Player player) {
        for(int i=0;i<board.getDimension();i++){
            for(int j=0;j<board.getDimension();j++){
                Cell cell = board.getBoard().get(i).get(j);
                if(cell.getCellState() == CellState.EMPTY){
                    cell.setCellState(CellState.FILLED);
                    cell.setPlayer(player);
                    return cell;
                }
            }
        }
        return null;
    }
}
