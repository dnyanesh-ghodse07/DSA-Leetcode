

public class Matrix {
    public static int sumOfMatrix(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
    public static int sumOfDiagonal(int[][] mat) {
        int dig1 = 0;
        int dig2 = 0;
        int n = 0;
        for (int i = 0; i < mat.length; i++) {
            dig1 += mat[i][i];
            dig2 += mat[i][mat.length - i - 1];
        }
        return dig1 - dig2;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 17},
                {4, 5, 6},
                {7, 8, 17}
        };
        
        // System.out.println(sumOfMatrix(mat));
        System.out.println(sumOfDiagonal(mat));
    }
}
