package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:回文数
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test13 {
    public static void main(String[] args) {
        /*
        需求： 给你一个数x;
        如果x是一个回文数，打印true，否则，返回false。
        例如121是一个回文数
         */

        //1.定义数字
//        int x = 12345;
//
//        int ge = x % 10;
//        int shi = x / 10 % 10;
//        int bai = x / 100 % 10;
//        int qian = x / 1000 % 10;
//        int wan = x / 10000 % 10;
//
//        int wan1 = ge * 10000;
//        int qian1 = shi * 1000;
//        int bai1 = bai * 100;
//        int shi1 = qian * 10;
//        int ge1 = wan * 1;
//
//
//        int result = wan1 + qian1 + bai1 + shi1 + ge1;
//        System.out.println(result);
//        if (result == x) {
//            System.out.println("该数是一个回文数");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字： ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int b = (int) Math.pow(10, i - 1);
            int ge = num / b % 10;
            int c = (int) Math.pow(10, count - i);
            int shi = ge * c;
            sum += shi;
        }
        System.out.println(sum);

        if (sum == num){
            System.out.println("该数是一个回文数");
        }else{
            System.out.println("该数不是一个回文数");
        }

    }
}
