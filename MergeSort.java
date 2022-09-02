import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     * Recursivelly calls itself to sort a list of comparable elements.
     * 
     * @param list of comparable elements
     * @return
     */
    public static <T extends Comparable<T>> List<T> mergeSort(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }
        
        int n = list.size() / 2;
        List<T> a = mergeSort(list.subList(0, n));
        List<T> b = mergeSort(list.subList(n, list.size()));

        return merge(a, b);
    }

    /**
     * Merges two sorted lists.
     * 
     * @param listA a sorted list.
     * @param listB a sorted list.
     * @return listA and listB merged in sorted order.
     */
    public static <T extends Comparable<T>> List<T> merge(List<T> listA, List<T> listB) {
        List<T> merged = new ArrayList<>();
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
            if (listA.get(indexA).compareTo(listB.get(indexB)) < 0) {
                merged.add(listA.get(indexA++));
            } else {
                merged.add(listB.get(indexB++));
            }
        }
        return merged;
    }

}