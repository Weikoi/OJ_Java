package leetcode.easy._206;

public class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode init = new ListNode(0);
        ListNode cur1 = head;

        while(cur1!=null && cur1.next!=null){
            ListNode cur2 = cur1.next;
            cur1.next = cur2.next;
            cur2.next = init.next;
            init.next = cur2;
            cur2 = cur1.next;
        }
        return init.next;
    }
}
