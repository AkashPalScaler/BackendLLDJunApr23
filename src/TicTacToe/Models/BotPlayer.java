package TicTacToe.Models;

import TicTacToe.Factories.BotPlayingStrategyFactory;
import TicTacToe.Strategies.BotPlayingStrategy;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    @Override
    public Cell makeMove(Board board) {
        System.out.println("Bot player is making a move.");
        return botPlayingStrategy.makeMove(board, this);
    }

    public BotPlayer(String name, Integer gamerID, Character symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, gamerID, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory
                .getBotPlayingStrategy(this.botDifficultyLevel);
    }
}
