import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise3_Factorial_Test {
    @ParameterizedTest
    @CsvSource({ "0, 1", "1, 1", "2, 2", "3, 6", "10, 3628800"})
    void factorial(int n, int expected) {
        //act
        int result = Exercise3_Factorial.factorial(n);

        //assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "0, 1", "1, 1", "2, 2", "3, 6", "10, 3628800"})
    void factorial_recursive(int n, int expected) {
        //act
        int result = Exercise3_Factorial.factorial_recursive(n);

        //assert
        assertEquals(expected, result);
    }
}