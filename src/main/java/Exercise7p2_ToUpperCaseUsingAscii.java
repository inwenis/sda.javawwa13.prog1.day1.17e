import java.util.Scanner;

public class Exercise7p2_ToUpperCaseUsingAscii {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Give me some text and I'll upper case it:");
        System.out.println("Input 'q!' to exit");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if(input.equals("q!")) {
                break;
            }
            System.out.println(toUpperUsingAsciiCodes(input));
        }
        System.out.println("exiting...");
    }

    private static String toUpperUsingAsciiCodes(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32); // 32 = 'a' - 'A'
            }
        }
        return new String(chars);
    }
}
