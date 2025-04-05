package lat4;
public class Matrix {
    private int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public int[][] getData() {
        return data;
    }

    public Matrix add(Matrix other) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        int rowsA = this.data.length;
        int colsA = this.data[0].length;
        int colsB = other.data[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    public Matrix transpose() {
        int rows = data.length;
        int cols = data[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = data[i][j];
            }
        }

        return new Matrix(result);
    }

    public void print() {
        for (int[] row : data) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
