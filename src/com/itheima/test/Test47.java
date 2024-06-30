package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/8/2
 * @Description:
 * @VERSON:1.7
 * @Requirement:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是。
 */


// 使用StringBuilder的场景
// 1.字符串的拼接
// 2.字符串的反转
public class Test47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String str1 = reverse(str);
        boolean result = ifStr(str,str1);
        if (result == true){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }



        // 简单方法
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

        // 再简化
        String reverse = new StringBuilder().append(str).reverse().toString();
        System.out.println(reverse);
        System.out.println(new StringBuilder().append(str).reverse().toString());

    }


    public static String reverse(String str){
        String str1 = "";
        for (int i = str.length() - 1; i > -1; i--) {
            str1 += str.charAt(i);

        }
        return str1;
    }


    public static boolean ifStr(String str1,String str2){
        if (str1.equals(str2)){
            return true;
        }else {
            return false;
        }

    }
}
