package baseball.controller;

import baseball.domain.*;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    public void baseballGameStart() {
        System.out.println();
        while (true) {
            System.out.println(OutputView.GAME_START_MESSAGE);
            Computer computer = new Computer(NumberGenerator.generateComputerNumbers());
            playingGame(computer);
            String input2 = InputView.gameStartOrEnd();
            if (input2.equals("2")) {
                break;
            }
        }
    }

    private void playingGame(Computer computer) {
        while (true) {
            String input = InputView.inputNumber();
            Player player = new Player(PlayerNumberGenerator.inputNumberGenerate(input));

            GameDiscriminator gameDiscriminator = new GameDiscriminator();
            OutputView.gameStatus(computer, player, gameDiscriminator);
            if (gameDiscriminator.checkStrike(computer, player) == 3) {
                System.out.println(OutputView.GAME_END);
                break;
            }
        }
    }
}
