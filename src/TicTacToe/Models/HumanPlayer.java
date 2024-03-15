package TicTacToe.Models;

public class HumanPlayer extends Player {
    @Override
    public Cell makeMove(Board board) {
        return null;
    }

    public HumanPlayer(String name, Integer gamerID, Character symbol, PlayerType playerType) {
        super(name, gamerID, symbol, playerType);
    }
}
