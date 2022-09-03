import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Merge Sort");
        System.out.println("===========================");
        doMergeSort();

        System.out.println();

        System.out.println("===========================");
        System.out.println("Karatsuba Multiplicaiton");
        System.out.println("===========================");
        doKaratsuba();
    }

    public static void doMergeSort() {
        System.out.println("Integers");

        int[] intArr = new int[] {5,4,1,8,7,2,6,3,7};
        
        List<Integer> intUnsortedList = new ArrayList<>();
        for (Integer i : intArr) {
            intUnsortedList.add(i);
        }
        
        System.out.println("Unsorted List:\t" + intUnsortedList);
        List<Integer> intSortedList = MergeSort.mergeSort(intUnsortedList);
        System.out.println("Sorted List:\t" + intSortedList);


        System.out.println("Strings");
        
        String[] strArr = new String[] {"cat", "bat", "abc", "def", "elf", "car", "bar", "bet", "eat"};
        
        List<String> strUnsortedList = new ArrayList<>();
        for (String i : strArr) {
            strUnsortedList.add(i);
        }
        
        System.out.println("Unsorted List:\t" + strUnsortedList);
        List<String> strSortedList = MergeSort.mergeSort(strUnsortedList);
        System.out.println("Sorted List:\t" + strSortedList);
    }

    public static void doKaratsuba() {
        long x = 5678;
        long y = 1234;
        System.out.println("Standard:\t" + x + " x " + y + " = " + x*y);
        long karatsuba = Karatsuba.karatsuba(x, y);
        System.out.println("Karatsuba:\t" + x + " x " + y + " = " + karatsuba);
        x = 9563258;
        y = 6598753;
        System.out.println("Standard:\t" + x + " x " + y + " = " + x*y);
        karatsuba = Karatsuba.karatsuba(x, y);
        System.out.println("Karatsuba:\t" + x + " x " + y + " = " + karatsuba);
    }
}
