package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:while
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test12 {
    public static void main(String[] args) {
        double height = 8844430;
        double paper = 0.1;
        int count = 0;

        while(paper < height){
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
