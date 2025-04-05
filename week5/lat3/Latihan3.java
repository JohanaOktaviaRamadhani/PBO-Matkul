package lat3;
import java.util.Arrays;

public class Latihan3 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int count = 1;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high, int[] counter) {
        if (low < high) {
            int pi = partition(arr, low, high, counter);
            quickSort(arr, low, pi - 1, counter);
            quickSort(arr, pi + 1, high, counter);
        }
    }

    private static int partition(int[] arr, int low, int high, int[] counter) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                System.out.println("Iterasi " + counter[0]++ + ": " + Arrays.toString(arr));
            }
        }
        swap(arr, i + 1, high);
        System.out.println("Iterasi " + counter[0]++ + ": " + Arrays.toString(arr));
        return i + 1;
    }

    public static void insertionSort(int[] arr) {
        int count = 1;
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
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
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (i != min_idx) {
                swap(arr, i, min_idx);
                System.out.println("Iterasi " + count++ + ": " + Arrays.toString(arr));
            }
        }
    }

    public static void mergeSort(int[] arr, int[] counter) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left, counter);
            mergeSort(right, counter);

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

            System.out.println("Iterasi " + counter[0]++ + ": " + Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
