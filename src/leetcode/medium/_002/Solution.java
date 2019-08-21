package leetcode.medium._002;


// * Definition for singly-linked list.

public class Solution {
    public static void main(String[] args) {


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode init = new ListNode(0);
        ListNode cur = init, cur1 = l1, cur2 = l2;
        int temp = 0;

        while (cur1 != null || cur2 != null) {

            temp /= 10;
            if (cur1 != null) {
                temp += cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                temp += cur2.val;
                cur2 = cur2.next;
            }
            ListNode node = new ListNode(temp % 10);
            cur.next = node;
            cur = cur.next;
        }
        if (temp / 10 != 0) {
            cur.next = new ListNode(1);
        }

        return init.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}