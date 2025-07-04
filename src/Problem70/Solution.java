/*
Leetcode Problem 70

https://leetcode.com/problems/climbing-stairs/description/

Problem statement:

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
package Problem70;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<Integer, Integer> fibonacciMap = new HashMap<>();
    private static int maxInitializedFibonacci = 2;
    static {
        fibonacciMap.put(1, 1);
        fibonacciMap.put(2, 2);
    }

    public int climbStairs(int n) {
        if (n >= 1) {
            Integer result = fibonacciMap.get(n);

            if (result == null) {
                for (int i = maxInitializedFibonacci + 1; i <= n; i++) {
                    result = fibonacciMap.get(i-1) + fibonacciMap.get(i-2);
                    fibonacciMap.put(i, result);
                    maxInitializedFibonacci = n;
                }
            }

            return result;
        }

        return 0;
    }

/*
 *    Recursive solution that gave correct results but failed due to Time Limit Exceeded
 */
//    private static final int[] POSSIBLE_STEP_SIZES = new int[] { 1, 2 };
//
//    public int climbStairs(int n) {
//        int result = 0;
//
//        for (int nextStepSize : POSSIBLE_STEP_SIZES) {
//            int stepsRemainingAfterNextStep = n - nextStepSize;
//
//            if (stepsRemainingAfterNextStep == 0) {
//                result++;
//                break;
//            } else if (stepsRemainingAfterNextStep > 0) {
//                result += climbStairs(stepsRemainingAfterNextStep);
//            }
//        }
//
//        return result;
//    }

/*
 *    Another recursive solution (for getting fibonacci numbers) that gave correct results but failed
 *    due to Time Limit Exceeded
 */
//    public int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }
//    }
}