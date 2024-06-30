package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:数组元素的复制
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test28 {
    /*
    需求：把一个数组中的元素复制到另一个新的数组中去
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
            System.out.println(arr1[i]);
        }
    }
}
