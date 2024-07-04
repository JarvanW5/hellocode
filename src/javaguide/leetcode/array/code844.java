package javaguide.leetcode.array;

/**
 * @Author:JarvanW
 * @Date:2024/6/25
 * @Description: 比较含退格的字符串
 * @Version:1.8
 * @Requirement:
 *
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 */
public class code844 {

    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static String build(String str) {
        StringBuffer ret = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            char ch = str.charAt(i);
            if (ch != '#') {
                ret.append(ch);
            } else {
                if (ret.length() > 0) {
                    // delete(int a,int b)方法：包含两个参数，使用时删除索引从a到b（包括a不包括b）的所有字符；
                    // deleteCharAt(int s)方法：只有一个参数，使用时删除索引为a的字符。
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {

        String s = "acb##";
        String t = "ab#";

        boolean b = backspaceCompare(s, t);

        System.out.println(b);

    }
}
