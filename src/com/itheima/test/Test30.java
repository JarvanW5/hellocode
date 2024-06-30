package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/10
 * @Description:数字加密和解密
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test30 {
    // 需求：某系统的数字密码（大于0）,比如1983，采用加密的方式进行传输
    // 规则：先得到每位数，然后每位数都加上5，再对10求余数，最后将所有的数字反转，得到一串新数
    public static void main(String[] args) {

        int[] arr = creatArr();
        int[] newarr = firstArr(arr);
        int[] finalarr = reverseArr(newarr);
        System.out.print("新数组为：{");
        for (int i = 0; i < finalarr.length; i++) {
            if (i == finalarr.length - 1) {
                System.out.print(finalarr[i]);
            } else {
                System.out.print(finalarr[i] + ",");
            }
        }
        System.out.println("}");

    }

    // 实现数组的简单加减运算
    public static int[] firstArr(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = (arr[i] + 5) % 10;
        }
        return newarr;
    }


    // 实现键盘输入数字构成数组功能
    public static int[] creatArr() {
        System.out.println("需要输入几个数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("请输入" + number + "个数");
        for (int i = 0; i < number; i++) {
            System.out.print("第" + (i + 1) + "个数为：");
            int a = sc.nextInt();
            arr[i] = a;
        }
        return arr;
    }

    // 实现键盘输入一串数字构成数组功能
    public static int[] creatArr2() {
        System.out.println("需要输入的数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            int num = temp % 10;
            temp = temp / 10;
            arr[count - i -1] = num;
        }
        return arr;
    }


    // 实现数组的反转功能
    public static int[] reverseArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;

    }

}
