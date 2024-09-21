package findwork.fiveeightcity;

public class test1 {
    static final int MOD = 1000000007;

    public static long[] fact;
    public static long[] invFact;

    public static void precompute(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[n] = modInverse(fact[n], MOD);
        for (int i = n - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
    }


    public static long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    public static long power(long x, long y, int mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }

    public static long comb(int n, int r) {
        if (r > n || r < 0) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }


    public int numberOfWays(int startPos, int endPos, int k) {
        // write code here
        int distance = Math.abs(endPos - startPos);
        if (distance > k || (k - distance) % 2 != 0) {
            return 0;
        }

        int n = (k - distance) / 2;

        precompute(k);

        return (int) comb(k, n);
    }
}
