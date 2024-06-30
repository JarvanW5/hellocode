package test.yuewen;

/**
 * @Author:JarvanW
 * @Date:2024/5/7
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public static int maxProduct (int[] nums) {
        // write code here
        if (nums == null || nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;

            }
            max = Math.max(nums[i], max*nums[i] );
            min = Math.min(nums[i], min*nums[i] );

            result = Math.max(result,max);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,-1,4};

        int i = maxProduct(nums);
        System.out.println(i);
    }
}
