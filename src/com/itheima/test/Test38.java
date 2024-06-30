package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/25
 * @Description:
 * @VERSON:1.7
 * @Requirement:键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
 */
public class Test38 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.统计--- 计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                //char类型的变量在参与计算的时候自动类型提升为int 查询ASCII码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }

        }
        System.out.println("大写字母字符个数为：" + bigCount);
        System.out.println("小写字母字符个数为：" + smallCount);
        System.out.println("数字字符个数为：" + numberCount);
    }
}
