package baseball.domain;

import baseball.util.Validator;

import java.util.Arrays;
import java.util.List;

import static baseball.util.GlobalConstant.SPLIT_DELIMITER;

public class PlayerNumberGenerator {
    public static List<Integer> inputNumberGenerate(String input) {
        Validator.validateNotNumber(input);
        return Arrays.stream(input.split(SPLIT_DELIMITER))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
    }
}
