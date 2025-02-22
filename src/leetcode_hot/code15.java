package leetcode_hot;

import java.util.*;

/**
 * @Author:JarvanW
 * @Date:2024/4/18
 * @Description:三数之和
 *
 * @Version:1.8
 * @Requirement:
 */
public class code15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int first = 0; first < n - 2; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[first], nums[second], nums[third]));

                    while (second < third && nums[second] == nums[second + 1])
                        second++;
                    while (second < third && nums[third] == nums[third - 1])
                        third--;
                    second++;
                    third--;
                } else if (sum < 0) {
                    second++;
                } else {
                    third--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
