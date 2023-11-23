package baseball.domain;

import java.util.List;

import static baseball.util.Validator.duplicatedNumber;
import static baseball.util.Validator.validateCheckNumberSize;

public class Player {
    private final List<Integer> player;

    public Player(List<Integer> player) {
        validateCheckNumberSize(player);
        duplicatedNumber(player);
        this.player = player;
    }

    public int get(int index) {
        return player.get(index);
    }
}
