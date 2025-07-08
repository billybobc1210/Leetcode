/*
 * Leetcode Problem 8
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then round the integer to remain in the range. Specifically, integers less than -2^31 should be
 * rounded to -2^31, and integers greater than 2^31 - 1 should be rounded to 2^31 - 1.
 *
 * Return the integer as the final result.
 */
package Problem8;

class Solution {
    public int myAtoi(String s) {
        long result = 0;

        boolean foundSignIndicator = false;
        boolean foundFirstDigit = false;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                result = (result * 10) + ((c - '0') * sign);

                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

                foundFirstDigit = true;
            } else if (foundSignIndicator || foundFirstDigit) {
                break;
            } else if (c == '-') {
                sign = -1;
                foundSignIndicator = true;
            } else if (c == '+') {
                foundSignIndicator = true;
            } else if (c != ' ') {
                break;
            }
        }

        return (int) result;
    }
}