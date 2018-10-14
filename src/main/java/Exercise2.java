public class Exercise2 {
    public static void main(String args[]) {
        int sum = sum3And5Till(5);
        System.out.print(sum);
    }

    public static int sum3And5Till(int n) {
        int sum = 0;
        for(int i = 0; i <= n ; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
            if(i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
