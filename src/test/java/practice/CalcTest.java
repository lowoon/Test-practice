package practice;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    Calculator calculator;
    String numFilePath;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
        this.numFilePath = getClass().getClassLoader().getResource("numbers.txt").getPath();
    }

    @Test
    void sumOfNumbers() throws IOException {
        assertThat(calculator.calcSum(numFilePath)).isEqualTo(10);
    }

    @Test
    void multiplyOfNumbers() throws IOException {
        assertThat(calculator.calcMultiply(numFilePath)).isEqualTo(24);
    }
}
