package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/28
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test42 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phonenumber = "15751000857";

        //2.截取手机号码的前面三位
        String strat = phonenumber.substring(0,3);//包头不包尾
        String end = phonenumber.substring(7);//包头不包尾
        String result = strat + "****" + end;
        System.out.println(result);


    }

}
