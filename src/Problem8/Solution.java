package Problem8;

class Solution {
    public int myAtoi(String s) {
        int result = 0;

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

        int overflowResult = Integer.MAX_VALUE;
        String overflowResultDigits = Integer.toString(overflowResult);

        if (sign == -1) {
            overflowResult = Integer.MIN_VALUE;
            overflowResultDigits = Integer.toString(overflowResult).substring(1);
        }

        if (digits.length() > overflowResultDigits.length()) {
            return overflowResult;
        } else {
            digits = "0".repeat(overflowResultDigits.length() - digits.length()) + digits;

            boolean overflowPossible = true;

            for (int i = 0; i < digits.length(); i++) {
                int digit = digits.charAt(i);

                if (Character.isDigit(digit)) {
                    if (overflowPossible && (digit > overflowResultDigits.charAt(i))) {
                        return overflowResult;
                    } else if (digit < overflowResultDigits.charAt(i)) {
                        overflowPossible = false;
                    }

                    int placeMultiplier = (int) Math.pow(10.0, digits.length() - i - 1);
                    result += (digit - '0') * placeMultiplier * sign;
                } else {
                    return result;
                }
            }
        }

        return result;
    }
}