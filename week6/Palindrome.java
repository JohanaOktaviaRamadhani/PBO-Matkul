package week6;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata untuk dicek: ");
        String input = scanner.nextLine();

        // Pakai versi biasa
        TextGame game1 = new TextGame();
        game1.displayResult(input);

        System.out.println();

        // Pakai versi fancy
        TextGame game2 = new FancyTextGame();
        game2.displayResult(input);

    }
}
