package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description:自增自减运算符
 * @VERSON:1.7
 */
public class Test4 {
    public static void main(String[] args) {
        //++ and --
        // ++ 和 --无论是放在变量前还是变量后，单独写一行结果都是一样的
        int a=10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);



        int a1 = 10;
        int b = a1++;
        System.out.println(b);
        System.out.println(a1);

    }
}
