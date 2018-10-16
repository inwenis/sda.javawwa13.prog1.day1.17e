import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise12_BinaryTest {
    @ParameterizedTest
    @MethodSource("inputProvider")
    void toBinary(String expected, int number) {
        assertEquals(expected, Exercise12_Binary.toBinary(number));
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("00000000000000000000000000000001", 1),
                Arguments.of("00000000000000000000000000000010", 2),
                Arguments.of("00000000000000000000000000000011", 3),
                Arguments.of("00000000000000000000000000001010", 10)
        );
    }
}