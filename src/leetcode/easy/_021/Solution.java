package leetcode.easy._021;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode init = new ListNode(0);
        ListNode cur = init;

        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                cur.next = cur1;
                cur = cur.next;
            }else{
                cur.next = cur2;
                cur = cur.next;
            }
        }
        if(cur1==null)cur.next=cur2;
        if(cur2==null)cur.next=cur1;
        return init.next;
    }
}
