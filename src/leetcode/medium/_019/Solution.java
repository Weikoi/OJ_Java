package leetcode.medium._019;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fir =head;
        ListNode sec =head;
        while(n!=0){
            fir = fir.next;
            n--;
        }
        if(fir.next!=null){
            while(fir.next!=null){
                fir=fir.next;
                sec=sec.next;
            }
            sec.next = sec.next.next;
        }else head = head.next;

        return head;
    }
}
