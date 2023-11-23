package baseball.util;

import java.util.List;
import java.util.Set;

public final class Validator {
    private Validator() {
    }

    public static void validateNotNumber(String input){
        if (!input.matches("\\d+")){
            throw new IllegalArgumentException();
        }
    }
    public static void validateCheckNumberSize(List<Integer> player){
        if (player.size() != GlobalConstant.MAX_SIZE){
            throw new IllegalArgumentException();
        }
    }

    public static void duplicatedNumber(List<Integer> player){
        long distinct = player.stream()
                .mapToInt(Integer::intValue)
                .distinct()
                .count();

        if (distinct != player.size()){
            throw new IllegalArgumentException();
        }
    }
}
