package baseball.view;

import baseball.domain.Computer;
import baseball.domain.GameDiscriminator;
import baseball.domain.Player;

import static baseball.util.GlobalConstant.NO_BALL;
import static baseball.util.GlobalConstant.NO_STRIKE;

public final class OutputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String GAME_END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private OutputView() {
    }

    public static void gameStatus(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        if (!gameDiscriminator.checkNotThing(computer, player)){
            checkStrikePrint(computer, player, gameDiscriminator);
            checkBallPrint(computer, player, gameDiscriminator);
            strikeAndBallPrint(computer, player, gameDiscriminator);
        }
        notThingPrint(computer, player, gameDiscriminator);
    }

    private static void checkStrikePrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkBall(computer, player) == NO_BALL) {
            strikePrint(computer, player, gameDiscriminator);
        }
    }

    private static void checkBallPrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkStrike(computer, player) == NO_STRIKE) {
            ballPrint(computer, player, gameDiscriminator);
        }
    }

    private static void notThingPrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        if (gameDiscriminator.checkNotThing(computer, player)) {
            System.out.println("낫싱");
        }
    }

    private static void strikeAndBallPrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        if (checkStrikeAndBall(computer, player, gameDiscriminator)) {
            System.out.println(gameDiscriminator.checkBall(computer, player) + "볼" + " " +
                    gameDiscriminator.checkStrike(computer, player) + "스트라이크");
        }
    }

    private static boolean checkStrikeAndBall(Computer computer, Player player,
                                       GameDiscriminator gameDiscriminator) {
        return gameDiscriminator.checkStrike(computer, player) != NO_STRIKE &&
                gameDiscriminator.checkBall(computer, player) != NO_BALL;
    }

    private static void strikePrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        System.out.println(gameDiscriminator.checkStrike(computer, player) + "스트라이크");
    }

    private static void ballPrint(Computer computer, Player player, GameDiscriminator gameDiscriminator) {
        System.out.println(gameDiscriminator.checkBall(computer, player) + "볼");
    }
}
