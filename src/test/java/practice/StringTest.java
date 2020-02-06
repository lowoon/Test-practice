package practice;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
    @Test
    @DisplayName("#isEmpty() : return true if String is empty")
    void isEmpty() {
        String emptyString = "";
        String spaceString = " ";

        assertThat(emptyString.isEmpty()).isTrue();
        assertThat(spaceString.isEmpty()).isFalse();
    }
}