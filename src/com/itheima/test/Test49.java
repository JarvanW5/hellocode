package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/8/3
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Test49 {
    /*
    给定两个字符串，A和B。
    A的旋转操作就是将A 最左边的字符移动到最右边。
    例如，若A = 'abcde'，在移动一次之后结果就是'bcdea'
    如果在若干次调整操作之后，A能够变成B，那么返回True。
    如果不能匹配成功，则返回false
     */
    public static void main(String[] args) {
        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";


        //2.abcde -> bcdea -> cdeab
        // 旋转字符串

        boolean result = check(strA,strB);
        System.out.println(result);
    }


    public static String rotate(String str){
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            newStr += c;

        }
        newStr = newStr + str.charAt(0);
        return newStr;

    }

    public static boolean check(String strA,String strB){
        int num = 0;
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            num++;
            if (strA.equals(strB)){
                System.out.println(num);
                return true;
            }

        }

        return false;
    }

}
