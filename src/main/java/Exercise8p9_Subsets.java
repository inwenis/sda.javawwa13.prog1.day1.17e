import java.util.*;
import java.util.stream.Collectors;

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
    }

    private static void findClosestSubSet(int[] input) {
        List<int[]> subsets = getSubSet(input);

        System.out.print("closest: ");

        int[] closest = subsets
                .stream()
                .sorted(Comparator.comparingInt(x -> Math.abs(10 - Arrays.stream(x).sum())))
                .findFirst()
                .get();
        printSet(closest);
    }

    private static void printSet(int[] subset) {
        System.out.print("[");
        for (int i : subset) {
            System.out.print(i + ", ");
        }
        System.out.println("]");

    }

    private static List<int[]> getSubSet(int[] elements) {
        List<int[]> subsets = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            subsets.add(new int[]{elements[i]});
        }

        for (int i = 0; i < subsets.size(); i++) {
            int[] currentSubSet = subsets.get(i);
            List<Integer> elementsAsList = Arrays.stream(elements)
                    .map(x -> (Integer) x)
                    .boxed()
                    .collect(Collectors.toList());

            //remove all items already in subset
            removeAll(elementsAsList, currentSubSet);

            //create new subsets by adding one element

            for (Integer element : elementsAsList){
                List<Integer> currentSubSetAsList = toList(currentSubSet);
                currentSubSetAsList.add(element);
                int[] newSubSet = currentSubSetAsList.stream().mapToInt(x -> x).toArray();
                if(!contains(subsets, newSubSet)) {
                    subsets.add(newSubSet);
                }
            }
        }
        return subsets;
    }

    private static boolean contains(List<int[]> subsets, int[] newSubSet) {
        return subsets.stream().anyMatch(x -> areSame(newSubSet, x));
    }

    private static boolean areSame(int[] a, int[] b) {
        List<Integer> aList = toList(a);
        List<Integer> bList = toList(b);
        for (Integer i : aList) {
            if(!bList.remove(i)) {
                return false;
            }
        }
        return bList.size() == 0;
    }

    private static List<Integer> toList(int[] currentSubSet) {
        return Arrays.stream(currentSubSet).boxed().collect(Collectors.toList());
    }

    private static void removeAll(List<Integer> elementsAsList, int[] currentSubSet) {
        elementsAsList.removeAll(Arrays.stream(currentSubSet).boxed().collect(Collectors.toList()));
    }
}
