package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/31
 * @Description:
 * @Requirements:
 */

public class code48new {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotate(matrix);

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }


    }


    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] newMatrix = new int[n][m];

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = 0; i <= right; i++) {
                newMatrix[top][i] = matrix[bottom - i][left];
            }
            top++;
            left++;
        }

        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                matrix[i1][i] = newMatrix[i1][i];
            }
        }
    }
}
