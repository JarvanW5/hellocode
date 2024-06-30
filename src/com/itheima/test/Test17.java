package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:获取随机数
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test17 {
    public static void main(String[] args) {
        // 需求：
        // 随机数范围： 1~100

        // 创建对象
        /*
        Random r = new Random();
        生成随机数
        int number = r.nextInt(101);// 生成0~100
         */
        /*
        秘诀，生成任意数到任意数之间的随机数  7~15
        1.头减
        2.尾加1
        3.
         */
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);
        Scanner sc =new Scanner(System.in);
        int a;
        int count = 0;

        do {
            System.out.println("请输入您想要猜的数");
            a = sc.nextInt();
            count++;
            if(count==3){
                System.out.println("三次了，猜中了");
                break;
            }
            if (a > num){
                System.out.println("大");

            }else if (a < num){
                System.out.println("小");

            }else {
                System.out.println("对");
                break;

            }
        }while (true);

    }

}
