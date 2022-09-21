import java.util.ArrayList;
import java.util.List;

public class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][i]);
        }
        return res;
    }
    public static int[][] transpose2(int[][] A) {
        int outerLength = A.length;
        int innerLength = A[0].length;
        int[][] B = new int[innerLength][outerLength];
        int i = 0;
        int j = 0;
        while (i != innerLength) {
            B[i][j] = A[j][i];
            j++;
            if (j == outerLength) {
                i++;
                j = 0;
            }
        }
        for (int j2 = 0; j2 < B.length; j2++) {
            for (int k = 0; k < B[0].length; k++) {
                System.out.println(B[j2][k]);
            }
        }
        return B;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose2(a));
    }
}
