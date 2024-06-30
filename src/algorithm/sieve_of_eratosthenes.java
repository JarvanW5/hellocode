package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JarvanW
 * @Date:2024/2/27
 * @Description:埃氏筛-----用来找出一定范围内的所有质数
 * @Version:1.8
 * @Requirement:
 */
public class sieve_of_eratosthenes {

    // 接受一个整数“n”作为参数，返回一个‘List<Integer>’
    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];       //  定义一个布尔数组，用来标记每个数字是否是质数，其中 isPrime[i] 表示数字 i 是否为质数。初始时，所有的布尔值都被设为 false，表示所有的数字都被标记为非质数。
        List<Integer> primes = new ArrayList<>();     //  这是一个整数列表，用于存储找到的质数。

        // 初始化，将所有数标记为质数
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 开始筛选
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // 将当前质数的倍数标记为非质数
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 收集所有质数
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 30; // 设置上限数
        List<Integer> primes = sieve(n);

        System.out.println("质数列表:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
