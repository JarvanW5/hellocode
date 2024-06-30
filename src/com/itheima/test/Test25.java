package com.itheima.test;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/9
 * @Description:买飞机票和找质数
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
/*
需求： 1、机票的价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
      2、按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
      3、cost原价   month月份   airclass舱位
 */
public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int cost = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入飞机舱位,1头等舱、2经济舱：");
        int airclass = sc.nextInt();
        double money = airTicket(cost,month,airclass);
        System.out.print(money);

    }


    public static double airTicket(int cost, int month, int airclass) {
        double money = 0;
        if (month >= 5 && month <= 10) {
            if (airclass == 1) {
                money = cost * 0.9;
                System.out.println("旺季（5-10月）头等舱9折,因此机票价格为：");
            } else if (airclass == 2) {
                money = cost * 0.85;
                System.out.println("旺季（5-10月）经济舱85折,因此机票价格为：");
            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            if (airclass == 1) {
                money = cost * 0.7;
                System.out.println("淡季（11月到来年4月）头等舱7折,因此机票价格为：");
            } else if (airclass == 2) {
                money = cost * 0.65;
                System.out.println("淡季（11月到来年4月）经济舱65折,因此机票价格为：");
            }
        }
        return money;
    }

}
