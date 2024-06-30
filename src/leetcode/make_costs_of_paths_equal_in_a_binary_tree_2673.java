package leetcode;

/**
 * @Author:JarvanW
 * @Date:2024/2/28
 * @Description:使二叉树所有路径值相等的最小代价
 * @Version:1.8
 * @Requirement:
 */
public class make_costs_of_paths_equal_in_a_binary_tree_2673 {

    public static int minIncrements(int n, int[] cost) {
        int ans = 0;
        for (int i = n - 2; i > 0; i -= 2) {
            ans += Math.abs(cost[i] - cost[i + 1]);
            // 叶节点 i 和 i+1 的双亲节点下标为 i/2（整数除法）
            cost[i / 2] += Math.max(cost[i], cost[i + 1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] cost = {1, 5, 2, 2, 3, 3, 1};
        int result = minIncrements(n, cost);
        System.out.println(result);
    }
}
