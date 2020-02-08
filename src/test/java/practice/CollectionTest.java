package practice;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CollectionTest {
    @Test
    @DisplayName("arrayList() : use arrayList method")
    void arrayList() {
        ArrayList numbers = new ArrayList<>();
        String first = "first";
        numbers.add(first);
        numbers.add("second");

        assertThat(numbers.add("third")).isTrue();
        assertThat(numbers.size()).isEqualTo(3);
        assertThat(numbers.get(0)).isEqualTo(first);
        assertThat(numbers.contains(first)).isTrue();
        assertThat(numbers.remove(0)).isEqualTo(first);
    }
}
