package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:逻辑运算符
 * @VERSON:1.7
 */
public class Test7 {
    public static void main(String[] args) {

        // ^ 异或
        // 相同为false 不同为true

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);


        // 短路逻辑符
        // 1.&&
        // 运行结果跟单个&是一样的
        // 表示两边都为真，结果才为真
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        // 2.||
        // 运行结果跟单个|是一样的
        // 表示两边都为假，结果才为假
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        // 3.短路逻辑运算符具有短路效果
        // 简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);



        // 数字6 输入2个数，如果其中一个数是6，则true；如果和为6的倍数，则true，否则为false
        Scanner sc = new Scanner(System.in);
        System.out.println("111:");
        int a1 = sc.nextInt();
        System.out.println("2222:");
        int a2 = sc.nextInt();
        boolean c1 = a1 ==6 || a2 == 6;
        boolean c2 = (a1 + a2) % 6 == 0;
        boolean result3 = c1 || c2;
        System.out.println(result3);

    }
}
