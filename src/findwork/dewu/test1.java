package findwork.dewu;

import java.util.Scanner;

/**
 * @Author: JarvanW
 * @Date: 2024/9/24
 * @Description:
 * @Requirements:
 */

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        String str = scanner.next();

        int upperCount = 0;
        int lowerCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)){
                upperCount++;
            }else {
                lowerCount++;
            }
        }

        if (lowerCount >= k){
            System.out.println(upperCount + (int) k);
        }else {
            k -= lowerCount;
            upperCount += lowerCount;

            if (k % 2 == 0){
                System.out.println(upperCount);
            }else {
                System.out.println(upperCount - 1);
            }
        }
        scanner.close();
    }
}
