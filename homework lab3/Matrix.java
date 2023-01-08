import java.util.Random;

public class Matrix {
    public static void createRandomMatrix(int[][] matrix) {

    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];

        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return matrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix2[0].length;
        int[][] matrix = new int[m][n];

        if (matrix1[0].length != matrix2.length) {
            return null;
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int total = 0;
                    for (int k = 0; k < n; k++) {
                        total += matrix1[i][k] * matrix2[k][j];
                    }
                    matrix[i][j] = total;
                }
            }
        }
        return matrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int m = matrix1.length;
        int n = matrix2[0].length;
        double[][] matrix = new double[m][n];

        if (matrix1[0].length != matrix2.length) {
            return null;
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int total = 0;
                    for (int k = 0; k < n; k++) {
                        total += matrix1[i][k] * matrix2[k][j];
                    }
                    matrix[i][j] = total;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        double[][] matrix = multiply(matrix1, matrix2);

        print(matrix);
    }
}
