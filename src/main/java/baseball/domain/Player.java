package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public final List<Integer> player;

    public Player(List<Integer> player) {
        this.player = player;
    }

    public static List<Integer> generatePlayerNumbers(String input){
        List<Integer> playerNumbers = new ArrayList<>();

        for (String number : input.split("")){
            playerNumbers.add(Integer.parseInt(number));
        }

        return playerNumbers;
    }
}
