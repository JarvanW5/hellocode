package com.itheima.test_string;

/**
 * @Author:JarvanW
 * @Date:2023/9/13
 * @Description:String构造方法代码实现和内存分析
 * @Version:1.8
 * @Requirement:
 */
public class string03 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式来获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式来获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //3.传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //4.传递一个字符串数组，根据字符串数组的内容再创建一个新的字符串对象
        char[] chars = {'a','b','c','d'};
        String s4 = new String(chars);
        System.out.println(s4);


        chars[0] = 'Q';
        String s5 = new String(chars);
        System.out.println(s5);
    }
}
