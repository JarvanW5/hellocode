package com.itheima.test;

import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:评委打分
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test29 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        pingFeng(arr);

    }

    public static void pingFeng(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }

            if (arr[i + 1] < min) {
                min = arr[i + 1];
            }

            sum = sum + arr[i];
        }
        System.out.println(max + " " + min);
        int result = (sum - max - min) / 4;
        System.out.println(result);


    }
}
