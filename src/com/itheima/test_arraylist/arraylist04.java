package com.itheima.test_arraylist;

import java.util.ArrayList;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:查找用户是否存在
 * @Version:1.8
 * @Requirement:
 */
public class arraylist04 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("1", "zhangsan", "1234");
        User u2 = new User("2", "lisi", "1234");
        User u3 = new User("3", "wangwu", "1234");

        list.add(u1);
        list.add(u2);
        list.add(u3);


        boolean result = contains(list,"2");
        System.out.println(result);
    }


    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return true;

            }
        }
        return false;
    }
}
