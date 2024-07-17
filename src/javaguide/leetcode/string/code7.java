package javaguide.leetcode.string;

/**
 * @Author: JarvanW
 * @Date: 2024/7/17
 * @Description: 整数反转
 * @Requirements: 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 示例 1：
 * <p>
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 */
public class code7 {
    public static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            //判断num是否超过了32位有符号整数的范围
            if (num < Integer.MIN_VALUE / 10 || num > Integer.MAX_VALUE / 10) {
                return 0;
            }
            num *= 10;
            num += x % 10;
            x /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        int x = 123;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
}
