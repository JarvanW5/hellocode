package com.itheima.example.girlfriend;

import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/17
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class GirlfriendTest {
    public static void main(String[] args) {
        //创建数组存储4
        Girlfriend[] girlfriendArr = new Girlfriend[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < girlfriendArr.length; i++) {
            Girlfriend girlfriend = new Girlfriend();
            System.out.println("请输入女朋友姓名：");
            String name = sc.next();
            girlfriend.setName(name);
            System.out.println("请输入女朋友的年龄：");
            int age = sc.nextInt();
            girlfriend.setAge(age);
            System.out.println("请输入女朋友的性别：");
            String sex = sc.next();
            girlfriend.setSex(sex);
            System.out.println("请输入女朋友的爱好：");
            String hoppy = sc.next();
            girlfriend.setHobby(hoppy);

            girlfriendArr[i] = girlfriend;

        }

        // 要求1：计算出四个女朋友的平均年龄
        int sum = 0;

        for (int i = 0; i < girlfriendArr.length; i++) {
            Girlfriend girlfriendEg = girlfriendArr[i];

            int ageEg = girlfriendEg.getAge();
            sum += ageEg;

        }
        int age = sum / girlfriendArr.length;
        System.out.println("女朋友的平均年龄为：" + age);
        // 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来
        int count = 0;
        for (int i = 0; i < girlfriendArr.length; i++) {
            Girlfriend girlfriendEg = girlfriendArr[i];

            int ageEg = girlfriendEg.getAge();
            if (ageEg < age) {
                count++;
            } else {

            }

        }
        System.out.println("比平均年龄小的女朋友有：" + count + "个");
    }
}
