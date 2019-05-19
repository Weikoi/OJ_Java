package leetcode.easy._234;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = reverse(slow.next);

        while(head2!=null){
            if(head.val!=head2.val) return false;
            head=head.next;
            head2=head2.next;
        }
        return true;


    }

    public ListNode reverse(ListNode head){

        ListNode init = new ListNode(0);
        init.next=head;

        ListNode cur1 = head;
        while(cur1!=null&&cur1.next!=null){
            ListNode cur2 = cur1.next;
            cur1.next = cur2.next;
            cur2.next = init.next;
            init.next = cur2;
        }
        return init.next;
    }
}