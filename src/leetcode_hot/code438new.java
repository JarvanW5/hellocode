package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code438new {

    public static List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int sLength = s.length();
        int pLength = p.length();
        if (sLength<pLength){
            return new ArrayList<>();
        }

        char[] sCharArray = p.toCharArray();
        Arrays.sort(sCharArray);

        for (int i = 0; i < s.length() - pLength + 1; i++) {
            String substring = s.substring(i, i + pLength);
            char[] charArray = substring.toCharArray();
            Arrays.sort(charArray);

            boolean equals = Arrays.equals(sCharArray, charArray);
            if (equals){
                arrayList.add(i);
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";

        List<Integer> list = findAnagrams(s, p);
        System.out.println(list);
    }

}
