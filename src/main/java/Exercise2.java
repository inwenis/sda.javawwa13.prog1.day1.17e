public class Exercise2 {
    public static void main(String args[]) {
        int sum = sum3And5Till();
        System.out.print(sum);
    }

    public static int sum3And5Till() {
        int sum = 0;
        for(int i = 0; i < 10 ; i++) {
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
