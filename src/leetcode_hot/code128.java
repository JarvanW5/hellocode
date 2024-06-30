package leetcode_hot;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author:JarvanW
 * @Date:2024/4/14
 * @Description:
 * @Version:1.8
 * @Requirement: 最长连续序列
 */
public class code128 {
    public static int longestConseCutive(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int max = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            int left = hashMap.getOrDefault(num - 1, 0);
            int right = hashMap.getOrDefault(num + 1, 0);

            int length = left + right + 1;
            hashMap.put(num,length);
            hashMap.put(num-left,length);
            hashMap.put(num+right,length);

            max = Math.max(max,length);
        }


        return max;
    }


    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int max = longestConseCutive(nums);
        System.out.println(max);
    }
}
