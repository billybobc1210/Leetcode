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