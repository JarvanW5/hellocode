package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:判断和循环
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test9 {
    public static void main(String[] args) {
        // 需求：商场
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的级别： ");
        int a = sc.nextInt();
        int b = 1000;
        if (a >= 1 && a <= 3) {
            System.out.println("会员" + a + "级，打" + (10 - a) + "折");
            System.out.println("实际价格为：");
            double result = b * (10 - a) * 0.1;
            System.out.println(result);
        } else {
            System.out.println("会员等级错误！");
        }
    }
}
