package leetcode_hot;

/**
 * @Author:JarvanW
 * @Date:2024/5/9
 * @Description: 合并两个有序链表
 * @Version:1.8
 * @Requirement:
 */
public class code21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;

            }

            current = current.next;
        }

        if (list1 != null){
            current.next = list1;
        }else {
            current.next = list2;
        }

        return dummyHead.next;
    }

}
