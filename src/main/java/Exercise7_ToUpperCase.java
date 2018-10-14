import java.util.Scanner;

public class Exercise7_ToUpperCase {
    public static void main(String[] args) {
        System.out.println("Some tests:");
        test("tekst");
        test("to jest test");
        test("co tam słychać");
        test("whattttttts up?");

        System.out.println();
        System.out.println("Give me some text and I'll upper case it:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(toUpperCase(input));

        // another solution:
        // I didn't know String class has a toUpperCase() method :)
        System.out.println(input.toUpperCase());
    }

    private static void test(String input) {
        System.out.println("input: " + input);
        System.out.println("to upper case: " + toUpperCase(input));
    }

    public static String toUpperCase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
