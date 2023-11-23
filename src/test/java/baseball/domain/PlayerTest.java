package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PlayerTest {

    @DisplayName("숫자가 3자리가 아닌 경우에 대한 예외처리 - IllegalArgumentException")
    @Test
    void validateCheckNumberSize_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Player(Arrays.asList(1,2,3,4)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("중복된 숫자에 대한 예외처리 - IllegalArgumentException")
    @Test
    void duplicatedNumber_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Player(Arrays.asList(1,2,2)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("문자를 입력 했을 경우에 대한 예외 처리 - IllegalArgumentException")
    @Test
    void validateNotNumber_IllegalArgumentException() {
        // When & Then
        assertThatThrownBy(() -> new Player(PlayerNumberGenerator.inputNumberGenerate("12")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
