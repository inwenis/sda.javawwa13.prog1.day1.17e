import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_Average {
    public static void main(String[] args) {
        System.out.println("average of 1, 3, 4 is " + average(new int[]{1, 3, 4}));
        System.out.println("average of 1, 3, 4 is " + average2(1, 3, 4));
        System.out.println("average of 1, 3, 4 is " + averageWithStreams(new int[]{1, 3, 4}));
        System.out.println();
        System.out.println("OK, now gimme some numbers separated by spaces and I'll average them");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsText = line.split(" ");
        int[] ints = new int[numbersAsText.length];
        for (int i = 0; i < numbersAsText.length; i++) {
            String numberAsText = numbersAsText[i];
            int parsed = Integer.parseInt(numberAsText);
            ints[i] = parsed;
        }
        // splitting, mapping to int could also be done using stream:
        // int[] ints = Arrays.stream(line.split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        System.out.println(average(ints));
    }

// this is the first version of my average function
//    public static double average(int a, int b) {
//        return (double) (a + b) / 2;
//    }

// this is the second version of my average function
//    public static double average(int a, int b, int c) {
//        return (double) (a + b + c) / 3;
//    }

// this is the third version of my average function
//    public static double average(int[] ints) {
//        int sum = 0;
//        for (int i = 0; i < ints.length; i++) {
//            sum += ints[i];
//        }
//        double average = (double) sum / ints.length;
//        return average;
//    }

    // this is the fourth version of my average function
    public static double average(int[] ints) {
        int sum = 0;
        for (int number : ints) {
            sum += number;
        }
        return (double) sum / ints.length;
    }

    // exactly the same as above but using the int... argument
    public static double average2(int... ints) {
        int sum = 0;
        for (int number : ints) {
            sum += number;
        }
        return (double) sum / ints.length;
    }

    public static double averageWithStreams(int[] ints) {
        return Arrays.stream(ints).average().getAsDouble();
    }
}
