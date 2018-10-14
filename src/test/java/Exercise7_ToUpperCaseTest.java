import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7_ToUpperCaseTest {
    @ParameterizedTest
    @MethodSource("inputProvider")
    void toUpperCase(String expected, String input) {
        assertEquals(expected, Exercise7_ToUpperCase.toUpperCase(input));
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("TEST", "test"),
                Arguments.of("TEST TEST", "test test"),
                Arguments.of("XXX", "xxx"),
                Arguments.of("HELLO?", "hello?")
        );
    }
}