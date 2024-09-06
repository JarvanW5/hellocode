package findwork.xiaomi;
import java.util.Scanner;


public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int n = s.length();
        int[] arr = new int[n];

        // 将01串转换为[-1, 1]串
        for (int i = 0; i < n; i++) {
            arr[i] = (s.charAt(i) == '1') ? -1 : 1;
        }

        // Kadane算法找出最大子数组和
        int maxSum = 0;
        int currSum = 0;
        int start = 0, tempStart = 0;
        int l = -1, r = -1;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                l = tempStart;
                r = i;
            }
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        // 计算原本的正面朝上的硬币数量
        int initialOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                initialOnes++;
            }
        }

        // 翻转后的最大正面朝上的硬币数
        int maxOnes = initialOnes + maxSum;

        // 输出结果
        System.out.println(maxOnes);
        System.out.println((l + 1) + " " + (r + 1)); // 1-based index for the range
    }
}
