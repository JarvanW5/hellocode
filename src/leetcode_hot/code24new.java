package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code24new {
    public static void main(String[] args) {

    }

    public static ListNode swapPairs(ListNode head) {

        // 创建一个虚拟的头节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 初始化指针
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {

            // 指向要交换的两个节点
            ListNode first = temp.next;
            ListNode second = temp.next.next;

            // 交换节点
            temp.next = second;
            first.next = second.next;
            second.next = first;
            temp = first;
        }


        return dummy.next;
    }
}
