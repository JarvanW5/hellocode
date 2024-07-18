package javaguide.leetcode.stackandqueue;

import java.util.ArrayDeque;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 删除字符串中的所有相邻重复项
 * @Requirements: 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * <p>
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * <p>
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * 示例：
 * <p>
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 */

public class code1047 {
    // 从给定字符串中去除所有连续重复的字符，并返回处理后的字符串
    public static String removeDuplicates(String S) {
        // ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        // 遍历字符串
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            // 如果队列为空，或者其顶部字符与当前字符'ch'不同，那么就将'ch'压入栈中
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else { // 如果`ArrayDeque`顶部的字符与`ch`相同，则将顶部字符弹出`ArrayDeque`，这实际上去除了连续重复的字符
                deque.pop();
            }
        }
        String str = "";
        // 剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "abbaca";
        String s1 = removeDuplicates(s);
        System.out.println(s1);
    }
}
