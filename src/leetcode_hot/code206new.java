package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code206new {

    public static ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
    }


}
