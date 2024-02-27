public class Boyutlu {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3, 4}, {5, 6, 4}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matris 1:");
        printMatrix(matrix1);
        System.out.println("Transpoze 1:");
        printMatrix(transposeMatrix(matrix1));

        System.out.println("\nMatris 2:");
        printMatrix(matrix2);
        System.out.println("Transpoze 2:");
        printMatrix(transposeMatrix(matrix2));
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
