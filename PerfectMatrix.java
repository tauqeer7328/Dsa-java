public class PerfectMatrix{
    public static boolean Diagonal(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if ((i == j || i + j == rows - 1) && matrix[i][j] != 0) {
                    return false;
                }
                if (i != j && i + j != rows - 1 && matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example using
        int[][] matrix = {
                {0, 2, 0},
                {4, 0, 6},
                {0, 8, 0}
        };
        System.out.println(Diagonal(matrix));
    }
}