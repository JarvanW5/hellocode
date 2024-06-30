package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/7
 * @Description: 取值范围：  byte<short<int<long<float<double
 * @VERSON:1.7
 */
public class Test3 {
    public static void main(String[] args) {

        //隐式转换（自动类型提升）
        //把一个取值范围小的数值，转成取值范围大的数值
        int a = 10;
        double b = a;
        System.out.println(b);

        // c先转换成double类型，再与d相加
        int c = 10;
        double d = 12.3;
        System.out.println(c + d);

        // byte short char 先转换成int 再进行计算


        // 强制转换 将一个取值范围大的数值，赋值给取值范围小的变量

        // 格式： 目标数据类型  变量名  =  （目标数据类型） 被强转的数据

        double a1 = 12.3;
        int b1 = (int) a1;
        System.out.println(b1);

        byte c1 = 10;
        byte c2 = 20;
        int result1 = c1 + c2;
        byte result2 = (byte) (c1 + c2);
        System.out.println(result1);
        System.out.println(result2);


        // 算术运算符
        System.out.println(1 + 2 + "abc" + 2 + 1);
    }
}
