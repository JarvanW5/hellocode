package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/8/28
 * @Description:
 * @Requirements:
 */

public class code49new {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String s = new String(charArray);

            List<String> list = hashMap.getOrDefault(s,new ArrayList<>());
            list.add(str);
            hashMap.put(s,list);
        }


        return new ArrayList<>(hashMap.values());

    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    }
}
