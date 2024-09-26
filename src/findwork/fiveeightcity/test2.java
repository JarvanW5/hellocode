package findwork.fiveeightcity;

public class test2 {
    public static int StringSplit(String str) {
        // write code here
        int totalB = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'b') {
                totalB++;
            }
        }

        int maxScore = 0;
        int countA = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else {
                totalB--;
            }
            maxScore = Math.max(maxScore, countA + totalB);
        }


        return maxScore;
    }
}
