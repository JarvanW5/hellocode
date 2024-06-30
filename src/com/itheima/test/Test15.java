package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/8
 * @Description:跳转控制
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test15 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3){

                // continue: 跳过本次循环，继续执行下次循环
                continue;
                //break：结束整个循环
            }

            System.out.println(i);

        }
    }

}
