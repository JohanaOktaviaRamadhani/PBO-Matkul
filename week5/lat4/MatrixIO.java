package lat4;

import java.util.Scanner;

public class MatrixIO {
    private Scanner scanner;

    public MatrixIO(Scanner scanner) {
        this.scanner = scanner;
    }

    public Matrix inputMatrix(String nama) {
        System.out.printf("Input baris matrix %s = ", nama);
        int baris = scanner.nextInt();
        System.out.printf("Input kolom matrix %s = ", nama);
        int kolom = scanner.nextInt();

        int[][] data = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Input elemen matrix %s [%d,%d] = ", nama, i, j);
                data[i][j] = scanner.nextInt();
            }
        }

        return new Matrix(data);
    }
}
