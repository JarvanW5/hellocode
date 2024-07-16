package javaguide.leetcode.hashmap;

import java.util.*;

/**
 * @Author: JarvanW
 * @Date: 2024/7/11
 * @Description: 三数之和
 * @Requirements: 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 解释：
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 * 注意，输出的顺序和三元组的顺序并不重要。
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,1]
 * 输出：[]
 * 解释：唯一可能的三元组和不为 0 。
 * 示例 3：
 * <p>
 * 输入：nums = [0,0,0]
 * 输出：[[0,0,0]]
 * 解释：唯一可能的三元组和为 0 。
 */

public class code15 {
    // 哈希表法
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // 如果第一个元素大于零，不可能凑成三元组
            if (nums[i] > 0) {
                return result;
            }
            // 三元组元素a去重（第一个数去重）
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                // 三元组元素b去重
                if (j > i + 2 && nums[j] == nums[j - 1] && nums[j - 1] == nums[j - 2]) {
                    continue;
                }

                int c = -nums[i] - nums[j];
                if (set.contains(c)) {
                    result.add(Arrays.asList(nums[i], nums[j], c));
                    set.remove(c); // 三元组元素c去重
                } else {
                    set.add(nums[j]);
                }
            }
        }
        return result;
    }

    // 双指针法
    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // 找出a + b + c = 0
        // a = nums[i], b = nums[left], c = nums[right]
        for (int i = 0; i < nums.length; i++) {
            // 排序之后如果第一个元素已经大于零，那么无论如何组合都不可能凑成三元组，直接返回结果就可以了
            if (nums[i] > 0) {
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重逻辑应该放在找到一个三元组之后，对 b 和 c 去重
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return result;
    }

    // 暴力解法
    public static List<List<Integer>> threeSum3(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int length = nums.length;
        if (length < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Arrays.asList的作用是将括号中的数据转化为list
        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println(integers);
          // 哈希表法
//        List<List<Integer>> lists = threeSum1(nums);
//        for (List<Integer> list : lists) {
//            System.out.println(list);
//        }
        // 双指针法
        List<List<Integer>> lists1 = threeSum2(nums);
        for (List<Integer> list : lists1) {
            System.out.println(list);
        }
        // 暴力解法
//        List<List<Integer>> lists2 = threeSum3(nums);
//        for (List<Integer> list : lists2) {
//            System.out.println(list);
//        }

    }
}
