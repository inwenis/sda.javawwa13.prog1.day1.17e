import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise17p2_Anagrams_faster {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("wordlist.txt");
        Scanner scanner = new Scanner(file);
        List<String> words = new ArrayList<>();
        while(scanner.hasNextLine()) { // when reading from file we can use .hasNextLine() without blocking
            words.add(scanner.nextLine());
        }

        Map<String, List<String>> dic = words
                .stream()
                .collect(Collectors.groupingBy(x -> sortString(x)));

        dic
                .keySet()
                .stream()
                .filter(x -> dic.get(x).size() > 1)
                //.filter(x -> dic.get(x).size() > 5) // uncomment this to print only long anagrams
                .map(x -> String.join(" ", dic.get(x)))
                .forEach(x -> System.out.println(x));

    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
