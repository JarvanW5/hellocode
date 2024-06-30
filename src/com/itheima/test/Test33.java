package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/10
 * @Description:二维数组
 * @VERSON:1.7
 * @Requirement:二维数组的静态初始化
 */
public class Test33 {
    //格式：数据类型[][] 数组名 = new 数据类型[][] {{元素1，元素2}，{元素1，元素2}}；
    public static void main(String[] args) {
        int[][] arr = new int[][]{{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                sum += arr[i][i1];
            }
            sum1 += sum;
            System.out.println("第" + (i + 1) + "个季度的营业额为：" + sum);
            System.out.println();
        }
        System.out.println(sum1);
    }
}
