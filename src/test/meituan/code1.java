package test.meituan;

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
    public static List<Integer> generateArray(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < n - 1; i++) {
            arr.add(i);

        }

        arr.add(1);
        arr.add(1);


        return arr;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer> integers = generateArray(n);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
            if (i != integers.size() - 1) {
                System.out.println(" ");
            }
        }
        System.out.println(integers);

    }
}
