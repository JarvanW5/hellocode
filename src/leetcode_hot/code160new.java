package leetcode_hot;

/**
 * @Author: JarvanW
 * @Date: 2024/9/1
 * @Description:
 * @Requirements:
 */

public class code160new {
    public static void main(String[] args) {
        // 创建交叉部分
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        // 创建链表 A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;

        // 创建链表 B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;

        // 找到交点
        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("相交节点的值为: " + result.val); // 应输出8
        } else {
            System.out.println("没有相交节点");
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;

        while (pa != pb) {
            pa = (pa == null) ? headB : pa.next;
            pb = (pb == null) ? headA : pb.next;
        }
        return pa;
    }
}
