package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/*
 * @Auther:JarvanW
 * @Date:2023/7/10
 * @Description:双色球
 * @VERSON:1.7
 * @Requirement:
 */
public class Test32 {
    public static void main(String[] args) {
        // 1、生成中奖号码
        // red 6位；blue 1位
        int[] ticketArr = createArr();
        System.out.println("彩票号码为");
        for (int i = 0; i < ticketArr.length; i++) {
            if (i == ticketArr.length - 1) {
                System.out.println(ticketArr[i]);
            } else {
                System.out.print(ticketArr[i] + ",");
            }
        }

        // 2、玩家输入自己的号码
        int[] playArr = readArr();
        System.out.println("玩家号码为");
        for (int i = 0; i < playArr.length; i++) {
            if (i == playArr.length - 1) {
                System.out.println(playArr[i]);
            } else {
                System.out.print(playArr[i] + ",");
            }
        }
        price(playArr, ticketArr);

    }


    //随机生成中奖号码
    public static int[] createArr() {
        int[] arr = new int[7];
        Random r = new Random();
        //红球 6  1~33中随机数
        for (int i = 0; i < 6; ) {
            int rednum = r.nextInt(33) + 1;
            // 生成的号码不重复
            boolean flag = contains(arr, rednum);
            if (flag == false) {
                arr[i] = rednum;
                i++;
            }

        }

        //蓝球 1  1~16中随机数
        int bluenum = r.nextInt(16) + 1;
        arr[6] = bluenum;

        return arr;

    }

    //判断数字是否存在数组中
    public static boolean contains(int[] arr, int num) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }



    //判断是否中奖
    public static void price(int[] arr1, int[] arr2) {
        int count = 0;
        int arr[] = new int[7];
        for (int i = 0; i < arr1.length - 1; i++) {

            if (arr1[i] == arr2[i]) {
                count++;
                arr[count - 1] = i + 1;

            }
        }
        if (arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
            count++;
            arr[count - 1] = arr1.length;
        } else {
        }
        if (count > 0) {
            System.out.println("恭喜您中奖，中奖号码" + count + "位");
            System.out.print("分别是");
            for (int i = 0; i < count; i++) {
                if (i<count-1){
                    System.out.print("第" + arr[i]+"、");
                }else {
                    System.out.print("第" + arr[i]);
                }
            }
        } else {
            System.out.println("谢谢惠顾！");
        }

    }




    //读取玩家号码
    public static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        int playArr[] = new int[7];
        for (int i = 0; i < playArr.length; ) {
            if (i < playArr.length - 1) {
                System.out.println("请输入第" + (i + 1) + "个红球号码");
                int num = sc.nextInt();
                if (num > 0 && num < 34) {
                    boolean flag = contains(playArr, num);
                    if (!flag) {
                        playArr[i] = num;
                        i++;
                    } else {
                        System.out.println("当前红色号码存在，请重新输入");
                    }
                }
            } else {
                System.out.println("请输入第" + (i + 1) + "个蓝球号码");
                int num = sc.nextInt();
                playArr[i] = num;
                break;
            }
        }
        return playArr;

    }
}
