package Problem70;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();

        int n = solution.climbStairs(1);
        assertEquals(1, n);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        int n = solution.climbStairs(2);
        assertEquals(2, n);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();

        int n = solution.climbStairs(3);
        assertEquals(3, n);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();

        int n = solution.climbStairs(4);
        assertEquals(5, n);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();

        int n = solution.climbStairs(5);
        assertEquals(8, n);
    }

    @Test
    public void test6() {
        Solution solution = new Solution();

        int n = solution.climbStairs(6);
        assertEquals(13, n);
    }

    @Test
    public void test7() {
        Solution solution = new Solution();

        int n = solution.climbStairs(7);
        assertEquals(21, n);
    }

    @Test
    public void test8() {
        Solution solution = new Solution();

        int n = solution.climbStairs(10);
        assertEquals(89, n);
    }

    @Test
    public void test9() {
        Solution solution = new Solution();

        int n = solution.climbStairs(20);
        assertEquals(10946, n);
    }

    @Test
    public void test10() {
        Solution solution = new Solution();

        int n = solution.climbStairs(44);
        assertEquals(1134903170, n);
    }
}