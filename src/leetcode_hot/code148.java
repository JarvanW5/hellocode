package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // 如果链表为空或只有一个节点，直接返回
        }

        // 找到链表的中间节点
        ListNode mid = findMiddle(head);
        ListNode midNext = mid.next;
        mid.next = null; // 断开链表

        // 递归排序左右两部分
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);

        // 合并两个有序链表
        return merge(left, right);
    }

    private ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // 处理剩余部分
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

    }
}
