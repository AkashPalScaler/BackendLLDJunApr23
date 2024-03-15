package TicTacToe.Models;

public abstract class Player {
    private String name;
    private Integer gamerID;
    private Character symbol;
    private PlayerType playerType;

    public abstract Cell makeMove(Board board);

    public Player(String name, Integer gamerID, Character symbol, PlayerType playerType) {
        this.name = name;
        this.gamerID = gamerID;
        this.symbol = symbol;
        this.playerType = playerType;
    }
}
