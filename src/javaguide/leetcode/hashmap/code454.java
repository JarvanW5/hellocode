package javaguide.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: JarvanW
 * @Date: 2024/7/10
 * @Description: 四数相加II
 * @Requirements: 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
 * <p>
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
 * 输出：2
 * 解释：
 * 两个元组如下：
 * 1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0
 * 示例 2：
 * <p>
 * 输入：nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
 * 输出：1
 */

public class code454 {
    // 暴力解法，时间超出
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int i1 = nums1[i];
            for (int i2 = 0; i2 < nums2.length; i2++) {
                int i3 = nums2[i2];
                for (int i4 = 0; i4 < nums3.length; i4++) {
                    int i5 = nums3[i4];
                    for (int i6 = 0; i6 < nums4.length; i6++) {
                        int i7 = nums4[i6];
                        if (i1 + i3 + i5 + i7 == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static int fourSumCount1(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum1 = nums1[i] + nums2[j];
                if (map.containsKey(sum1)) map.put(sum1, map.get(sum1) + 1);
                else map.put(sum1, 1);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int sum2 = -(nums3[i] + nums4[j]);
                if (map.containsKey(sum2)) res += map.get(sum2);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        int count = fourSumCount(nums1, nums2, nums3, nums4);

        int count1 = fourSumCount1(nums1, nums2, nums3, nums4);


        System.out.println(count);

        System.out.println(count1);
    }

}
