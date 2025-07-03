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
//    private static final int[] POSSIBLE_STEP_SIZES = new int[] { 1, 2 };
    private static final Map<Integer, Integer> fibonacciMap = new HashMap<>();
    private static int maxInitializedFibonacci = 2;
    static {
        fibonacciMap.put(1, 1);
        fibonacciMap.put(2, 2);
    }

    public int climbStairs(int n) {
        return climbRemainingStairs(n);
    }

    private int climbRemainingStairs(int stepsRemaining) {
        if (stepsRemaining >= 1) {
            Integer result = fibonacciMap.get(stepsRemaining);

            if (result == null) {
                for (int i = maxInitializedFibonacci + 1; i <= stepsRemaining; i++) {
                    result = fibonacciMap.get(i-1) + fibonacciMap.get(i-2);
                    fibonacciMap.put(i, result);
                    maxInitializedFibonacci = stepsRemaining;
                }
            }

            return result;
        }

        return 0;
    }

/*
 *    Recursive solution that gave correct results but failed due to Time Limit Exceeded
*/
//    private int climbRemainingStairs(int stepsRemaining) {
//        int result = 0;
//
//        for (int nextStepSize : POSSIBLE_STEP_SIZES) {
//            int stepsRemainingAfterNextStep = stepsRemaining - nextStepSize;
//
//            if (stepsRemainingAfterNextStep == 0) {
//                result++;
//                break;
//            } else if (stepsRemainingAfterNextStep > 0) {
//                result += climbRemainingStairs(stepsRemainingAfterNextStep);
//            }
//        }
//
//        return result;
//    }

/*
 *    Another recursive solution (for getting fibonacci numbers) that gave correct results but failed
 *    due to Time Limit Exceeded
 */
//    private int climbRemainingStairs(int stepsRemaining) {
//        if (stepsRemaining == 1) {
//            return 1;
//        } else if (stepsRemaining == 2) {
//            return 2;
//        } else {
//            return climbRemainingStairs(stepsRemaining - 1) +
//                   climbRemainingStairs(stepsRemaining - 2);
//        }
//    }
}