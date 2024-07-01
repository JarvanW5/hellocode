package javaguide.leetcode;

import java.util.ArrayList;

/**
 * @Author: JarvanW
 * @Date: 2024/7/1
 * @Description: 螺旋遍历二维数组
 * @Requirements: 给定一个二维数组 array，请返回「螺旋遍历」该数组的结果。
 * <p>
 * 螺旋遍历：从左上角开始，按照 向右、向下、向左、向上 的顺序 依次 提取元素，然后再进入内部一层重复相同的步骤，直到提取完所有元素。
 */

public class code146 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        int[] ints = spiralArray(array);
        for (int i : ints) {
            System.out.println(i);
        }

    }

    public static int[] spiralArray(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        // row : 行; column : 列; left : 左边端口; right : 右边端口
        int column = array.length - 1, right = array[0].length - 1;
        int left = 0, row = 0;
        int index = 0;

        int[] ints = new int[array.length * array[0].length];

        while (left <= right && row <= column) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                ints[index++] = array[row][i];
            }
            row++;
            // 从上到下
            for (int i = row; i <= column; i++) {
                ints[index++] = array[i][right];
            }
            right--;
            // 从右到左
            if (row <= column) {
                for (int i = right; i >= left; i--) {
                    ints[index++] = array[column][i];
                }
            }
            column--;
            // 从下到上
            if (left <= right) {
                for (int i = column; i >= row; i--) {
                    ints[index++] = array[i][left];
                }
            }
            left++;
        }

        return ints;
    }
}
