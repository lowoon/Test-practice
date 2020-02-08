package practice;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {
    private int numberOfClass = 14;
    private String question = "우아한 테크코스 백엔드 수강생은?";
    private String answer = numberOfClass + "명이다.";

    @Test
    @DisplayName("append() : return result String of append")
    void append() {
        assertThat(createMessage(numberOfClass)).isEqualTo(question + " " + answer);
    }

    private String createMessage(int numberOfClass) {
        StringBuilder sb = new StringBuilder();
        sb.append(question);
        sb.append(" ");
        sb.append(answer);
        return sb.toString();
    }
}
