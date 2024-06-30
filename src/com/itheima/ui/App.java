package com.itheima.ui;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class App {

    public static void main(String[] args) {
        //表示程序的启动入口

        //如果我们想要开启一个界面，就创建谁的对象就可以了
        new LoginJframe();

        new RegisterJframe();

        new GameJframe();
    }

}
