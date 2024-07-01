package javaguide.leetcode;

/**
 * @Author: JarvanW
 * @Date: 2024/7/1
 * @Description: 移除链表元素
 * @Requirements: 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */

public class code203 {
//    public static void main(String[] args) {
//
//    }
//
//    public static ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return head;
//        }
//        head.next = removeElements(head.next, val);
//        return head.val == val ? head.next : head;
//
//    }

    public static ListNode removeElements(ListNode head, int val) {
        // 处理头节点是要删除的节点的情况
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        // 处理中间节点和尾节点是要删除的节点的情况
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // 测试主函数
    public static void main(String[] args) {
        // 创建一个链表：1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // 打印原始链表
        System.out.println("原始链表：");
        printLinkedList(head);

        // 删除值为 6 的节点
        int valToRemove = 6;
        ListNode listNode = removeElements(head, valToRemove);

        // 打印删除节点后的链表
        System.out.println("\n删除值为 " + valToRemove + " 的节点后的链表：");
        printLinkedList(listNode);
    }

    // 辅助函数：打印链表
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
