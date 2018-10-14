import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {
    @ParameterizedTest
    @CsvSource({ "1, 0", "3, 3", "10, 33", "12, 45"})
    void sum3And5Till(int n, int expected) {
        //act
        int result = Exercise2.sum3And5Till(n);

        //assert
        assertEquals(expected, result);
    }

}