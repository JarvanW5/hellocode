package leetcode;

/*
 * @Auther:JarvanW
 * @Date:2023/8/4
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class palindrome_number_9 {
    public static void main(String[] args) {
        int x = 1231;
        int r = 0;
        while (x != 0) {
            int x1 = x % 10;
            r = r * 10 + x1;
            x = x / 10;

        }
        System.out.println(r);

    }
}
