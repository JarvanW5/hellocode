package leetcode;

import java.util.Stack;

/**
 * @Author:JarvanW
 * @Date:2024/3/4
 * @Description:用栈实现队列
 * @Version:1.8
 * @Requirement:
 */
public class implement_queue_using_stacks_232 {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public void MyQueue(){
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x){
        inputStack.push(x);
    }

    public int pop(){
        if (outputStack.isEmpty()){
            transferElements();
        }
        return outputStack.pop();
    }

    public int peek(){
        if (outputStack.isEmpty()){
            transferElements();
        }
        return outputStack.pop();
    }

    public boolean empty(){
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    private void transferElements(){
        while(!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
    }

}
