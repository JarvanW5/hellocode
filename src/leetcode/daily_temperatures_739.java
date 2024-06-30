package leetcode;

import java.util.Stack;

/**
 * @Author:JarvanW
 * @Date:2023/10/7
 * @Description:每日温度
 * @Version:1.8
 * @Requirement:
 */
public class daily_temperatures_739 {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = dailyTemperatures(temperatures);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);

        }

    }


    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
//              暴力解法
//        for (int i = 0; i < temperatures.length - 1; i++) {
//            for (int j = i + 1; j < temperatures.length; j++) {
//                if (temperatures[i] < temperatures[j]) {
//                    answer[i] = j - i;
//                    break;
//                }
//
//            }
//
//        }


        // 栈
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int pre = stack.pop();
                answer[pre] = i - pre;
            }
            stack.push(i);
        }

        return answer;
    }
}
