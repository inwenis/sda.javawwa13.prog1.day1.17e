import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise17p1_Anagrams {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file);
        String wordA = scanner.nextLine();
        String wordB = scanner.nextLine();
        System.out.println(areAnagrams(wordA, wordB));
    }

    private static boolean areAnagrams(String wordA, String wordB) {
        String sub1 = Exercise16_StringCalculator.StringCalculator.sub(wordA, wordB);
        String sub2 = Exercise16_StringCalculator.StringCalculator.sub(wordB, wordA);
        return sub1.equals("") && sub2.equals("");
    }
}
