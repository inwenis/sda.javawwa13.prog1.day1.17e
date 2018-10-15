public class Exercise11_Fibonacci {
    public static void main(String[] args) {
        int current = 0;
        int previous;
        for (int i = 0; i < 100; i++) {
            previous = current;
            current = fibonacci_iterative(i);
            double ratio = (double) previous / current;
            String format = String.format("|%3d|%20d|%10f|", i, current, ratio);
            System.out.println(format);
        }
    }

    public static int fibonacci(int i) {
        if(i == 0) {
            return 1;
        } else if(i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    public static int fibonacci_iterative(int i) {
        if (i == 0) {
            return 1;
        } else if(i == 1) {
            return 1;
        }
        else {
            int a = 1;
            int b = 1;
            int temp;
            for (int j = 0; j < i; j++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
