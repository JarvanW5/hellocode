package leetcode;

/**
 * @Author:JarvanW
 * @Date:2023/10/17
 * @Description:倍数求和
 * @Version:1.8
 * @Requirement:
 */
public class sum_multiples_2652 {
    public static void main(String[] args) {
        int n = 7;
        int result = sumOfMultiples(n);
        System.out.println(result);
    }

    public static int sumOfMultiples(int n) {
        int[] arr = new int[n + 1];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }


        }

        return sum;

    }
}
