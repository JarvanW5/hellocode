package com.itheima.test_string;

import com.itheima.exam.main;

import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2023/9/16
 * @Description:金额转换
 * @Version:1.8
 * @Requirement:
 */
public class string08 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 999999999) {
                break;

            } else {
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        //2.得到money里面的每一位数字
        while (true) {
            //从右往左获取数据，因为右侧是数据的个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
//            System.out.println(moneyStr);
            //去掉刚刚获取的数据
            money = money / 10;

            //如果数字上的每一位全部获取到了，那么money记录的就是0，此时循环结束
            if (money == 0) {
                break;

            }

        }

        //3.在前面补0，补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;

        }
//        System.out.println(moneyStr);

        String moneyStrNew = "";
        //4.插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        for (int i = 0; i < arr.length; i++) {
            char a = moneyStr.charAt(i);
            moneyStrNew = moneyStrNew + a + arr[i];

        }

        System.out.println(moneyStrNew);

    }


    //定义一个方法把数字变成大写的中文
    //1  ------  壹
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }


}
