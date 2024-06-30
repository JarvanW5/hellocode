package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/3/6
 * @Description:找出数组中的K-or值
 * @Version:1.8
 * @Requirement:
 */
public class find_the_k_or_of_an_array_2917 {


    public static int kOrValues(int[] nums, int k) {
            int ans = 0;
            for (int i = 0; i < 31; ++i) {
                int cnt = 0;
                for (int num : nums) {
                    if (((num >> i) & 1) != 0) {
                        ++cnt;
                    }
                }
                if (cnt >= k) {
                    ans |= 1 << i;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        // 示例用法
        int[] nums = {7,12,9,8,9,15};
        int k = 4;

        int result = kOrValues(nums, k);

        System.out.println("K-or 值为: " + result);
        }
    }

