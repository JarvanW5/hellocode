package leetcode_hot;

import java.util.HashMap;

public class code560 {


    // 1、暴力解法
//    public static int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int end = 0; end < nums.length; end++) {
//            int sum = 0;
//            for (int start = end; start > 0; start--) {
//                sum += nums[start];
//                if (sum == k) {
//                    count++;
//                }
//
//            }
//
//        }
//
//
//        return count;
//
//    }

    // 2.hashmap方法
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hashMap.containsKey(sum - k)) {
                count += hashMap.get(sum - k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }


        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k)); // 输出 2，因为存在两个子数组的和为 2，分别是 [1, 1] 和 [1, 1]
    }
}
