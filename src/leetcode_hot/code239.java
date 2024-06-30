package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date: 2024/4/21
 * @Description:
 * @Version:1.8
 * @Requirement: 滑动窗口最大值
 * <p>
 * 双端队列的创建
 * Deque<Integer> deque = new ArrayDeque<>();
 * <p>
 * 判断双端队列是否为空
 * deque.isEmpty()
 * <p>
 * 双端队列的创建
 * Deque<Integer> deque = new ArrayDeque<>();
 * <p>
 * 判断双端队列是否为空
 * deque.isEmpty()
 * <p>
 * 获取双端队列的头部元素
 * deque.peek()
 * <p>
 * 用于移除双端队列中的头部元素
 * deque.poll()
 * <p>
 * 用于获取双端队列中的尾部元素
 * deque.peekLast()
 * <p>
 * 用于移除双端队列的尾部元素
 * deque.pollLast()
 * <p>
 * 用于将指定的元素添加到队列的尾部
 */

/**
 * 双端队列的创建
 * Deque<Integer> deque = new ArrayDeque<>();
 *
 * 判断双端队列是否为空
 * deque.isEmpty()
 *
 * 获取双端队列的头部元素
 * deque.peek()
 *
 * 用于移除双端队列中的头部元素
 * deque.poll()
 *
 * 用于获取双端队列中的尾部元素
 * deque.peekLast()
 *
 * 用于移除双端队列的尾部元素
 * deque.pollLast()
 *
 * 用于将指定的元素添加到队列的尾部
 * deque.offer()
 *
 *
 *
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class code239 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums == null || nums.length == 0 || k <= 0) {
//            return new int[0];
//        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices outside of the sliding window
            // 删除滑动窗口之外的索引，开始滑动
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements from the back of the deque
            // 保证双端队列中的元素是按降序排列的，队头元素就是当前窗口内的最大值
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current index to the deque
            // 将当前索引添加到双端队列
            deque.offer(i);

            // Add maximum element to the result array
            // 将最大元素添加到结果队列
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();

        }

        int k = scanner.nextInt();
        int[] result = maxSlidingWindow(nums, k);
        System.out.println("滑动窗口中的最大值：");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
