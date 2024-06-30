package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/31
 * @Description:身份证信息查看
 * @VERSON:1.7
 * @Requirement:
 */
public class Test43 {
    public static void main(String[] args) {
        String idCard = "321284200006133411";

        String birthyear = idCard.substring(6,10);
        String birthmonth = idCard.substring(10,12);
        String birthday = idCard.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + birthyear + "年" + birthmonth + "月" + birthday + "日");

        char male = idCard.charAt(16);

        int male1 = Integer.valueOf(male);

        if (male1%2 == 0){
            System.out.println("girl");
        }else {
            System.out.println("boy");
        }
    }
}
