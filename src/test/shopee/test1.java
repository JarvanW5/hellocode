package test.shopee;

import java.util.Arrays;

/**
 * @Author:JarvanW
 * @Date:2024/4/15
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test1 {

    public static String LargestNum(int[] nums) {
        // write code here
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = "" + nums[i];
        }
        Arrays.sort(strings, (a, b) -> {
            String sa = a + b, sb = b + a;
            return sb.compareTo(sa);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        int len = sb.length();
        int k = 0;
        while (k < len - 1 && sb.charAt(k) == '0') k++;

        return sb.substring(k);
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 33, 44, 34};
        String s = LargestNum(nums);
        System.out.println(s);
    }


}
