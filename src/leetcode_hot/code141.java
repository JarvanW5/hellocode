package leetcode_hot;

import java.util.HashSet;

/**
 * @Author:JarvanW
 * @Date:2024/5/9
 * @Description:环形链表
 * @Version:1.8
 * @Requirement:
 */
public class code141 {

    public static boolean hasCycle(ListNode head) {

        HashSet<ListNode> listNodes = new HashSet<>();
        while (head != null) {
            if (!listNodes.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;

    }


}
