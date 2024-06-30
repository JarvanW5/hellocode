package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:数组的遍历
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test19 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(arr1[i]);
//        }
//        int a = arr1.length;
//        System.out.println(a);
//
//        //通用方式
//        for (int i = 0; i <= arr1.length; i++) {
//            System.out.println(arr1[i]);
//
//        }
//        // 扩展 快速遍历 arr.fori


        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
            System.out.println(sum);

        }

    }
}
