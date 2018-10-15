import java.util.*;

public class Exercise8p9_Subsets {
    public static void main(String[] args) {
        findClosestSubSet(10, new int[]{1,2});
        findClosestSubSet(10, new int[]{1,2,3});
        findClosestSubSet(10, new int[]{1,2,3,4});
        findClosestSubSet(10, new int[]{1,2,3,4,5});
        findClosestSubSet(10, new int[]{1,2,3,4,5,6});
        findClosestSubSet(10, new int[]{1,2,3,4,5,6,7});
        findClosestSubSet(10, new int[]{1,2,3,4,5,6,7,8});
        findClosestSubSet(10, new int[]{1,2,3,10,11,20,33,43,123});
        findClosestSubSet(10, new int[]{1,2,3,23,11,20,33,43,123,5,6,7});
        findClosestSubSet(37, new int[]{1,2,3,23,11,20,33,43,123,5,6,7});
        findClosestSubSet(23, new int[]{4,1,100,23,11,20,33,43,123,7});
    }

    private static void findClosestSubSet(int n, int[] input) {
        List<List<Integer>> subsets = getPowerSet(input);
        List<Integer> closest = subsets
                .stream()
                .sorted(Comparator.comparingInt(x -> Math.abs(n - x.stream().mapToInt(y -> y).sum())))
                .findFirst()
                .get();
        int sumOfClosestSubset = closest.stream().mapToInt(y -> y).sum();
        System.out.print("n=" + n + " sum(subset)=" + sumOfClosestSubset);
        System.out.println(" subset=" + setToString(closest));
    }

    private static String setToString(List<Integer> subset) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : subset) {
            sb.append(i);
            sb.append(", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    private static List<List<Integer>> getPowerSet(int[] elements) {
        List<List<Integer>> powerSet = new ArrayList<>();
        double powerSetCount = Math.pow(2, elements.length) - 1;
        for (int i = 1; i <= powerSetCount; i++) {

            List<Integer> currentSubSet = new ArrayList<>();
            for (int k = 0; k < elements.length; k++) {
                if((i >> k) % 2 == 1) {
                    currentSubSet.add(elements[k]);
                }
            }
            powerSet.add(currentSubSet);
        }

        return powerSet;
    }
}
