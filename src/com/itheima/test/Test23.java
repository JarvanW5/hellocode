package com.itheima.test;

import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:打乱数据，随即索引
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test23 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Random r =new Random();
        for (int i = 0; i < arr.length / 2; i++) {
            int num =r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
