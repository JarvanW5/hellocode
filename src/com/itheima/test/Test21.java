package com.itheima.test;

import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:练习
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test21 {
    public static void main(String[] args) {
//        //求最大值
//        int arr[] = {33,5,22,44,55};
//        int temp = arr[0];
//        for (int i = 1; i < arr.length-1; i++) {
//            if (arr[i]<arr[i+1]){
//                temp = arr[i+1];
//            }else {
//                temp = arr[i];
//            }
//        }
//        System.out.println(temp);


        //遍历数组求和
        //需求：生成10个1~100之间的随机数存入到数组中
        /*
        1) 求出所有数据的和
        2） 求所有数据的平均数
        3） 统计有多少个数据比平均值小
         */
        // 设置数组的长度为10
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            // 生成随机数
            Random r = new Random();
            int num = r.nextInt(100)+1;
            // 将随机数添加到数组中
            arr[i] = num;
            System.out.println(arr[i]);
        }
        // 数组中的值求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        // 求数组的平均值
        int pj = 0;
        pj = sum / arr.length;
        System.out.println(pj);
        // 统计有多少个数值比平均值要小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<pj){
                count++;
            }
        }
        System.out.println(count);

    }

}
