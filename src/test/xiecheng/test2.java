package test.xiecheng;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * @Author:JarvanW
 * @Date:2024/5/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test2 {


    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getPrime(char[] chars, int index, Set<Integer> permutations) {
        if (index == chars.length - 1) {
            permutations.add(Integer.parseInt(new String(chars)));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            getPrime(chars, index + 1, permutations);
            swap(chars, i, index);
        }
    }

    public static void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        char[] chars = String.valueOf(number).toCharArray();
        Set<Integer> permutations = new HashSet<>();

        getPrime(chars,0,permutations);

        for (int perm : permutations){
            if (isPrime(perm)){
                System.out.println(perm);
                return;
            }
        }

        System.out.println(-1);


    }

}