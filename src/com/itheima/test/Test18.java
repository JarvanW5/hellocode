package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:数组
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test18 {
    public static void main(String[] args) {
        // 需求1：定义数组存储5个学生的年龄
        int[] arr1 = new int[]{14,12,13,12,12};
        int[] arr2 = {14,12,13,12,12};
        int arr3[] = {14,12,13,12,12};

        // 需求2：定义数组存储3个学生的姓名
        String[] arr4 = new String[]{"张三","李四","王五"};
        String[] arr5 = {"张三","李四","王五"};

        //数组的地址值
        System.out.println(arr5);//[Ljava.lang.String;@776ec8df
        System.out.println(arr1);//[I@4eec7777

        /*
        扩展：
        解释一下地址值的格式含义  [I@4eec7777
        [ 表示当前是一个数组
        I 表示是一个int的数据类型
        @ 表示一个间隔符号。（固定格式）
        4eec7777 才是数组真正的地址值，（十六进制）
        平时我们会习惯的把整体叫做是数组的地址值
         */
    }


}
