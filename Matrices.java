package oops_practical;

public class Matrices {

    int[][] matrix; 

    Matrices(int[][] m) {
        matrix = m;
    }

    void multiply(Matrices other) {
        int rows = matrix.length;
        int cols = other.matrix[0].length;
        int common = matrix[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        Matrices m1 = new Matrices(a);
        Matrices m2 = new Matrices(b);
        m1.multiply(m2);
    }
}

