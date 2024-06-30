package com.itheima.example.car;

/*
 * @Auther:JarvanW
 * @Date:2023/7/12
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */

import java.util.Scanner;

/*
键盘录入中：
第一套体系：nextInt();接收整数
          nextDouble();接收小数
          next();接收字符串
          问题：遇到空格、制表符、回车就停止接受。这些符号后面的数据就不会接受了

第二套体系：nextLine();接受字符串
         接收空格、制表符，遇到回车才停止接受数据

 */
public class carTest {
    public static void main(String[] args) {

        //1.创建一个数组用来存3个汽车对象
        car[] arr = new car[3];

        //2.创建汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            car c = new car();

            //录入品牌
            System.out.println("请输入汽车的品牌：");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格：");
            double price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组当中
            arr[i] = c;

        }

        for (int i = 0; i < arr.length; i++) {
            car car = arr[i];
            System.out.println(car.getBrand()+car.getPrice()+car.getColor());

        }

    }
}
