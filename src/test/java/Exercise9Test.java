import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise9Test {
    @ParameterizedTest
    @MethodSource("inputProvider")
    void asteriskSquare(String expected, int length) {
        assertEquals(expected, Exercise9.asteriskSquare(length));
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    void asteriskSquare2(String expected, int length) {
        assertEquals(expected, Exercise9.asteriskSquare2(length));

    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    void asteriskSquare3(String expected, int length) {
        assertEquals(expected, Exercise9.asteriskSquare3(length));
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("**\n**", 2),
                Arguments.of("***\n* *\n***", 3),
                Arguments.of("****\n*  *\n*  *\n****", 4)
        );
    }
}