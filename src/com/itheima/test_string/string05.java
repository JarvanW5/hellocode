package com.itheima.test_string;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/14
 * @Description:用户登录
 * @Version:1.8
 * @Requirement:已知正确的用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
 */
public class string05 {
    public static void main(String[] args) {
        //读题拆解法

        //1.定义正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";


        Scanner sc = new Scanner(System.in);


        //2.键盘录入
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();


            //3.判断是否正确
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("匹配成功");

            } else if (i < 2) {
                System.out.println("用户输入第" + (i + 1) + "次失败，请重新输入");
            } else if (i == 2) {
                System.out.println("用户输入第" + (i + 1) + "次失败，账号被锁定");
            }
        }
    }
}
