package leetcode_hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: JarvanW
 * @Date: 2024/8/29
 * @Description:
 * @Requirements:
 */

public class code56new {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length == 0) return new int[0][];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        LinkedList<int[]> arrayList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (arrayList.isEmpty() || arrayList.getLast()[1] < interval[0]) {
                arrayList.add(interval);
            } else {
                arrayList.getLast()[1] = Math.max(arrayList.getLast()[1], interval[1]);
            }
        }
        return arrayList.toArray(new int[arrayList.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    }


}
