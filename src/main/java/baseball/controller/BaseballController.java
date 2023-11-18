package baseball.controller;

import baseball.domain.GameDiscriminator;
import baseball.domain.NumberGenerator;
import baseball.domain.Player;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;


public class BaseballController {

    public void baseballGameStart(){
        while (true){
            List<Integer> computer = NumberGenerator.generateComputerNumbers();
            System.out.println(OutputView.GAME_START_MESSAGE);
            while (true){
                String input = InputView.inputNumber();
                System.out.println(computer);

                List<Integer> player = Player.generatePlayerNumbers(input);

                OutputView outputView = new OutputView();

                GameDiscriminator gameDiscriminator = new GameDiscriminator();
                outputView.gameStatus(computer, player, gameDiscriminator);
                if (gameDiscriminator.checkStrike(computer, player) == 3){
                    outputView.gameEnd();
                    break;
                }
            }
            String input2 = InputView.gameStartOrEnd();
            if (input2.equals("2")){
                break;
            }
        }
    }
}
