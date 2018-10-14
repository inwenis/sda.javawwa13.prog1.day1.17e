import java.util.Scanner;

public class Exercise7p1_ToUpperCase {
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
            System.out.println(input.toUpperCase());
        }
        System.out.println("exiting...");
    }
}
