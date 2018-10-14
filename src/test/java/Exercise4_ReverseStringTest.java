import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4_ReverseStringTest {
    @ParameterizedTest
    @MethodSource("stringsProvider")
    void reverse(String input, String expected) {
        assertEquals(expected, Exercise4_ReverseString.reverse(input));
    }

    @ParameterizedTest
    @MethodSource("stringsProvider")
    void reverse2(String input, String expected) {
        assertEquals(expected, Exercise4_ReverseString.reverse2(input));
    }

    private static Stream<Arguments> stringsProvider() {
        return Stream.of(
                Arguments.of("ab", "ba"),
                Arguments.of("xXX", "XXx"),
                Arguments.of("just a test", "tset a tsuj")
        );
    }
}