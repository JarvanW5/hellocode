package com.itheima.example.phone;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/17
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建数组存储
        Phone[] phoneArr = new Phone[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < phoneArr.length; i++) {
            Phone phone = new Phone();
            System.out.println("请输入手机的品牌");
            String brand = sc.next();
            phone.setBrand(brand);
            System.out.println("请输入手机的价格");
            int price = sc.nextInt();
            phone.setPrice(price);
            System.out.println("请输入手机的颜色");
            String color = sc.next();
            phone.setColor(color);

            phoneArr[i] = phone;

        }

        int sum = 0;

        for (int i = 0; i < phoneArr.length; i++) {
            Phone phone1 = phoneArr[i];
            int price = phone1.getPrice();
            sum += price;
        }

        int money = sum / phoneArr.length;
        System.out.println(money);
    }
}
