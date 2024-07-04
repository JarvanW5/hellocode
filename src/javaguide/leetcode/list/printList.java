package javaguide.leetcode.list;

/**
 * @Author: JarvanW
 * @Date: 2024/7/2
 * @Description:
 * @Requirements:
 */

public class printList {
    public static void main(String[] args) {

        // new a List
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        printList(head);

    }


    public static void printList(ListNode head){
        ListNode current = head;
        while (current != null){
            // 单行不换行
            System.out.print(current.val + " ");
            // 多行
            System.out.println(current.val + " ");
            current = current.next;
        }

    }
}
