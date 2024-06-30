package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/25
 * @Description:
 * @VERSON:1.7
 * @Requirement:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
 */
public class Test39 {
    public static void main(String[] args) {
        //
        int arr[] = {1,2,3,4,5,6};
        String r = arrToString(arr);
        System.out.println(r);
    }

    public static String arrToString(int[] arr){
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }


        }
        result = result + "]";
        return result;
    }
}
