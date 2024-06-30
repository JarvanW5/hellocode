package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/4/1
 * @Description:盛最多水的容器
 * @Version:1.8
 * @Requirement:
 */
public class code11 {

    public static int maxArea(int[] height) {
//        int num = 0;
//        for (int left = 0; left < height.length; left++) {
//            for (int right = left + 1; right < height.length; right++) {
//                int a = right - left;
//                int b = Math.min(height[left], height[right]);
//                int s = a * b;
//                num = Math.max(num,s);
//            }
//        }
//        return num;
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
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int num = maxArea(nums);
        System.out.println(num);
    }
}
