from contextlib import nullcontext
from unittest import TestCase
from Problem23 import ListNode
from Problem23 import Solution

class TestSolution(TestCase):
    def test_merge_klists_1(self):
        lists = [
            self.convert_array_to_list([1,4,5]),
            self.convert_array_to_list([1,3,4]),
            self.convert_array_to_list([2,6]),
        ]

        solution = Solution()
        actual = solution.mergeKLists(lists)
        expected = self.convert_array_to_list([1,1,2,3,4,4,5,6])
        self.assert_lists_match(expected, actual)

    def test_merge_klists_2(self):
        lists = [
            self.convert_array_to_list([1,2,4,5]),
            self.convert_array_to_list([1,3,4]),
            self.convert_array_to_list([]),
        ]

        solution = Solution()
        actual = solution.mergeKLists(lists)
        expected = self.convert_array_to_list([1,1,2,3,4,4,5])
        self.assert_lists_match(expected, actual)

    def test_merge_klists_3(self):
        lists = [
            self.convert_array_to_list([1,2,10,50,100]),
            self.convert_array_to_list([1,3,4,17,1000]),
            self.convert_array_to_list([1,3000]),
            self.convert_array_to_list([10]),
            self.convert_array_to_list([1000]),
            self.convert_array_to_list([20,30,40,50,60]),
            self.convert_array_to_list([100,200,300,400,500,600,700,800,900,1000]),
        ]

        solution = Solution()
        actual = solution.mergeKLists(lists)
        expected = self.convert_array_to_list([1,1,1,2,3,4,10,10,17,20,30,40,50,50,60,100,100,200,300,400,500,600,700,800,900,1000,1000,1000,3000])
        self.assert_lists_match(expected, actual)

    def test_merge_klists_4(self):
        lists = []

        solution = Solution()
        actual = solution.mergeKLists(lists)
        expected = self.convert_array_to_list([])
        self.assert_lists_match(expected, actual)

    def convert_array_to_list(self, values):
        """
        :type values: List[Optional[Int]]
        """
        previous_node = None
        result = None

        for i in reversed(values):
            result = ListNode(i, previous_node)
            previous_node = result

        return result

    def assert_lists_match(self, expected, actual):
        next_expected = expected
        next_actual = actual

        while next_expected is not None and next_actual is not None:
            self.assertEqual(next_expected.val, next_actual.val)
            next_expected = next_expected.next
            next_actual = next_actual.next

        self.assertFalse(next_expected is not None or next_actual is not None)
