package Problem2;

/*
Leetcode Problem 2

https://leetcode.com/problems/add-two-numbers/description/

Problem statement:

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
*/

// Remove this class if testing on Leetcode site since it is supplied there
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode prevResultNode = null;
        ListNode nextAddendNode1 = l1;
        ListNode nextAddendNode2 = l2;
        int carry = 0;

        while ((nextAddendNode1 != null) || (nextAddendNode2 != null) || (carry > 0)) {
            int addendDigit1 = (nextAddendNode1 == null ? 0 : nextAddendNode1.val);
            int addendDigit2 = (nextAddendNode2 == null ? 0 : nextAddendNode2.val);
            int sum = addendDigit1 + addendDigit2 + carry;
            carry = sum / 10;

            ListNode nextResultNode = new ListNode(sum % 10);

            if (result == null) {
                result = nextResultNode;
            } else {
                prevResultNode.next = nextResultNode;
            }

            prevResultNode = nextResultNode;

            if (nextAddendNode1 != null) {
                nextAddendNode1 = nextAddendNode1.next;
            }

            if (nextAddendNode2 != null) {
                nextAddendNode2 = nextAddendNode2.next;
            }
        }

        return result;
    }
}