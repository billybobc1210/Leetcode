from unittest import TestCase
from Problem3 import Solution

class TestSolution(TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_length_of_longest_substring_1(self):
        self.assertEqual(self.solution.lengthOfLongestSubstring(""), 0)

    def test_length_of_longest_substring_2(self):
        self.assertEqual(self.solution.lengthOfLongestSubstring("laskjdfds"), 7)

    def test_length_of_longest_substring_3(self):
        self.assertEqual(self.solution.lengthOfLongestSubstring("abcbdefadghijklmncxd"), 14)

    def test_length_of_longest_substring_4(self):
        self.assertEqual(self.solution.lengthOfLongestSubstring("abcQbdefabcdefghijklQ1234567890stuvwxyz54321"), 31)

    def test_length_of_longest_substring_5(self):
        self.assertEqual(self.solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"), 26)
