package javaguide.leetcode.list;

/**
 * @Author: JarvanW
 * @Date: 2024/7/3
 * @Description: 环形链表II
 * @Requirements: 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 为了表示给定链表中的环，使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 */

public class code142 {

    /*
    detectCycle 方法接收一个链表的头节点 head，并返回环的起始节点，如果没有环则返回 null。
    使用了快慢指针来检测是否有环，如果有环，再利用相遇点来确定环的起始节点。
    外层循环用来检测是否存在环，内层循环用来找到环的起始节点。
     */
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: 如果存在循环，则使用快速和慢速指针查找交点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: 快指针重置为头部，同时慢速和快速移动一步
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // 找到环的起始节点
            }
        }

        return null; // 没找到环
    }

    // 用于打印链接列表的功能
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        System.out.println("Original listA:");
        printList(headA);
    }
}
