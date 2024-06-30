package com.itheima.test_string;

/**
 * @Author:JarvanW
 * @Date:2023/9/16
 * @Description:手机号屏蔽
 * @Version:1.8
 * @Requirement:
 */
public class String09 {
    public static void main(String[] args) {
        //1.获取一个手机号
        String phoneNumber = "15751000857";

        //2.截取手机号码前三位
        String start = phoneNumber.substring(0, 3);   //包头不包尾，包左不包右

        String end = phoneNumber.substring(7, 11);

        String result = start + "****" + end;

        System.out.println(result);


        //身份证
        String id = "321284200006133411";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String date = id.substring(12, 14);

        String result1 = year + "年" + month + "月" + date + "日";
        System.out.println(result1);


        //3.获取性别
        char gender = id.charAt(16); //'3'
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");

        } else {
            System.out.println("性别为：男");
        }


        //敏感词替换
        //1.获取到说的话
        String talk = "你TMD的，CNM的，你是SB，MLGB的";

        //2.把里面的敏感词替换成***
        String result3 = talk.replace("TMD", "***");


        //2.定义一个敏感词库
        String[] arr2 = {"TMD", "CNM", "SB", "MLGB"};
        for (int i = 0; i < arr2.length; i++) {
            talk = talk.replace(arr2[i], "***");

        }
        System.out.println(talk);
    }
}
