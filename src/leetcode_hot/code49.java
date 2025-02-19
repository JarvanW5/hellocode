package leetcode_hot;

import java.util.*;

/**
 * @Author:JarvanW
 * @Date:2024/4/14
 * @Description: 字母异位词分组
 * @Version:1.8
 * @Requirement: String中的 toCharArray()方法，将字符串“str” 转换为字符数组 "array"
 */
public class code49 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashmap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);

            List<String> list = hashmap.getOrDefault(s, new ArrayList<>());
            list.add(str);
            hashmap.put(s, list);
        }

        return new ArrayList<>(hashmap.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);

        System.out.println(lists);

    }


}
