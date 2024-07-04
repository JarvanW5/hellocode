package javaguide.leetcode.list;

/**
 * @Author: JarvanW
 * @Date: 2024/7/3
 * @Description: 两两交换链表中的节点
 * @Requirements: 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */

public class code24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(-1); // 设置一个虚拟头节点
        dummyhead.next = head; // 将虚拟头节点指向head，这样方便后面做删除操作
        ListNode cur = dummyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;      // 步骤1
            secondnode.next = firstnode;      // 步骤2
            firstnode.next = temp;        // 步骤3
            cur = firstnode;      // cur移动，准备下一轮交换
        }
        return dummyhead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

//        swapPairs(head);

        ListNode dummyhead = new ListNode(-1); // 设置一个虚拟头节点
        dummyhead.next = head; // 将虚拟头节点指向head，这样方便后面做删除操作
        ListNode cur = dummyhead;

        swapPairs(head);

        while (cur.next != null){
            cur = cur.next;
            System.out.println(cur.val);
        }
    }
}
