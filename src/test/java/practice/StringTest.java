package practice;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    @DisplayName("lastIndexOf() : return last index of the target word")
    void lastIndexOf() {
        String randomAlpha = "abamnbn";
        char target = 'b';
        int tatgetIndex = 5;

        assertThat(randomAlpha.lastIndexOf(target)).isEqualTo(tatgetIndex);
    }

    @Test
    @DisplayName("문자열_길이_구하기() : return the length of String")
    void 문자열_길이_구하기() {
        String name = "lowoon";
        int size = 6;

        assertThat(name.length()).isEqualTo(size);
    }

    @Test
    @DisplayName("문자열_더하기() : return result of added String")
    void 문자열_더하기() {
        String name = "lowoon";
        String greeting = "Hi!";

        assertThat(greeting + " " + name).isEqualTo("Hi! lowoon");
    }

    @Test
    void 문자열을_문자_단위로_출력() {
        String name = "lowoon";
        char[] words = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            assertThat(words[i]).isEqualTo(name.charAt(i));
        }
    }
}