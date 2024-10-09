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

        // 1、检查输入是否为空
        if(intervals == null || intervals.length == 0){
            return new int[0][];
        }

        // 2、按照区间的起始位置排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 3、初始化一个 LinkedList 用于存储合并后的区间
        LinkedList<int[]> arrayList = new LinkedList<>();

        // 4、遍历排序后的区间数组
        for (int[] interval : intervals) {
            // 5、判断是否需要合并区间
            if (arrayList.isEmpty() || arrayList.getLast()[1] < interval[0]) {
                arrayList.add(interval);
            } else {
                arrayList.getLast()[1] = Math.max(arrayList.getLast()[1], interval[1]);
            }
        }
        // 6、将 LinkedList 转换为二维数组并返回
        return arrayList.toArray(new int[arrayList.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    }


}
