public class Exercise11_Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(fibonacci(i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(fibonacci_iterative(i));
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
