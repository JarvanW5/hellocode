package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date: 2024/4/19
 * @Description: 找到字符串中所有字母异位词
 * @Version:1.8
 * @Requirement:
 */
public class code438 {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();


        int length = p.length();
        char[] chars1 = p.toCharArray();
        Arrays.sort(chars1);
        for (int i = 0; i < s.length() - length +1; i++) {
            String c = s.substring(i, i + length);
            char[] chars = c.toCharArray();
            Arrays.sort(chars);
            if (Arrays.equals(chars, chars1)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";

        List<Integer> list = findAnagrams(s, p);
        System.out.println(list);


    }

}
