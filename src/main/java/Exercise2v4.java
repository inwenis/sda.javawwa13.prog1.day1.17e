import java.util.stream.IntStream;

public class Exercise2v4 {
    public static void main(String args[]) {
        int sum = sum3And5Till(10);
        System.out.println(sum);
    }

    public static int sum3And5Till(int n) {
        int sum = IntStream.rangeClosed(1, n)
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .sum();
        return sum;
    }
}
