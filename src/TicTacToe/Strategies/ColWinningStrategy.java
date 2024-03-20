package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;
import TicTacToe.Models.Player;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {

    Map<Integer, Map<Character, Integer>> colMaps = new HashMap<>();
    @Override
    public boolean checkWin(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        Player player = lastMove.getPlayer();

        if(!colMaps.containsKey(col)){
            colMaps.put(col, new HashMap<>());
        }

        Map<Character, Integer> colCountMap = colMaps.get(col);
        if(!colCountMap.containsKey(player.getSymbol())){
            colCountMap.put(player.getSymbol(), 0);
        }
        colCountMap.put(player.getSymbol(), colCountMap.get(player.getSymbol()) + 1);

        if(colCountMap.get(player.getSymbol()).equals(board.getDimension())){
            return true;
        }

        return false;

    }

    @Override
    public void handleUndo(Board board, Move lastMove) {

    }
}
