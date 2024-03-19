package TicTacToe.Models;
import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner scanner;
    @Override
    public Cell makeMove(Board board) {
        return null;
    }

    public HumanPlayer(String name, Integer gamerID, Character symbol, PlayerType playerType) {
        super(name, gamerID, symbol, playerType);
        scanner = new Scanner(System.in);
    }
}
