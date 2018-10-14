import java.util.ArrayList;
import java.util.List;

public class Exercise2v3 {
    public static void main(String args[]) {
        int sum = sum3And5Till(10);
        System.out.print(sum);
    }

    public static int sum3And5Till(int n) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= n ; i++) {
            if(i % 3 == 0) {
                numbers.add(i);
            }
            if(i % 5 == 0) {
                numbers.add(i);
            }
        }
        int sum = numbers.stream().mapToInt(x -> x).sum();
        return sum;
    }
}
