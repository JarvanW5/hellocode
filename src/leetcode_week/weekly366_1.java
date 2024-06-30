package leetcode_week;

/**
 * @Author:JarvanW
 * @Date:2023/10/8
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class weekly366_1 {
    public static void main(String[] args) {


        int result = differenceOfSums(10,3);
        System.out.println(result);
    }

    public static int differenceOfSums(int n, int m) {

        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % m != 0) {
                num1 += i;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            if (i % m == 0) {
                num2 += i;
            }

        }

        return num1 - num2;
    }
}
