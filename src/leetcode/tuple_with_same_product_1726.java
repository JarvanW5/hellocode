package leetcode;

/**
 * @Author:JarvanW
 * @Date:2023/10/19
 * @Description:同积元组
 * @Version:1.8
 * @Requirement:
 */
public class tuple_with_same_product_1726 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6};
        int num = tupleSameProduct(nums);
        System.out.println(num);

    }

    public static int tupleSameProduct(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                for (int i2 = 0; i2 < nums.length; i2++) {
                    for (int i3 = 0; i3 < nums.length; i3++) {
                        while (i != i1 && i != i2 && i != i3 && i1 != i2 && i1 != i3 && i2 != i3) {
                            if (i * i1 == i2 * i3) {
                                count++;
                            }
                        }
                    }

                }
            }
        }

        return count;
    }
}
