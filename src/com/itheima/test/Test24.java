package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:方法练习
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test24 {
    public static void main(String[] args) {
        // 1.定义数组
        int arr[] = {1, 2, 3, 4, 5,6,7,8,9};
        printArr(arr);
        int max = maxArr(arr);
        System.out.println(max);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = contains(num, arr);
        System.out.println(result);
        int[] newarr = copyOfRange(arr,3,7);
        printArr(newarr);
    }

    // 定义方法用于数组的遍历
    //1.我要干嘛？     遍历数组
    //2.我干这件事情需要什么才能完成？    数组
    //3.方法的调用处是否需要继续使用结果？     不需要返回值
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");

    }

    // 数组中的最大值
    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            } else {
                max = arr[i + 1];
            }
        }
        return max;
    }

    // 判断数组中是否存在某个值
    public static boolean contains(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    /*
    需求：定义一个方法copyOfRange(int[] arr,int from,int to)
    将数组从from到to的元素全都复制到新数组中，将新数组返回。
     */
    public static int[] copyOfRange(int[] arr,int from,int to){

        int newarr[] = new int[to-from];
        for (int i = from; i < to; i++) {
            newarr[i - from] = arr[i];

        }
        return newarr;
    }


}
