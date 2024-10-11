package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code2new {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0); // 创建一个虚拟头节点
        ListNode current = dummyHead; // 当前节点指针
        int carry = 0; // 进位

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // 获取l1当前节点的值，如果l1为空则为0
            int y = (l2 != null) ? l2.val : 0; // 获取l2当前节点的值，如果l2为空则为0
            int sum = carry + x + y; // 计算当前位的和
            carry = sum / 10; // 计算进位
            current.next = new ListNode(sum % 10); // 创建新节点存储当前位的结果
            current = current.next; // 移动当前节点指针

            if (l1 != null) l1 = l1.next; // 移动l1指针
            if (l2 != null) l2 = l2.next; // 移动l2指针
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // 如果最后还有进位，创建一个新节点
        }

        return dummyHead.next; // 返回结果链表的头节点

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 0;
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);
    }

}
