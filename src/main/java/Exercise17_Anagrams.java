public class Exercise17_Anagrams {
    public static void main(String[] args) {
        System.out.println(areAnagrams("asdf", "asdf"));
        System.out.println(areAnagrams("cat", "tac"));
        System.out.println(areAnagrams("dog", "god"));
        System.out.println(areAnagrams("whatever", "god"));
        System.out.println(areAnagrams("here", "we"));
    }

    private static boolean areAnagrams(String wordA, String wordB) {
        String sub1 = Exercise16_StringCalculator.StringCalculator.sub(wordA, wordB);
        String sub2 = Exercise16_StringCalculator.StringCalculator.sub(wordB, wordA);
        return sub1.equals("") && sub2.equals("");
    }
}
