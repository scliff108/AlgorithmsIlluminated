import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     * Recursivelly calls itself to sort a list of Integers.
     * 
     * @param list of Integers
     * @return
     */
    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        if (list.size() == 2) {
            if (list.get(0) > list.get(1)) {
                int temp = list.get(0);
                list.set(0, list.get(1));
                list.set(1, temp);
            }
            return list;
        }
        
        int n = list.size() / 2;
        List<Integer> a = mergeSort(list.subList(0, n));
        List<Integer> b = mergeSort(list.subList(n, list.size()));

        return merge(a, b);
    }

    /**
     * Merges two sorted lists.
     * 
     * @param listA a sorted list.
     * @param listB a sorted list.
     * @return listA and listB merged in sorted order.
     */
    public static List<Integer> merge(List<Integer> listA, List<Integer> listB) {
        List<Integer> merged = new ArrayList<>();
        int lengthA = listA.size(), lengthB = listB.size();
        int n = lengthA + lengthB;
        int indexA = 0, indexB = 0;

        for (int i = 0; i < n; i++) {
            // Short circuit when at the end of one of the lists
            if (indexA == lengthA) {
                merged.addAll(listB.subList(indexB, lengthB));
                return merged;
            } else if (indexB == lengthB) {
                merged.addAll(listA.subList(indexA, lengthA));
                return merged;
            }

            // Add the next lowest item
            if (listA.get(indexA) < listB.get(indexB)) {
                merged.add(listA.get(indexA++));
            } else {
                merged.add(listB.get(indexB++));
            }
        }
        return merged;
    }

}