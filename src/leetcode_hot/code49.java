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

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // 将字符串 "str" 转换为字符数组 "array"   "str" --> "'s','t','r'"
            char[] array = str.toCharArray();
            // 数组排序
            Arrays.sort(array);
            // 将数组中的单词再排序成字符串
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);

        System.out.println(lists);

    }





}
