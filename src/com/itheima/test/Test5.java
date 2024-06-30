package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:赋值运算符
 * @VERSON:1.7
 */
public class Test5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        a += b;
        System.out.println(a);
        System.out.println(b);

        // 细节：
        // +=,-=,*=,/=,%=底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1;
        // 实际上应该是等同于  s = (short) (s+1);
        System.out.println(s);
    }
}
