package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:while
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test14 {
    public static void main(String[] args) {
        // 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        // 将两数相除，要求不使用乘法、除法和 % 运算符。
        // 得到商和余数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int count = 0;
        while (a1 - a2 >= 0){
            a1 = a1 - a2;
            count++;
        }
        System.out.println(count);
    }
}
