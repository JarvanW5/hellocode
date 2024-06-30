package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:找质数
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test26 {
    // 需求：判断101-200之间有多少个质数，并输出所有质数。
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {


            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前的数是质数" + i);
                count++;
            }


        }
        System.out.println(count);
    }
}
