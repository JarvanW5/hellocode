package com.itheima.ui;

import javax.swing.*;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class RegisterJframe extends JFrame {
    public RegisterJframe(){
        //在创建登录界面的时候，同时给出这个界面去设置一些信息
        //比如，宽高，直接展示出来

        this.setSize(488,500);

        //设置界面的标题
        this.setTitle("拼图 注册界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }
}
