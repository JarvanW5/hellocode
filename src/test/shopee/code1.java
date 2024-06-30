package test.shopee;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author:JarvanW
 * @Date:2024/4/15
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code1 {

    public static String LargestNum(int[] nums) {
        // write code here

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                String result1 = o1 + o2;
                String result2 = o2 + o1;

                int result = result2.compareTo(result1);

                return result;
            }
        };


        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings, comparator);

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 33, 44, 34};
        String s = LargestNum(nums);
        System.out.println(s);
    }
}
