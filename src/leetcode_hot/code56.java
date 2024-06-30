package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author:JarvanW
 * @Date:2024/4/22
 * @Description:合并区间
 * @Version:1.8
 * @Requirement:
 */
public class code56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        ArrayList<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < left) {
                merged.add(new int[]{left, right});

            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], right);
            }

        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {

        int[][] tervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] merge = merge(tervals);

        for (int[] ints : merge) {
            System.out.println(ints);

        }

    }
}
