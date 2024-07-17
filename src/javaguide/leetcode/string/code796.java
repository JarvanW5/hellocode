package javaguide.leetcode.string;

/**
 * @Author: JarvanW
 * @Date: 2024/7/17
 * @Description: 旋转字符串
 * @Requirements: 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 * <p>
 * s 的 旋转操作 就是将 s 最左边的字符移动到最右边。
 * <p>
 * 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。
 * 示例 1:
 * <p>
 * 输入: s = "abcde", goal = "cdeab"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "abcde", goal = "abced"
 * 输出: false
 */

public class code796 {
    public static boolean rotateString(String s, String goal) {
        return s.length()==goal.length()&&(s+s).contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        String result = s + s;
        System.out.println(result);
        boolean b = rotateString(s, goal);
        System.out.println(b);

    }
}
