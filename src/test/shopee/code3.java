package test.shopee;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:JarvanW
 * @Date:2024/4/15
 * @Description:动态规划
 * @Version:1.8
 * @Requirement:
 */
public class code3 {

    public static void main(String[] args) {
        int[] costs = {10, 20, 30, 40, 50};
        int coins = 100;

        int[] result = solution(costs, coins);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] costs, int coins) {
        // write code here

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                list.add(i);
                coins = coins - costs[i];
            } else {
                break;
            }

        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = costs[i];
        }
        return result;
    }
}
