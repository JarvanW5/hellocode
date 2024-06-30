package com.itheima.test;

import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:开发验证码和数组元素的复制
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test27 {
    /*
    需求：
    定义方法实现随机产生一个5位的验证码
    验证码格式：
    长度为5
    前四位是大写字母或者小写字母
    最后一位是数字
     */
    // 方法：以后如果我们要在一堆没有什么规律的数据中随机抽取，可以先把这些数据放到数组当中，再随机抽取一个索引

    public static void main(String[] args) {
        // 分析：1、大写字母和小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) {

                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i - 26);

            }
        }

        String sum = "";
        Random r =new Random();

        // 2、随机抽取4次
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(chs.length);
            sum = sum + chs[num];
        }
        System.out.println(sum);

        // 3、随机抽取一个数字0-9
        int num = r.nextInt(10);
        String finalnum = sum + num;
        System.out.println(finalnum);
    }


}
