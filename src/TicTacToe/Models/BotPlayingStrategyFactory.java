package TicTacToe.Models;

import TicTacToe.Strategies.BotPlayingStrategy;
import TicTacToe.Strategies.EasyPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel){
//        if(difficultyLevel == BotDifficultyLevel.EASY)
        return new EasyPlayingStrategy();
    }
}
