package com.itheima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:JarvanW
 * @Date:2023/9/18
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class regexDemo {
    public static void main(String[] args) {
        String str = "Java自是当地环境哈德回家撒看见啊是动物，Java8和Java11，季后赛的计划分为系欸滴哦额外喀什的金额Java7，时间多久啊就撒娇好看建文帝";

//        Pattern：表示正则表达式
//        Matcher：文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。在大串中去找符合匹配规则的子串。

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        //m:文本匹配器的对象
        //str:大串
        //p:规则
        //m要在str中找符合p规则的小串
        Matcher m = p.matcher(str);


        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，方法返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1
        //0,4

        boolean b = m.find();


        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引，结束索引)；包头不包尾
        //（0，4）但是不包括4索引
        //会把截取的小串进行返回
        String s1 = m.group();
        System.out.println(s1);

        //第二次在调用find的时候，会继续读取后面的内容
        //读取到第二个满足要求的子串，方法会继续返回true
        //并把第二个子串的起始索引和结束索引+1，进行记录
        b = m.find();

        //第二次调用group方法的时候，会根据find方法记录的索引再次截取子串
        String s2 = m.group();
        System.out.println(s2);


    }
}
