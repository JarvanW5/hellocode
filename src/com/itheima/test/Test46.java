package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/8/2
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test46 {
    public static void main(String[] args) {
        //链式编程：
        //当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其他的方法

    }


    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        return str;
    }
}
