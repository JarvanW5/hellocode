package javaguide.leetcode.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 有效的括号
 * @Requirements: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 */

public class code20 {
    // 用于判断字符串中的括号是否匹配
    public static boolean isValid(String s) {
        // 初始化栈
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号，就把相应的右括号入栈
            if (ch == '(') {
                deque.push(')');
            } else if (ch == '{') {
                deque.push('}');
            } else if (ch == '[') {
                deque.push(']');
            } else if (deque.isEmpty() || deque.peek() != ch) { // 处理右括号
                return false;
            } else {//如果是右括号判断是否和栈顶元素匹配，若匹配则弹出栈顶元素
                deque.pop();
            }
        }
        //最后判断栈中元素是否匹配
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{(){}[]}";
        System.out.println(isValid(s));
    }
}
