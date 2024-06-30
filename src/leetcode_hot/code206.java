package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/8
 * @Description: 反转链表
 * @Version:1.8
 * @Requirement:
 */
public class code206 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head,pre = null;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }

        return pre;

    }
}
