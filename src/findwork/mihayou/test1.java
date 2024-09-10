package findwork.mihayou;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();

        int maxCount = -1;
        int resultNumber = n;
        for (int i = n; i <= m; i++) {
            String number = String.valueOf(i);
            int count4 = 0;
            int count6 = 0;

            for (char ch : number.toCharArray()) {
                if (ch == '4'){
                    count4++;
                }else if (ch == '6'){
                    count6++;
                }
            }

            int total = count4 + count6;

            if (total > maxCount || (total == maxCount && i > resultNumber)){
                maxCount = total;
                resultNumber = i;
            }

        }
        System.out.println(resultNumber);
    }
}
