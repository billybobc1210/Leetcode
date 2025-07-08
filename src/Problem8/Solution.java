package Problem8;

class Solution {
    public int myAtoi(String s) {
        long result = 0;

        StringBuffer validDigits = new StringBuffer();
        boolean foundFirstDigit = false;
        int sign = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                if ((c != '0') || (validDigits.length() > 0)) {
                    validDigits.append(c);
                }

                foundFirstDigit = true;
            } else if (foundFirstDigit || ((c != '-') && (c != '+') && (c != ' '))) {
                break;
            } else if ((c == '-') || (c == '+')) {
                if (sign == 0) {
                    sign = c == '-' ? -1 : 1;
                } else {
                    return 0;
                }
            } else if ((sign != 0)) {
                return 0;
            }
        }

        if (sign == 0) {
            sign = 1;
        }

        String digits = validDigits.toString();
        if (digits.isEmpty()) {
            digits = "0";
        }

        long placeMultiplier = 1;

        for (int i = digits.length() - 1; i >= 0; i--) {
            int digit = digits.charAt(i);

            if (Character.isDigit(digit)) {
                result += (digit - '0') * placeMultiplier * sign;
            }

            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            placeMultiplier *= 10;
        }

        return (int) result;
    }
}