package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/25
 * @Description:除自身以外数组的乘机
 * @Version:1.8
 * @Requirement:
 */
public class code238 {
    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];


        L[0] = 1;
        for (int i = 1; i < length; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }

        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {
            R[i] = R[i + 1] * nums[i + 1];


        }

        for (int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        for (int i : result) {
            System.out.println(i);

        }

    }

}
