package com.itheima.test_string;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/15
 * @Description:拼接字符串
 * @Version:1.8
 * @Requirement:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
 */
public class string07 {
    public static void main(String[] args) {

        //1.拼接字符串
        int[] arr = {1, 2, 3};
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            int c = arr[i];
            str = str + c + ",";
            System.out.println(str);
        }
        str = str + arr[arr.length - 1] + "]";
        System.out.println(str);


        //2.字符串的反转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(str1.length() - 1 - i);
            result = result + a;
        }
        System.out.println(result);
    }

}
