package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/4/23
 * @Description:轮转数组
 * @Version:1.8
 * @Requirement:
 */
public class code189 {


    // 1、使用额外的数组
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] news = new int[length];
        for (int i = 0; i < length; i++) {

            news[(i + k) % length] = nums[i];

        }

        // 这一行使用 System.arraycopy() 方法将新数组 newArr 的内容复制到原始数组 nums 中。具体来说，它将 newArr 从索引 0 开始的内容复制到 nums 中，从索引 0 开始，复制 n 个元素。
        System.arraycopy(news, 0, nums, 0, length);


    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;

        rotate(nums, k);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
