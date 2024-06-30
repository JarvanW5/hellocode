package com.itheima.test;

import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/8/5
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test51 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中是四位字母，1为数字
        其中数字只有1位，但是可以出现在任意的位置
         */
        //1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] arr = new char[52];
        //a-z    A-Z
        int index = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            arr[index] = ch;
            index++;
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            arr[index] = ch;
            index++;
        }

        String result = "";
        //2.从数组当中随机获取4次
        for (int i = 0; i < 4; i++) {
            int randomIndex = new Random().nextInt(arr.length);
            String random = String.valueOf(arr[randomIndex]);

            result += random;
        }




        //3.生成一个0~9之间的随机数拼接到最后
        int randomnum = new Random().nextInt(10);
        result += randomnum;


        //4.思考：我们把7放到前面，修改了字符串的内容，把生成的验证码先变成一个字符数组，再让最后一个元素与前面的随机位置的元素进行交换，交换完之后再变成字符串就可以了
        char[] chars = result.toCharArray();
        int i1 = new Random().nextInt(chars.length);
        char temp = chars[i1];
        chars[i1] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        result = new String(chars);
        System.out.println(result);


    }
}
