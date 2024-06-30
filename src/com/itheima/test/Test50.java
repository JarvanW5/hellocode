package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/8/5
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test50 {
    public static void main(String[] args) {
        //键盘输入任意的字符串，打乱里面的内容

        //1.键盘输入任意字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.打乱里面的顺序
        //修改字符串里面的内容
        //1.subString
        //2.变成字符数组
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = new Random().nextInt(arr.length);
            swap(arr,i,randomIndex);
        }

        //3.打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的变换
        //当数组里面的每一个元素都跟一个随机索引进行变换完毕之后，那么内容就打乱了


        //4.把字符数组再变回字符串
        String result = new String(arr);

        System.out.println(result);
    }

    public static char[] swap(char[] arr, int index1,int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
}
