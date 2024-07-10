package javaguide.leetcode.array;

/**
 * @Author: JarvanW
 * @Date: 2024/6/25
 * @Description: x的平方根
 * @Version: 1.8
 * @Requirement: 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * <p>
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 */
public class code69 {
    public static void main(String[] args) {
        int x = 8;
        int i = mySqrt(x);
        System.out.println(i);
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int target = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            // 如果 middle * middle 的结果超出了 int 类型的范围, 就会发生溢出。溢出后的结果可能会变成负数或其他不可预料的值, 所以得使用 long 类型
            if ((long) middle * middle <= x) {
                target = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return target;

    }

}
