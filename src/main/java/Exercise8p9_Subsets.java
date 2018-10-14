import java.util.*;

public class Exercise8p9_Subsets {
    public static void main(String[] args) {
        findClosestSubSet(new int[]{1,2});
        findClosestSubSet(new int[]{1,2,3});
        findClosestSubSet(new int[]{1,2,3,4});
        findClosestSubSet(new int[]{1,2,3,4,5});
        findClosestSubSet(new int[]{1,2,3,4,5,6});
        findClosestSubSet(new int[]{1,2,3,4,5,6,7});
        findClosestSubSet(new int[]{1,2,3,4,5,6,7,8});
        findClosestSubSet(new int[]{1,2,3,10,11,20,33,43,123});
        findClosestSubSet(new int[]{1,2,3,23,11,20,33,43,123,5,6,7});
        findClosestSubSet(new int[]{1,2,3,23,11,20,33,43,123,5,6,7});
        findClosestSubSet(new int[]{4,1,100,23,11,20,33,43,123,7});
    }

    private static void findClosestSubSet(int[] input) {
        List<List<Integer>> subsets = getSubSet(input);

        System.out.print("closest: ");

        List<Integer> closest = subsets
                .stream()
                .sorted(Comparator.comparingInt(x -> Math.abs(10 - x.stream().mapToInt(y -> y).sum())))
                .findFirst()
                .get();
        System.out.print(closest.stream().mapToInt(y -> y).sum());
        System.out.print(" ");
        System.out.println(printSet(closest));
    }

    private static String printSet(List<Integer> subset) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : subset) {
            sb.append(i);
            sb.append(" ,");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    private static List<List<Integer>> getSubSet(int[] elements) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        double pow = Math.pow(2, elements.length);
        for (int i = 1; i <= pow - 1; i++) {

            List<Integer> currentSubSet = new ArrayList<>();
            for (int k = 0; k < elements.length; k++) {
                if((i >> k) % 2 == 1) {
                    currentSubSet.add(elements[k]);
                }
            }
            allSubsets.add(currentSubSet);
        }

        return allSubsets;
    }
}
