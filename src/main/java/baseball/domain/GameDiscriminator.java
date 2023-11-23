package baseball.domain;

import java.util.stream.IntStream;

public class GameDiscriminator {
    public int totalCount(Computer computer, Player player){
        return IntStream.range(0, computer.size())
                .filter(i -> computer.contains(player.get(i)))
                .map(i -> 1)
                .sum();
    }

    public int checkStrike(Computer computer, Player player){
        return IntStream.range(0, computer.size())
                .filter(i -> player.get(i) == computer.get(i))
                .map(i -> 1)
                .sum();
    }

    public int checkBall(Computer computer, Player player){
        return totalCount(computer, player) - checkStrike(computer, player);
    }

    public boolean checkNotThing(Computer computer, Player player){
        return totalCount(computer, player) == 0;
    }
}
