public class Exercise2v2 {
    public static void main(String args[]) {
        int sum = sum3And5Till(10);
        System.out.print(sum);
    }

    public static int sum3And5Till(int n) {
        int sum = 0;
        int multiplesOf3 = 0;
        int i = 0;
        while (multiplesOf3 <= n) {
            sum += multiplesOf3;
            i++;
            multiplesOf3 = i * 3;
        }

        i = 0;
        int multiplesOf5 = 0;
        while (multiplesOf5 <= n) {
            sum += multiplesOf5;
            i++;
            multiplesOf5 = i * 5;
        }

        return sum;
    }
}
