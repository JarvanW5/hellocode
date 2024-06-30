/**
 * @Author:JarvanW
 * @Date:2024/4/23
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class F1ScoreCalculator {

    public static void main(String[] args) {
        // 示例输入，你可以根据需要修改这些值
        double recall = 62.85;
        double precision = 53.22;

        double f1Score = calculateF1Score(recall, precision);
        System.out.println("F1 Score: " + f1Score);
    }

    // 计算F1值的方法
    public static double calculateF1Score(double recall, double precision) {
        // 避免分母为零
        if (recall == 0 || precision == 0) {
            return 0.0;
        }

        // F1 = 2 * (precision * recall) / (precision + recall)
        return 2 * (precision * recall) / (precision + recall);
    }
}

