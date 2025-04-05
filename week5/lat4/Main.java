package lat4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatrixIO io = new MatrixIO(input);

        Matrix matrixA = io.inputMatrix("A");
        System.out.println("");
        Matrix matrixB = io.inputMatrix("B");

        while (true) {
            System.out.println("\n===== Menu Operasi Matrix =====");
            System.out.println("1. Penjumlahan Matrix (A + B)");
            System.out.println("2. Perkalian Matrix (A × B)");
            System.out.println("3. Transpose Matrix A");
            System.out.println("4. Transpose Matrix B");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    if (matrixA.getData().length == matrixB.getData().length &&
                        matrixA.getData()[0].length == matrixB.getData()[0].length) {
                        System.out.println("\nHasil Penjumlahan Matrix A + B:");
                        matrixA.add(matrixB).print();
                    } else {
                        System.out.println("Ukuran matrix tidak sama, tidak bisa dijumlahkan!");
                    }
                    break;

                case 2:
                    if (matrixA.getData()[0].length == matrixB.getData().length) {
                        System.out.println("\nHasil Perkalian Matrix A × B:");
                        matrixA.multiply(matrixB).print();
                    } else {
                        System.out.println("Jumlah kolom A harus sama dengan jumlah baris B!");
                    }
                    break;

                case 3:
                    System.out.println("\nHasil Transpose Matrix A:");
                    matrixA.transpose().print();
                    break;

                case 4:
                    System.out.println("\nHasil Transpose Matrix B:");
                    matrixB.transpose().print();
                    break;

                case 5:
                    System.out.println("Program selesai!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
