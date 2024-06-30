package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/31
 * @Description:敏感词替换
 * @VERSON:1.7
 * @Requirement:
 */
public class Test44 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你TMD";

        String result = talk.replace("TMD","***");
        System.out.println(result);

    }
}
