package com.itheima.test;

import java.util.ArrayList;

/*
 * @Auther:JarvanW
 * @Date:2023/8/5
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */

/*
boolean add(E e)    添加
boolean remove(E e)     删除
E remove(int index)
E set(int index,E e)    修改
E get(int index)        查询
int size()              获取长度
 */
public class Test52 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list);

        //3.删除元素

        list.remove("aaa");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        //4。修改元素
        list.set(0, "aaa");
        System.out.println(list);

        //5.查询元素
        String result = list.get(0);
        System.out.println(result);


        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);

        }


    }

}
