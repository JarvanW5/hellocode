package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/8/1
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test45 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();


        //2.添加
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        System.out.println(sb);

        //3.反转
        sb.reverse();
        System.out.println(sb);

        //4.获取长度
        int len = sb.length();
        System.out.println(len);

        //5.变成string类型
        String str = sb.toString();
        System.out.println(str);

    }
}
