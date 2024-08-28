package findwork.meituan.m240810;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/8/24
 * @Description:
 * @Requirements: 小美准备登录美团, 需要输入密码, 小美忘记了密码, 只记得密码可能是 n 个字符串中的一个。小美会按照密码的长度从小到大依次尝试每个字符串, 对于相同长度的字符串, 小美随机尝试, 并且相同的密码只会尝试一次。小美想知道, 她最少需要尝试多少次才能登录成功, 最多需要尝试多少次才能登录成功。
 * <p>
 * 小美不会重新尝试已经尝试过的字符串。成功登录后会立即停止尝试。
 * <p>
 * 输入描述
 * 第一行输入一个整数 n（1≤n≤1000） 代表密码字符串的个数。
 * <p>
 * 第二行输入一个只由小写字母组成的字符串 s（1≤∣s∣≤1000）代表正确的密码。
 * <p>
 * 接下来 n 行, 每行输入一个长度不超过 1000 的字符串, 代表小美记得的密码。
 * <p>
 * 输出描述
 * 在一行上输出两个整数, 表示最少和最多尝试次数。
 */

public class login_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 读取整数后的换行符
        String correctPassword = sc.nextLine();

        List<String> passwords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            passwords.add(sc.nextLine());
        }

        // 根据字符串长度排序
//        passwords.sort(Comparator.comparingInt(String::length));
        passwords.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        int minTries = 0;
        int maxTries = 0;
        int correctPasswordLength = correctPassword.length();
        int sameLengthCount = 0;

        for (String password : passwords) {
            if (password.length() < correctPasswordLength) {
                minTries++;
            } else if (password.length() == correctPasswordLength) {
                sameLengthCount++;
            }
        }

        // 最少尝试次数是跳过比正确密码短的所有密码并且第一次尝试相同长度的密码
        minTries = minTries + 1;
        // 最多尝试次数是尝试了所有相同长度的密码中的最后一个
        maxTries = minTries + sameLengthCount - 1;

        System.out.println(minTries + " " + maxTries);
    }
}
