package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code234new {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: 找到中间节点   当fast指到null时，slow正好在中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: 反转链表的后半部分，从slow开始反转
        ListNode secondHalfStart = reverseList(slow);

        // Step 3: 比较前半部分和后半部分的值
        ListNode firstHalfStart = head;
//        ListNode secondHalfCopy = secondHalfStart; // To restore later if needed
        boolean isPalindrome = true;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                isPalindrome = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        // Step 4 (optional): Restore the reversed second half
//        reverseList(secondHalfCopy);

        return isPalindrome;
    }

    // Helper function to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


}
