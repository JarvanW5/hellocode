package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:逢7过、平方根
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test16 {
    public static void main(String[] args) {
        //1~100
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0 || i % 10 == 7 || i /10 % 10 == 7){
//                continue;
//            }
//            System.out.println(i);
//        }


        //求平方根
//        Scanner sc = new Scanner(System.in);
//
//        int num;
//        System.out.println("请输入一个数：");
//        do {
//            num = sc.nextInt();
//            if (num < 2) {
//                System.out.println("请重新输入一个数：");
//            }
//        } while (num < 2);
//        System.out.println("输入的值满足大于等于2");
//        for (int i = 0; i < num; i++) {
//            if (i * i == num) {
//                System.out.println(i + "就是" + num + "的平方根");
//                break;
//            } else if (i * i > num) {
//                System.out.println((i - 1) + "就是" + num + "的平方根");
//                break;
//            }
//        }

        // 质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        //定义一个变量，表示标识
        //标记着number是否为一个质数
        //true:是一个质数
        //false:不是一个质数
        boolean flag = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
//            }else {
//                System.out.println("该数是一个质数");
//            }

        }
        if (flag == false){
            System.out.println("不是");
        }else {
            System.out.println("是");
        }
    }
}
