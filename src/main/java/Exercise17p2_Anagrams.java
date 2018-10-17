import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise17p2_Anagrams {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("wordlist.txt");
        Scanner scanner = new Scanner(file);
        List<String> words = new ArrayList<>();
        while(scanner.hasNextLine()) { // when reading from file we can use .hasNextLine() without blocking
            words.add(scanner.nextLine());
        }
        for (int i = 0; i < words.size(); i++) {
            String wordA = words.get(i);
            List<String> anagrams = new ArrayList<>();
            for (int j = i + 1; j < words.size(); j++) {
                String wordB = words.get(j);
                if(areAnagrams(wordA, wordB)) {
                    anagrams.add(wordB);
                }
            }
            if(anagrams.size() > 0) {
                System.out.print(wordA + " ");
                for (String word : anagrams) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
        }
    }

    private static boolean areAnagrams(String wordA, String wordB) {
        String sub1 = Exercise16_StringCalculator.StringCalculator.sub(wordA, wordB);
        String sub2 = Exercise16_StringCalculator.StringCalculator.sub(wordB, wordA);
        return sub1.equals("") && sub2.equals("");
    }
}
