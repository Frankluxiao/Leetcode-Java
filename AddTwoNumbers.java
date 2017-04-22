// 2. Add Two Numbers
/*
reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry = 0;
        while(p1 != null || p2 != null || carry != 0) {
            int lNum1 = (p1 != null ? p1.val : 0);
            int lNum2 = (p2 != null ? p2.val : 0);
            p.next = new ListNode((lNum1+lNum2+carry)%10);
            carry = (lNum1+lNum2+carry)/10;
            p = p.next;
            p1 = (p1 != null ? p1.next : null);
            p2 = (p2 != null ? p2.next : null);
        }
        return dummy.next;
    }
}
