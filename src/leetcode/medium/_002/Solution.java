package leetcode.medium._002;


// * Definition for singly-linked list.

public class Solution {
    public static void main(String[] args) {


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode cur1 = l1, cur2 = l2, init = node;
        int sum = 0;

        while (cur1 != null || cur2 != null) {
            sum /= 10;
            if (cur1 != null) {
                sum += cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                sum += cur2.val;
                cur2 = cur2.next;
            }
            init.next = new ListNode(sum % 10);
            init = init.next;
        }
        if (sum / 10 != 0) init.next = new ListNode(1);
        return node.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}