package com.itheima.example.goods;

/*
 * @Auther:JarvanW
 * @Date:2023/7/12
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class GoodTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Good[] arr = new Good[3];
        //2.创建三个商品对象
        Good g1 = new Good("001","1手机",9999,200);
        Good g2 = new Good("002","2手机",9999,200);
        Good g3 = new Good("003","3手机",9999,200);

        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Good good = arr[i];
            System.out.println(good.getId()+good.getName()+good.getPrice()+good.getCount());
        }
    }
}
