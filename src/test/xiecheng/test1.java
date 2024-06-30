package test.xiecheng;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author:JarvanW
 * @Date:2024/5/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();

        BigInteger p = scanner.nextBigInteger();

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : x.toCharArray()){
            if (Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                if (digit % 2 != 0){
                    stringBuilder.append(digit);
                }
            }

        }

        String odd = stringBuilder.toString();
        if (odd.isEmpty()){
            System.out.println(BigInteger.ZERO.mod(p));
        }else {
            BigInteger addNumber = new BigInteger(odd);
            BigInteger result = addNumber.mod(p);
            System.out.println(result);
        }
    }
}
