"""
Leetcode Problem 3

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

Problem statement:

Given a string s, find the length of the longest substring without duplicate characters.
"""
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        result = 0
        char_to_last_position_map = {}

        start = 0
        end = 0

        while end < len(s):
            sub_string_len = end - start + 1
            end_char = s[end]
            last_position_end_char = char_to_last_position_map.get(end_char)
            char_to_last_position_map[end_char] = end
            is_candidate = True

            if last_position_end_char is not None:
                if last_position_end_char >= start:
                    start = last_position_end_char + 1
                    is_candidate = False

            if is_candidate:
                if sub_string_len > result:
                    # print(s[start:end+1])
                    result = sub_string_len

            end += 1

        return result

