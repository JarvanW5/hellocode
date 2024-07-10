package javaguide.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: JarvanW
 * @Date: 2024/7/10
 * @Description: 两个数组的交集
 * @Requirements: 给定两个数组 nums1 和 nums2 ，返回 它们的
 * 交集。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 */

public class code349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        return getIntersection(set1, set2);
    }

    public static int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
//        int[] intersection = intersection(nums1, nums2);
//        for (int i : intersection) {
//            System.out.println(i);
//        }
        // Set 代表无序的，元素不可重复的集合
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums1) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }
}
