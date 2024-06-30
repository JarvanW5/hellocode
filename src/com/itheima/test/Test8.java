package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:三元运算符
 * @VERSON:1.7
 */
public class Test8 {
    public static void main(String[] args) {
        //格式 ：关系表达式？表达式1：表达式2；

        // 需求 获取两个数的较大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a > b ? a : b;
        System.out.println(result);

        // 需求  两只老虎
        System.out.println("请输入两只老虎的体重： ");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        boolean tiger = t1 == t2 ? true : false;
        System.out.println(tiger);
    }
}
