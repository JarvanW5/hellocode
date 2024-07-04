package javaguide.leetcode.list;

/**
 * @Author: JarvanW
 * @Date: 2024/7/3
 * @Description: 删除链表的倒数第N个节点
 * @Requirements: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */

public class code19 {
    // 用于打印链接列表的功能
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 用于从列表末尾删除第n个节点的函数
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);    // 新建一个虚拟头节点
        dummyHead.next = head;     // 虚拟头节点 指向 头节点
        ListNode first = dummyHead;       // 双指针第一个指针
        ListNode second = dummyHead;      // 双指针第二个指针

        // 将第二个指针向前移动n+1步
        for (int i = 0; i <= n; i++) {
            second = second.next;
        }

        // 将第一个指针和第二个指针一起移动，直到第二个到达终点
        while (second != null) {
            first = first.next;
            second = second.next;
        }

        // 从末端移除第n个节点
        if (first.next != null){
            first.next = first.next.next;
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        int n = 2;
        ListNode newHead = removeNthFromEnd(head, n);

        System.out.println("\nAfter removing the " + n + "th node from the end:");
        printList(newHead);
    }
}
