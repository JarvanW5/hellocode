package leetcode_hot;

import java.util.HashMap;

/**
 * @Author:JarvanW
 * @Date:2024/4/14
 * @Description:两数之和
 * @Version:1.8
 * @Requirement:
 */
public class code1 {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);

        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 3, 4, 5};
        int target = 9;
        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of two numbers that add up to the target:");
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
