package test.xiecheng;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author:JarvanW
 * @Date:2024/5/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        TreeMap<Integer, Integer> magicBalls = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            int bi = scanner.nextInt();
            magicBalls.put(ai, magicBalls.getOrDefault(ai, 0) + bi);
        }

        boolean merged = true;
        while (merged) {
            merged = false;
            TreeMap<Integer, Integer> newMagicBalls = new TreeMap<>();
            for (Map.Entry<Integer, Integer> entry : magicBalls.entrySet()) {
                int ai = entry.getKey();
                int bi = entry.getValue();
                if (bi >= 2) {
                    int newAi = ai + 2;
                    int newBi = bi / 2;
                    newMagicBalls.put(newAi, magicBalls.getOrDefault(newAi, 0) + newBi);
                    merged = true;


                } else {
                    newMagicBalls.put(ai, bi);
                }


            }
            magicBalls = newMagicBalls;
        }
        System.out.println(magicBalls.size());
        for (int ai : magicBalls.keySet()) {
            System.out.println(ai + " ");
        }
    }
}
