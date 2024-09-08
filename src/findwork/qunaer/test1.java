package findwork.qunaer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }

        Arrays.sort(numbers, (x, y) -> (x + y).compareTo(y + x));

        for (String number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
