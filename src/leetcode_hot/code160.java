package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/8
 * @Description: 相交链表
 * @Version:1.8
 * @Requirement:
 */
public class code160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }


        return pA;
    }
}
