package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/28
 * @Description:
 * @VERSON:1.7
 * @Requirement:金额转换
 */
public class Test41 {
    public static void main(String[] args) {
        //键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个金额");
        int money = sc.nextInt();
        int a = money;

        int count = 0;

        while (true) {
            int ge = money % 10;
            money = money / 10;
//            System.out.println(ge);
//            String str = getDaxie(ge);
//            System.out.println(str);
            count++;
//            System.out.println(count);
            if (money == 0) {
                break;
            }
        }

        System.out.println("........................");
        int[] arr = reverse(a, count);
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            String str = getDaxie(arr[i]);
            str1 = str1 + str;
        }
        System.out.println(str1);


    }


    public static String getDaxie(int num) {
        String[] arr = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
        return arr[num];
    }


    public static int[] reverse(int num, int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
                int ge = num % 10;
                num = num / 10;
                arr[i] = ge;
                if (num == 0) {
                    break;
                }
        }

        int[] newarr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            newarr[arr.length - i - 1] = arr[i];
        }
        return newarr;
    }
}
