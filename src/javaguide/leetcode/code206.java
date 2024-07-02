package javaguide.leetcode;

/**
 * @Author: JarvanW
 * @Date: 2024/7/2
 * @Description: 反转链表
 * @Requirements: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */

public class code206 {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;// 保存下一个节点
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

        // new a List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        reverseList(head);

        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            // 单行不换行
            System.out.print(current.val + " ");
            // 多行
//            System.out.println(current.val + " ");
            current = current.next;
        }
    }
}
