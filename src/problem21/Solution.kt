package problem21

/*
Leetcode Problem 21

https://leetcode.com/problems/merge-two-sorted-lists/description/

Problem statement:

Merge two sorted linked list into single sorted linked list
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result: ListNode? = null
        var node1 = list1
        var node2 = list2
        var lastNode: ListNode? = null

        while ((node1 != null) || (node2 != null)) {
            var nextNode: ListNode? = null

            if (node1 != null) {
                if (node2 != null) {
                    if (node1.`val` <= node2.`val`) {
                        nextNode = ListNode(node1.`val`)
                        node1 = node1.next
                    } else {
                        nextNode = ListNode(node2.`val`)
                        node2 = node2.next
                    }
                } else {
                    nextNode = ListNode(node1.`val`)
                    node1 = node1.next
                }
            } else if (node2 != null) {
                nextNode = ListNode(node2.`val`)
                node2 = node2.next
            }

            if (result == null) {
                result = nextNode
            } else if (lastNode != null) {
                lastNode.next = nextNode
            }

            lastNode = nextNode
        }

        return result
    }
}

// Remove this class if testing on Leetcode site since it is supplied there
class ListNode(val `val`: Int, var next: ListNode? = null)