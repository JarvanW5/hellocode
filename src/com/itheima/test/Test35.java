package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/11
 * @Description:输出语句
 * @VERSON:1.7
 * @Requirement:
 */
public class Test35 {
    // 两部分参数：
    // 第一部分参数：要输出的内容%s(占位)
    // 第二部分参数：填充的数据
    public static void main(String[] args) {
        System.out.printf("你好啊%s","张三");
        System.out.println();
        System.out.printf("%s你好啊%s","张三","李四");
    }
}
