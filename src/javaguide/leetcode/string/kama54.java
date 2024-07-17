package javaguide.leetcode.string;
import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/7/17
 * @Description: 54. 替换数字
 * @Requirements: 题目描述
 * 给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，而将每个数字字符替换为number。 例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。
 * 输入描述
 * 输入一个字符串 s,s 仅包含小写字母和数字字符。
 * 输出描述
 * 打印一个新的字符串，其中每个数字字符都被替换为了number
 * 输入示例
 * a1b2c3
 * 输出示例
 * anumberbnumbercnumber
 */

public class kama54 {
    public static String replaceNumber(String s) {
        int count = 0; // 统计数字的个数
        int sOldSize = s.length();
        for (int i = 0; i < s.length(); i++) {
            // Character.isDigit() 判断字符是否为数字
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        // 扩充字符串s的大小，也就是每个空格替换成"number"之后的大小
        char[] newS = new char[s.length() + count * 5];
        int sNewSize = newS.length;
        // 将旧字符串的内容填入新数组
        System.arraycopy(s.toCharArray(), 0, newS, 0, sOldSize);
        // 从后先前将空格替换为"number"
        for (int i = sNewSize - 1, j = sOldSize - 1; j < i; j--, i--) {
            if (!Character.isDigit(newS[j])) {
                newS[i] = newS[j];
            } else {
                newS[i] = 'r';
                newS[i - 1] = 'e';
                newS[i - 2] = 'b';
                newS[i - 3] = 'm';
                newS[i - 4] = 'u';
                newS[i - 5] = 'n';
                i -= 5;
            }
        }
        return new String(newS);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(replaceNumber(s));
        scanner.close();
    }
}




