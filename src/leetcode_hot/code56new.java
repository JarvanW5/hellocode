package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code56new {

    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // 按照区间的起始位置进行排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 用一个列表来保存合并后的区间
        List<int[]> merged = new ArrayList<>();

        // 遍历每一个区间
        for (int[] interval : intervals) {
            // 如果列表为空，或者当前区间与列表中的最后一个区间不重叠
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // 合并区间
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // 转换结果列表为二维数组并返回
        return merged.toArray(new int[merged.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(intervals);
        System.out.println(merge);
    }


}
