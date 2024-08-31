package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/8
 * @Description:旋转图像
 * @Version:1.8
 * @Requirement:
 */
public class code48 {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;    // 列

        int[][] matrix_new = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                matrix_new[i1][n-1-i] = matrix[i][i1];

            }

        }

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                matrix[i][i1] = matrix_new[i][i1];

            }

        }

    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                System.out.println(matrix[i][i1]);

            }

        }
    }
}
