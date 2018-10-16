public class Exercise12_Binary {
    public static void main(String[] args) {
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
        System.out.println(toBinary(5));
        System.out.println(toBinary(2147483647));
    }

    public static String toBinary(int number) {
        String result = "";
        for (int i = 0; i < 32; i++) {
            if(number % 2 == 1) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            number = number/2;
        }

        return result;
    }
}
