package javaguide.leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/7/1
 * @Description: 螺旋矩阵
 * @Requirements: 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */

public class code54 {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, row = 0, column = m - 1;
        while (left <= right && row <= column) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                ans.add(matrix[row][i]);
            }
            row++;
            // 从上到下
            for (int i = row; i <= column; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // 从右到左
            if (row <= column) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[column][i]);
                }
            }
            column--;
            // 从下到上
            if (left <= right) {
                for (int i = column; i >= row; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

}
