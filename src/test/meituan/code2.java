package test.meituan;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code2 {
    public static long maxSUm(long n) {
        String numStr = String.valueOf(n);
        int maxLength = numStr.length();
        long maxSum = Long.MIN_VALUE;

        if (maxLength == 1){
            return n;
        }

        boolean isNegative = false;
        int startIndex = 0;
        if (numStr.charAt(0)=='-'){
            isNegative = true;
            startIndex = 1;
        }


        for (int i = startIndex + 1; i < maxLength; i++) {
            String firstPart = numStr.substring(startIndex, i);
            String secondPart = numStr.substring(i);

            long firstNum = Long.parseLong(firstPart);
            long secondNum = Long.parseLong(secondPart);

            long sum = isNegative ? secondNum -firstNum : secondNum + firstNum;


            maxSum = Math.max(maxSum, sum);


        }


        return maxSum;
    }

    public static void main(String[] args) {
        long num1 = 10;
        long num2 = -918;
        System.out.println(maxSUm(num1));
        System.out.println(maxSUm(num2));
    }
}
