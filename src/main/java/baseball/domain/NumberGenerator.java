package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public final class NumberGenerator {

    public static List<Integer> generateComputerNumbers(){
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = generateRandomNumber();

            checkHasNumberAndAddNumber(computer, randomNumber);
        }
        return computer;
    }

    private static int generateRandomNumber(){
        return Randoms.pickNumberInRange(1, 9);
    }

    private static void checkHasNumberAndAddNumber(List<Integer> computer, int number){
        if (!computer.contains(number)){
            computer.add(number);
        }
    }
}



