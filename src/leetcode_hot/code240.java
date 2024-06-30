package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/8
 * @Description: 搜索二维矩阵||
 * @Version:1.8
 * @Requirement:
 */
public class code240 {
    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int[] row : matrix) {
            int search = search(row, target);
            if (search >= 0) {
                return true;
            }

        }
        return false;
    }


    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        int target = 5;
        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
    }
}
