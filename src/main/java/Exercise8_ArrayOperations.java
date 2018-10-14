import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Exercise8_ArrayOperations {
    public static void main(String[] args) {

        // p1
        System.out.println("all numbers as given input:");
        for (String numberAsText : args) {
            System.out.print(numberAsText + " ");
        }
        System.out.println();

        // p2
        System.out.println("all numbers reversed:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[args.length - i - 1] + " ");
        }
        System.out.println();

        // p3
        System.out.println("all numbers on odd positions:");
        for (int i = 0; i < args.length; i++) {
            if(i % 2 == 1) {
                System.out.print(args[i] + " ");
            }
        }
        System.out.println();

        // p4
        System.out.println("all numbers dividable by 3:");
        for (int i = 0; i < args.length; i++) {
            int parsedInt = Integer.parseInt(args[i]);
            if(parsedInt % 3 == 0) {
                System.out.print(args[i] + " ");
            }
        }
        System.out.println();

        // p5
        System.out.println("sum of all numbers");
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int parsedInt = Integer.parseInt(args[i]);
            sum += parsedInt;
        }
        System.out.println(sum);
        // using streams:
        // int sum = Arrays.stream(args).mapToInt(x -> Integer.parseInt(x)).sum();


        // p6
        System.out.println("sum of first 4 numbers");
        int sumOfFirst4 = 0;
        for (int i = 0; i < 4; i++) {
            int parsedInt = Integer.parseInt(args[i]);
            sumOfFirst4 += parsedInt;
        }
        System.out.println(sumOfFirst4);
        // using streams:
        // int sum4 = Arrays.stream(args).limit(4).mapToInt(x -> Integer.parseInt(x)).sum();

        // p7
        System.out.println("sum of last 5 numbers greater than 2");
        int sumOfLast5 = 0;
        int count = 0;
        for (int i = args.length - 1; i > 0; i--) { // reverse loop
            int number = Integer.parseInt(args[i]);
            if(number > 2) {
                sumOfLast5 += number;
                count++;
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println(sumOfLast5);
        // using streams:
        int sum5 = Arrays.stream(args)
                .map(x -> Integer.parseInt(x))
                .filter(x -> x > 2)
                .sorted(Collections.reverseOrder())
                .limit(5)
                .mapToInt(x -> Integer.parseInt(String.valueOf(x)))
                .sum();
        System.out.println(sum5);

        // p8
        System.out.println("Sum numbers from beginning till they reach 10");
        int sum8 = 0;
        for (String s : args) {
            int parsed = Integer.parseInt(s);
            sum8 += parsed;
            if(sum8 >= 10) {
                break;
            }
        }
        System.out.println(sum8);
    }
}
