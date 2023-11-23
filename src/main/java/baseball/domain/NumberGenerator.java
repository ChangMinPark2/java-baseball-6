package baseball.domain;

import baseball.util.GlobalConstant;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.util.GlobalConstant.*;

public final class NumberGenerator {
    public static List<Integer> generateComputerNumbers() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < MAX_SIZE) {
            int randomNumber = generateRandomNumber();

            checkHasNumberAndAddNumber(computer, randomNumber);
        }
        return computer;
    }

    private static int generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }

    private static void checkHasNumberAndAddNumber(List<Integer> computer, int number) {
        if (!computer.contains(number)) {
            computer.add(number);
        }
    }
}



