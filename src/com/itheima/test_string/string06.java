package com.itheima.test_string;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/15
 * @Description:遍历字符串
 * @Version:1.8
 * @Requirement:键盘录入一个字符串，使用程序实现在控制台遍历该字符串 public char charAt(int index):根据索引返回字符
 * public int length():返回此字符串的长度
 * 数组的长度：数组名.length
 * 字符串的长度：字符串对象.length()
 */
public class string06 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.进行遍历
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);

        }

        //3.统计字符次数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                //char类型的变量在参与计算的时候自动类型提升至int 查询ascii码表
                smallCount++;
            } else if (ch >= 'A' && ch <= 'z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }

        }
        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numberCount);

    }

}
