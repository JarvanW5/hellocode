package test.shopee;

/**
 * @Author:JarvanW
 * @Date:2024/4/15
 * @Description:2
 * @Version:1.8
 * @Requirement:
 */
public class code2 {
    public static String ReverseString(String originStr) {
        // write code here
        String[] words = originStr.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(reverse1(word)).append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private static String reverse1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String s = stringBuilder.reverse().toString();

        return s;
    }

    public static void main(String[] args) {
        String str = "a b c d e f g";
        String result = ReverseString(str);
        System.out.println(result);
    }
}
