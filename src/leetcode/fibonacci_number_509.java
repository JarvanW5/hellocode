package leetcode;

/**
 * @Author:JarvanW
 * @Date:2023/10/9
 * @Description:斐波那契数列
 * @Version:1.8
 * @Requirement:
 */
public class fibonacci_number_509 {
    public static void main(String[] args) {

        int a = fib(3);
        System.out.println(a);


    }

    public static int fib(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i =2;i<n+1;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }


}
