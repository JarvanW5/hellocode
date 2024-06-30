package leetcode;

import java.util.HashMap;

/*
 * @Auther:JarvanW
 * @Date:2023/8/4
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */

/**
 * 两数之和的大致思想：
 * 在遍历数组每一个元素，考虑之前元素和当前元素能不能形成某一个状态的时候，考虑使用hash的思想   key   value
 * 其中hashmap.containskey(key)函数是查询hash表中是否有该键值 即此时的数是否在hash表中存在
 * hashmap.get(key)是获得该key值所对应的value，即此时的数组下标
 * hashmap.put()同时将每一次的key value输入至hash表中
 *
 *
 */
public class two_sum_1 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);

        }


        return new int[]{};
    }

}
