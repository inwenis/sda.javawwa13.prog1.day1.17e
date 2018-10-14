public class Exercise3_Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(" + 0 + ") = " + factorial(0));
        System.out.println("factorial(" + 1 + ") = " + factorial(1));
        System.out.println("factorial(" + 2 + ") = " + factorial(2));
        System.out.println("factorial(" + 3 + ") = " + factorial(3));
        System.out.println("factorial(" + 4 + ") = " + factorial(4));
        System.out.println("factorial(" + 5 + ") = " + factorial(5));
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
