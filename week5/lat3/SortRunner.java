package lat3;
import java.util.Arrays;

public class SortRunner {
    public static void runAll(int[] original) {
        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] quickArray = Arrays.copyOf(original, original.length);
        int[] insertionArray = Arrays.copyOf(original, original.length);
        int[] selectionArray = Arrays.copyOf(original, original.length);
        int[] mergeArray = Arrays.copyOf(original, original.length);

        System.out.println("\n====== Bubble Sort ======");
        SortAlgorithm.bubbleSort(bubbleArray);

        System.out.println("\n====== Quick Sort ======");
        SortAlgorithm.quickSort(quickArray, 0, quickArray.length - 1, new int[]{1});

        System.out.println("\n====== Insertion Sort ======");
        SortAlgorithm.insertionSort(insertionArray);

        System.out.println("\n====== Selection Sort ======");
        SortAlgorithm.selectionSort(selectionArray);

        System.out.println("\n====== Merge Sort ======");
        SortAlgorithm.mergeSort(mergeArray, new int[]{1});
    }
}
