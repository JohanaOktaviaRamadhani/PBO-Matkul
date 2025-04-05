package lat3;
import java.util.Arrays;

public class SortAlgorithm {
    public static void bubbleSort(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high, int[] count) {
        if (low < high) {
            int pi = partition(arr, low, high, count);
            quickSort(arr, low, pi - 1, count);
            quickSort(arr, pi + 1, high, count);
        }
    }

    private static int partition(int[] arr, int low, int high, int[] count) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                System.out.println("Iterasi " + count[0]++ + ": " + Arrays.toString(arr));
            }
        }
        swap(arr, i + 1, high);
        System.out.println("Iterasi " + count[0]++ + ": " + Arrays.toString(arr));
        return i + 1;
    }

    public static void insertionSort(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
        }
    }

    public static void selectionSort(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (i != minIdx) {
                swap(arr, i, minIdx);
                System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
            }
        }
    }

    public static void mergeSort(int[] arr, int[] count) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left, count);
            mergeSort(right, count);

            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }

            System.out.println("Iterasi " + count[0]++ + ": " + Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
