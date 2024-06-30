package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/25
 * @Description:
 * @VERSON:1.7
 * @Requirement:字符串反转，键盘录入一个字符串，调用该方法后，在控制台输出结果
 */
public class Test40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String newStr = strTostr(str);
        System.out.println(newStr);

    }


    // 字符串反转
    public static String strTostr(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(str.length() - i - 1);
            newStr = newStr + c;


        }

        return newStr;
    }
}
