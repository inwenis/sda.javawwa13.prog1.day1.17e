import java.util.Scanner;

public class Exercise4_ReverseString {
    public static void main(String[] args) {
        System.out.println("Some tests first:");
        System.out.println(reverse("this is a test"));
        System.out.println(reverse("I'm so good at java"));
        System.out.println(reverse("So good to be bad"));
        System.out.println(reverse("You know the rules"));
        System.out.println(reverse("And so do I"));

        System.out.println(reverse2("this is a test"));
        System.out.println(reverse2("I'm so good at java"));
        System.out.println(reverse2("So good to be bad"));
        System.out.println(reverse2("You know the rules"));
        System.out.println(reverse2("And so do I"));

        System.out.println();
        System.out.println("OK, now give me a line and I'll reverse it");

        Scanner scanner = new Scanner(System.in);
        String toBeReversed = scanner.nextLine();
        System.out.println(reverse(toBeReversed));
        System.out.println(reverse2(toBeReversed));
    }

    public static String reverse(String input) {
        int length = input.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[length - i - 1] = input.charAt(i);
        }
        return new String(reversed);
    }

    public static String reverse2(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}
