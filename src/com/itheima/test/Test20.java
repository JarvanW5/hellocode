package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:数组练习
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test20 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;

            } else {
                arr[i] = arr[i] * 2;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
