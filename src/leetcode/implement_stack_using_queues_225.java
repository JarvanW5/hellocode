package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:JarvanW
 * @Date:2024/3/3
 * @Description:用队列实现栈
 * @Version:1.8
 * @Requirement:
 */
public class implement_stack_using_queues_225 {

    static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;
        private int topElement;

        /** Initialize your data structure here. */
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue1.offer(x);
            topElement = x;
            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int popped = queue2.poll();
            if (!queue2.isEmpty()) {
                topElement = queue2.peek();
            }
            return popped;
        }

        /** Get the top element. */
        public int top() {
            return topElement;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // 输出 2
        System.out.println(stack.pop());   // 输出 2
        System.out.println(stack.empty()); // 输出 false
    }
}
