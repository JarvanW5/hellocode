package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/3/11
 * @Description:将标题首字母大写
 * @Version:1.8
 * @Requirement:
 */
public class capitalize_the_title_2129 {

    public static String convertToTitleCase(String title) {
        if (title == null || title.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = title.split("\\s+");

        for (String word : words) {
            if (word.length() <= 2) {
                result.append(word.toLowerCase());
            } else {
                result.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase());
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        // 示例用法
        String inputTitle = "your input title here OF";
        String outputTitle = convertToTitleCase(inputTitle);
        System.out.println("Input Title: " + inputTitle);
        System.out.println("Title in Title Case: " + outputTitle);
    }
}
