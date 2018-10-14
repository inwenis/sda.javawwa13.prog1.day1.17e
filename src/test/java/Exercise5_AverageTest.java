import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5_AverageTest {
    @ParameterizedTest
    @MethodSource("inputProvider")
    void average(int[] numbers, double expected) {
        assertEquals(expected, Exercise5_Average.average(numbers));
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    void average2(int[] numbers, double expected) {
        assertEquals(expected, Exercise5_Average.average2(numbers));
    }

    @ParameterizedTest
    @MethodSource("inputProvider")
    void averageWithStreams(int[] numbers, double expected) {
        assertEquals(expected, Exercise5_Average.averageWithStreams(numbers));
    }


    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2}, 1.5),
                Arguments.of(new int[]{1}, 1.0),
                // Arguments.of(new int[]{}, 0.0), // what should average return for empty input? I don't know
                Arguments.of(new int[]{1,10,100}, 37.0)
        );
    }
}