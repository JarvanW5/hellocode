package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/4/1
 * @Description:接雨水
 * @Version:1.8
 * @Requirement:
 */
public class code42 {

    public static int trap(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int ans = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] < leftmax) {
                    ans += leftmax - height[left];
                } else {
                    leftmax = height[left];
                }
                left++;

            } else {
                if (height[right] < rightmax) {
                    ans += rightmax - height[right];
                } else {
                    rightmax = height[right];
                }
                right--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(height);
        System.out.println(ans);
    }


}
