package lat3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan deretan angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();

        String[] strNumbers = input.trim().split(" ");
        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        SortRunner.runAll(numbers);
    }
}
