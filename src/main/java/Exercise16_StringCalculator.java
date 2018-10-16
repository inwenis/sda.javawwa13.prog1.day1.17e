public class Exercise16_StringCalculator {
    public static void main(String[] args) {
        System.out.println("Some tests first");
        System.out.println("add");
        System.out.println(StringCalculator.add("asdf", "xxx"));
        System.out.println("sub");
        System.out.println(StringCalculator.sub("asdf", "xxx"));
        System.out.println(StringCalculator.sub("asdf", "aa"));
        System.out.println(StringCalculator.sub("asdf", "df"));
        System.out.println("add_m");
        System.out.println(StringCalculator.sub_m("ala", "a"));
        System.out.println(StringCalculator.sub_m("ala", "bba"));
        System.out.println(StringCalculator.sub_m("ala", "xxx"));
        System.out.println("uniq");
        System.out.println(StringCalculator.uniq("ala"));
        System.out.println(StringCalculator.uniq("xxx"));
        System.out.println(StringCalculator.uniq("majtek"));
        System.out.println("inter");
        System.out.println(StringCalculator.inter("ala", "aaa"));
        System.out.println(StringCalculator.inter("kota", "ole"));
        System.out.println(StringCalculator.inter("abcdefg", "cdefghij"));
        System.out.println("dim_d");
        System.out.println(StringCalculator.dim_d("ala", "aaa"));
        System.out.println(StringCalculator.dim_d("ala", "xxx"));
        System.out.println(StringCalculator.dim_d("abcdefg", "defghijkl"));
    }

    static class StringCalculator {
        public static String add(String left, String right) {
            return left + right;
        }

        public static String sub(String left, String right) {
            char[] chars = right.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                String character = String.valueOf(chars[i]);
                if(left.contains(character)) {
                    left = left.replaceFirst(character, "");
                }
            }
            return left;
        }

        public static String sub_m(String left, String right) {
            return sub(right, left);
        }

        public static String uniq(String text) {
            String result = "";
            while(text.length() != 0) {
                String character = String.valueOf(text.charAt(0));
                result += character;
                text = text.replaceAll(character, "");
            }
            return result;
        }

        public static String inter(String left, String right) {
            String result = "";
            while(left.length() != 0) {
                String character = String.valueOf(left.charAt(0));
                if(right.contains(character)) {
                    result += character;
                    left = left.replaceFirst(character, "");
                    right = right.replaceFirst(character, "");
                } else {
                    left = left.replaceFirst(character, "");
                }
            }
            return result;
        }

        public static String dim_d(String left, String right) {
            String uniqueInLeft = sub(left, right);
            String uniqueInRight = sub(right, left);
            return add(uniqueInLeft, uniqueInRight);
        }
    }
}
