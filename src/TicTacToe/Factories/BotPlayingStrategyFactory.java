package TicTacToe.Factories;

import TicTacToe.Models.BotDifficultyLevel;
import TicTacToe.Strategies.BotPlayingStrategy;
import TicTacToe.Strategies.EasyPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel){
//        if(difficultyLevel == BotDifficultyLevel.EASY)
        return new EasyPlayingStrategy();
    }
}
