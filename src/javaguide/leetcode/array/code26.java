package javaguide.leetcode.array;

/**
 * @Author:JarvanW
 * @Date:2024/6/25
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code26 {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3,3,4,4,5,6};
        int i = removeDuplicates(nums);
        System.out.println(i);

    }
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
