package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/10
 * @Description:抽奖的两种实现方式
 * @VERSON:1.7
 * @autogeshi:Ctrl+alt+L
 */
public class Test31 {
    public static void shuffleArray(Object[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            // 交换当前位置的元素和随机位置的元素
            Object temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("原始数组：" + Arrays.toString(numbers));

        shuffleArray(numbers);
        System.out.println("打乱后的数组：" + Arrays.toString(numbers));
    }

}
