package javaguide.leetcode.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: JarvanW
 * @Date: 2024/7/18
 * @Description: 逆波兰表达式求值 --> 后缀表达式
 * @Requirements: 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。
 * <p>
 * 请你计算该表达式。返回一个表示表达式值的整数。
 * <p>
 * 注意：
 * <p>
 * 有效的算符为 '+'、'-'、'*' 和 '/' 。
 * 每个操作数（运算对象）都可以是一个整数或者另一个表达式。
 * 两个整数之间的除法总是 向零截断 。
 * 表达式中不含除零运算。
 * 输入是一个根据逆波兰表示法表示的算术表达式。
 * 答案及所有中间计算结果可以用 32 位 整数表示。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：tokens = ["2","1","+","3","*"]
 * 输出：9
 * 解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 * 示例 2：
 * <p>
 * 输入：tokens = ["4","13","5","/","+"]
 * 输出：6
 * 解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6
 * 示例 3：
 * <p>
 * 输入：tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * 输出：22
 * 解释：该算式转化为常见的中缀算术表达式为：
 * ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */

public class code150 {
    public static int evalRPN(String[] tokens) {
        // 初始化栈，使用 Deque<Integer> 作为栈，便于快速的添加和移除元素
        Deque<Integer> stack = new LinkedList<>();
        // **遍历表达式**:
        //   - 对于`tokens`数组中的每一个元素`s`:
        //     - 如果`s`是运算符`+`, `-`, `*`, `/`:
        //       - 弹出栈顶的两个元素，执行相应的运算。
        //       - 将运算结果重新压入栈中。
        //     - 否则:
        //       - 将`s`转换为整数并压入栈中。
        for (String s : tokens) {
            if ("+".equals(s)) {        // leetcode 内置jdk的问题，不能使用==判断字符串是否相等
                stack.push(stack.pop() + stack.pop());      // 注意 - 和/ 需要特殊处理
            } else if ("-".equals(s)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // 测试数据
        String[] test1 = {"2", "1", "+", "3", "*"};
        String[] test2 = {"4", "13", "5", "/", "+"};
        String[] test3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        // 预期结果
        int expected1 = 9;
        int expected2 = 6;
        int expected3 = 22;

        // 测试
        System.out.println("Test Case 1: " + (evalRPN(test1) == expected1 ? "Passed" : "Failed"));
        System.out.println("Test Case 2: " + (evalRPN(test2) == expected2 ? "Passed" : "Failed"));
        System.out.println("Test Case 3: " + (evalRPN(test3) == expected3 ? "Passed" : "Failed"));
    }
}
