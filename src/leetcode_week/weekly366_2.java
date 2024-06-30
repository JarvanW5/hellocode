package leetcode_week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:JarvanW
 * @Date:2023/10/8
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class weekly366_2 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(8);
        list2.add(4);
        list2.add(3);
        int result = minProcessingTime(list1, list2);
        System.out.println(result);


    }

    public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int minTime = 0;
        Collections.sort(processorTime);
        Collections.sort(tasks);
        for (int i = processorTime.size() - 1; i >= 0; i--) {
           int temp = Math.max(Math.max(processorTime.get(i) + tasks.get(4 * (processorTime.size() - 1 - i) + 0), processorTime.get(i) + tasks.get(4 * (processorTime.size() - 1 - i) + 1)), Math.max(processorTime.get(i) + tasks.get(4 * (processorTime.size() - 1 - i) + 2), processorTime.get(i) + tasks.get(4 * (processorTime.size() - 1 - i) + 3)));
           if (temp > minTime){
               minTime = temp;
           }
        }


        return minTime;
    }
}
