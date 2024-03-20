package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;
import TicTacToe.Models.Player;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {

    Map<Integer, Map<Character, Integer>> diaMap = new HashMap<>();

    @Override
    public boolean checkWin(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();
        Player player = lastMove.getPlayer();

        if(row == col){
            if(!diaMap.containsKey(0)){
                diaMap.put(0, new HashMap<>());
            }
            Map<Character, Integer> FirstDiaCountMap = diaMap.get(0);

            if(!FirstDiaCountMap.containsKey(player.getSymbol())){
                FirstDiaCountMap.put(player.getSymbol(), 0);
            }

            FirstDiaCountMap.put(player.getSymbol(), FirstDiaCountMap.get(player.getSymbol()) + 1);

            if(FirstDiaCountMap.get(player.getSymbol()).equals(board.getDimension())){
                return true;
            }
        }

        //2nd diagonal logic
        return false;
    }

    @Override
    public void handleUndo(Board board, Move lastMove) {
        
    }
}
