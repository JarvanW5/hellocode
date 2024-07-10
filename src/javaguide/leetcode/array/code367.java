package javaguide.leetcode.array;

/**
 * @Author: JarvanW
 * @Date: 2024/6/25
 * @Description: 有效的完全平方数
 * @Version: 1.8
 * @Requirement: 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * <p>
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 * <p>
 * 不能使用任何内置的库函数，如  sqrt 。
 */
public class code367 {
    public static void main(String[] args) {
        int num = 16;
        boolean perfectSquare = isPerfectSquare(num);
        System.out.println(perfectSquare);

    }

    public static boolean isPerfectSquare(int num) {

        int left = 0;
        int right = num;
        while (left <= right) {
            int middle = (left + right) / 2;
            if ((long) middle * middle < num) {
                left = middle + 1;
            } else if ((long) middle * middle > num) {
                right = middle - 1;
            } else if ((long) middle * middle == num) {
                return true;
            }
        }

        return false;
    }
}
