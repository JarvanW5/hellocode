package leetcode;


import java.util.Arrays;

/**
 * @Author:JarvanW
 * @Date:2023/10/10
 * @Description:移动机器人
 * @Version:1.8
 * @Requirement:
 */
public class movement_of_robots_2731 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 2};
        String s = "RLL";
        int d = 3;
        int sum = sumDistance(nums, s, d);
        System.out.println(sum);

    }

    public static int sumDistance(int[] nums, String s, int d) {
        final long MOD = (long) 1e9 + 7;

        long[] newNums = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            char ch = s.charAt(i);
            if (ch == 'R') {
                newNums[i] = 1;
            } else {
                newNums[i] = -1;
            }

        }
        for (int i = 0; i < d; i++) {
            for (int i1 = 0; i1 < newNums.length; i1++) {
                nums[i1] += newNums[i1];

            }
            for (int i2 = 0; i2 < nums.length - 1; i2++) {
                if (nums[i2] == nums[i2 + 1]) {
                    long temp = newNums[i2];
                    newNums[i2] = newNums[i2 + 1];
                    newNums[i2 + 1] = temp;
                }
            }
        }
        Arrays.sort(nums);


        long dif = 0,sum = 0;
        for (int i = 0; i < nums.length; i++) {
            dif = (dif + i*nums[i]-sum)% MOD;
            sum += nums[i];



        }


        return (int)dif;

    }
}
