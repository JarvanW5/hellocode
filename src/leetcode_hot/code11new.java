package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/8/28
 * @Description:
 * @Requirements:
 */

public class code11new {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
