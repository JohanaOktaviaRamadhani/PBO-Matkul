package lat3;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();
        String[] strNumbers = input.trim().split(" ");
        int[] numbers = Arrays.stream(strNumbers).mapToInt(Integer::parseInt).toArray();

        int[] bubbleArray = Arrays.copyOf(numbers, numbers.length);
        int[] quickArray = Arrays.copyOf(numbers, numbers.length);
        int[] insertionArray = Arrays.copyOf(numbers, numbers.length);
        int[] selectionArray = Arrays.copyOf(numbers, numbers.length);
        int[] mergeArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println("\n====== Bubble Sort ======");
        Latihan3.bubbleSort(bubbleArray);

        System.out.println("\n====== Quick Sort ======");
        Latihan3.quickSort(quickArray, 0, quickArray.length - 1, new int[]{1});

        System.out.println("\n====== Insertion Sort ======");
        Latihan3.insertionSort(insertionArray);

        System.out.println("\n====== Selection Sort ======");
        Latihan3.selectionSort(selectionArray);

        System.out.println("\n====== Merge Sort ======");
        Latihan3.mergeSort(mergeArray, new int[]{1});
    }
}
