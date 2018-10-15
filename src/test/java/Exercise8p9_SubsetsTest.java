import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise8p9_SubsetsTest {
    @ParameterizedTest
    @MethodSource("inputProvider")
    void getPowerSet(List<List<Integer>> expected, int[] input) {
        assertEquals(expected, Exercise8p9_Subsets.getPowerSet(input));
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(Arrays.asList(1)), new int[]{1}),
                Arguments.of(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(1, 2)), new int[]{1, 2}),
                Arguments.of(Arrays.asList(
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList(1, 2),
                        Arrays.asList(3),
                        Arrays.asList(1, 3),
                        Arrays.asList(2, 3),
                        Arrays.asList(1, 2, 3)),
                        new int[]{1, 2, 3})
        );
    }
}