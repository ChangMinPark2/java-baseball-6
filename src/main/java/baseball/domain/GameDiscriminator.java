package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class GameDiscriminator {
          /*
                return IntStream.range(0, computer.size())
                .filter(i -> computer.contains(user.get(i)))
                .map(i -> 1)
                .sum();
         */

    public int totalCount(List<Integer> computer, List<Integer> user){
        return (int) computer.stream()
                .filter(user::contains)
                .count();
    }

    public int checkStrike(List<Integer> computer, List<Integer> user){
        return IntStream.range(0, computer.size())
                .filter(i -> user.get(i).equals(computer.get(i)))
                .map(i -> 1)
                .sum();
    }

    public int checkBall(List<Integer> computer, List<Integer> user){

        return totalCount(computer, user) - checkStrike(computer, user);
    }

    public boolean checkNotThing(List<Integer> computer, List<Integer> user){
        return totalCount(computer, user) == 0;
    }
}
