package javaguide.leetcode.testcode;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("执行 try 代码.");

            //1、程序在 try 块中遇到 System.exit() 方法，会立即终止程序的执行，这时 finally 块中的代码不会被执行，
//            System.exit(0);

            //2、在 try 快中遇到 Runtime.getRuntime().halt() 代码，强制终止正在运行的 JVM。
            // 与 System.exit()方法不同，此方法不会触发 JVM 关闭序列。因此，当我们调用 halt 方法时，都不会执行关闭钩子或终结器。
            Runtime.getRuntime().halt(0);
        } finally {
            System.out.println("执行 finally 代码.");
        }
    }
}
