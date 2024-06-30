package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/10
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test1 {


    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println((1 / 0));
            } catch (Exception e) {
            }
        }
    }


}
