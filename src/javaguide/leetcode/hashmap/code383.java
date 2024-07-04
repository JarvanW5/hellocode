package javaguide.leetcode.hashmap;

/**
 * @Author: JarvanW
 * @Date: 2024/7/4
 * @Description: 赎金信
 * @Requirements: 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * <p>
 * 如果可以，返回 true ；否则返回 false 。
 * <p>
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */

public class code383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        // shortcut
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // 定义一个哈希映射数组
        int[] record = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 'a'] += 1;

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            record[ransomNote.charAt(i) - 'a'] -= 1;
        }

//        // 遍历
//        for (char c : magazine.toCharArray()) {
//            record[c - 'a'] += 1;
//        }
//
//        for (char c : ransomNote.toCharArray()) {
//            record[c - 'a'] -= 1;
//        }

        // 如果数组中存在负数，说明ransomNote字符串中存在magazine中没有的字符
        for (int i : record) {
            if (i < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);


    }

}
