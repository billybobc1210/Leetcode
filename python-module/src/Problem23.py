"""
Leetcode Problem 23

https://leetcode.com/problems/merge-k-sorted-lists/description/

Problem statement:

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
"""

# Remove this class if testing on Leetcode site since it is supplied there
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """

        result = None
        result_tail = None

        current_list_nodes = list(lists)

        completed_lists = 0

        while completed_lists < len(lists):
            completed_lists = 0
            min_value = None
            min_value_list_indexes = []

            for i in range(len(current_list_nodes)):
                current_list_node = current_list_nodes[i]

                if current_list_node is not None:
                    if min_value is None or current_list_node.val < min_value:
                        min_value = current_list_node.val
                        min_value_list_indexes = [ i ]
                    elif current_list_node.val == min_value:
                        min_value_list_indexes.append(i)
                else:
                    completed_lists += 1

            for i in min_value_list_indexes:
                next_result_node = ListNode(current_list_nodes[i].val)
                current_list_nodes[i] = current_list_nodes[i].next

                if result_tail is not None:
                    result_tail.next = next_result_node

                result_tail = next_result_node

                if result is None:
                    result = next_result_node

        return result