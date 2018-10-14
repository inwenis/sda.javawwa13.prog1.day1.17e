import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1v2Test {
    @org.junit.jupiter.api.Test
    void main() {
        //arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        //act
        Exercise1v2.main(new String[]{"1", "2"});
        //assert
        assertEquals("The sum of 1 and 2 is 3", baos.toString().trim());
    }

    @org.junit.jupiter.api.Test
    void main2() {
        //arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        //act
        Exercise1v2.main(new String[]{"10", "5"});
        //assert
        assertEquals("The sum of 10 and 5 is 15", baos.toString().trim());
    }

}