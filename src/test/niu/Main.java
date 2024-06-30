package test.niu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int max= s.nextInt();//第一个数字，最大值
        String in=s.nextLine();//后面的数字用于比对，存入string
        for(int i=max;i>=0;i--){//遍历
            if(!in.contains(Integer.toString(i))){//比较得出不存在串中的值
                System.out.print(i);//输出
            }
        }
    }
}
