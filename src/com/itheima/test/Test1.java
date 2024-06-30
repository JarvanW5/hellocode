package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入一个三位数，获取其中的个位、十位、百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int ge = num % 10;
        int a = num /10;
        int shi = num /10 % 10;
        int bai = num /100 % 10;
        System.out.println("个位为：" + ge);
        System.out.println("十位为：" + shi);
        System.out.println("百位为：" + bai);
        System.out.println(a);
    }
}
