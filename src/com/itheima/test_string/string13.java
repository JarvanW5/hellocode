package com.itheima.test_string;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/17
 * @Description:罗马数字的两种写法
 * @Version:1.8
 * @Requirement:键盘录入一个字符串
 */
public class string13 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        //书写Scanner的代码

        Scanner sc = new Scanner(System.in);
        String str;
        //2.校验字符串是否满足规则
        while (true) {
            System.out.println("请输入一个字符串：");

            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入");
                continue;

            }
        }
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            String b = changeLuoMa(str.charAt(i) - 48);
            a = a + b;

        }
        System.out.println(a);


    }


    public static boolean checkStr(String str) {
        //要求1：长度小于等于9
        if (str.length() > 9) {
            return false;
        }

        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }

        }
        return true;
    }


    public static String changeLuoMa(int number) {
        //定义一个数组，让索引跟罗马数字产生一个对应关系
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[number];


    }
}
