package com.itheima.exam;

import javax.management.relation.Role;

/*
 * @Auther:JarvanW
 * @Date:2023/7/11
 * @Description:主函数
 * @VERSON:1.7
 * @Requirement:
 */
public class main {
    public static void main(String[] args) {
        //1.角色
        User user1 = new User("乔峰", 100);
        User user2 = new User("鸠摩智", 100);

        //2.决斗
        while (true) {
            user1.attack(user2);
            if (user2.getBlood() == 0) {
                System.out.println(user1.getName() + "K.O了" + user2.getName());
                break;
            }
            user2.attack(user1);
            if (user1.getBlood() == 0) {
                System.out.println(user2.getName() + "K.O了" + user1.getName());
                break;
            }
        }
    }
}
