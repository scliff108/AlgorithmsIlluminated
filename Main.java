import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Merge Sort");
        doMergeSort();
    }

    public static void doMergeSort() {
        int[] arr = new int[] {5,4,1,8,7,2,6,3,7};
        
        List<Integer> unsortedList = new ArrayList<>();
        for (Integer i : arr) {
            unsortedList.add(i);
        }
        
        System.out.println("Unsorted List:\t" + unsortedList);
        List<Integer> sortedList = MergeSort.mergeSort(unsortedList);
        System.out.println("Sorted List:\t" + sortedList);

    }
}
