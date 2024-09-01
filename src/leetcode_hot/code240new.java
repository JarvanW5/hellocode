package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/31
 * @Description:
 * @Requirements:
 */

public class code240new {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;

        boolean b = searchMatrix(matrix, target);
        System.out.println(b);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;                   // 行
        int cols = matrix[0].length;                // 列

        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }

        }

        return false;
    }

}
