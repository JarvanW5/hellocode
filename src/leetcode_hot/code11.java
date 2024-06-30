package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/18
 * @Description:盛最多水的容器
 * @Version:1.8
 * @Requirement:
 */
public class code11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int maxarea = maxArea(height);
        System.out.println(maxarea);

    }

}
