package leetcode_hot;

import java.util.HashSet;

/**
 * @Author:JarvanW
 * @Date:2024/5/9
 * @Description: 环形链表2
 * @Version:1.8
 * @Requirement:
 */
public class code142 {
    public ListNode detectCycle(ListNode head){

        HashSet<ListNode> hashSet = new HashSet<>();

        while(head != null){
            if (hashSet.contains(head)){
                return head;
            }else {
                hashSet.add(head);
            }
            head = head.next;
        }
        return null;
    }


}
