package baseball.view;

import baseball.domain.GameDiscriminator;
import java.util.List;

public class OutputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    public void gameEnd() {
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void gameStatus(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        if (!gameDiscriminator.checkNotThing(computer, player)){
            checkStrikePrint(computer, player, gameDiscriminator);
            checkBallPrint(computer, player, gameDiscriminator);
            strikeAndBallPrint(computer, player, gameDiscriminator);
        }
        notThingPrint(computer, player, gameDiscriminator);
    }

    private void checkStrikePrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkBall(computer, player) == 0) {
            strikePrint(computer, player, gameDiscriminator);
        }
    }

    private void checkBallPrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkStrike(computer, player) == 0) {
            ballPrint(computer, player, gameDiscriminator);
        }
    }

    private void notThingPrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkNotThing(computer, player)) {
            System.out.println("낫싱");
        }
    }

    private void strikeAndBallPrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        if (checkStrikeAndBall(computer, player, gameDiscriminator)) {
            System.out.println(gameDiscriminator.checkBall(computer, player) + "볼" + " " +
                    gameDiscriminator.checkStrike(computer, player) + "스트라이크");
        }
    }

    private boolean checkStrikeAndBall(List<Integer> computer,
                                       List<Integer> player,
                                       GameDiscriminator gameDiscriminator) {
        return gameDiscriminator.checkStrike(computer, player) != 0 &&
                gameDiscriminator.checkBall(computer, player) != 0;
    }

    private void strikePrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        System.out.println(gameDiscriminator.checkStrike(computer, player) + "스트라이크");
    }

    private void ballPrint(List<Integer> computer, List<Integer> player, GameDiscriminator gameDiscriminator) {
        System.out.println(gameDiscriminator.checkBall(computer, player) + "볼");
    }
}
