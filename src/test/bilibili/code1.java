package test.bilibili;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<List<Integer>> objects = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            g(nums,i,0,new ArrayList<>(),objects);

        }
        for (List<Integer> object : objects) {
            System.out.println(object);

        }


    }

    private static void g(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            g(nums,k-1,i+1,current,result);
            current.remove(current.size()-1);

        }
    }
}
