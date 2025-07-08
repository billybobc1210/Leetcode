package Problem8;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int actual = s.myAtoi("42");
        assertEquals(42, actual);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int actual = s.myAtoi("-42");
        assertEquals(-42, actual);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int actual = s.myAtoi("    42");
        assertEquals(42, actual);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int actual = s.myAtoi("    -42");
        assertEquals(-42, actual);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        int actual = s.myAtoi("+42");
        assertEquals(42, actual);
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        int actual = s.myAtoi("2000000000");
        assertEquals(2000000000, actual);
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        int actual = s.myAtoi("-2000000000");
        assertEquals(-2000000000, actual);
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        int actual = s.myAtoi("3000000000");
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void test9() {
        Solution s = new Solution();
        int actual = s.myAtoi("-3000000000");
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    public void test10() {
        Solution s = new Solution();
        int actual = s.myAtoi("300000000000000");
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void test11() {
        Solution s = new Solution();
        int actual = s.myAtoi("-300000000000000");
        assertEquals(Integer.MIN_VALUE, actual);
    }


    @Test
    public void test12() {
        Solution s = new Solution();
        int actual = s.myAtoi("2147483647");
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void test13() {
        Solution s = new Solution();
        int actual = s.myAtoi("2147483648");
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void test14() {
        Solution s = new Solution();
        int actual = s.myAtoi("-2147483648");
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    public void test15() {
        Solution s = new Solution();
        int actual = s.myAtoi("-2147483649");
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    public void test16() {
        Solution s = new Solution();
        int actual = s.myAtoi("123c456");
        assertEquals(123, actual);
    }

    @Test
    public void test17() {
        Solution s = new Solution();
        int actual = s.myAtoi("       123456");
        assertEquals(123456, actual);
    }

    @Test
    public void test18() {
        Solution s = new Solution();
        int actual = s.myAtoi("-042");
        assertEquals(-42, actual);
    }

    @Test
    public void test19() {
        Solution s = new Solution();
        int actual = s.myAtoi("      -042");
        assertEquals(-42, actual);
    }

    @Test
    public void test20() {
        Solution s = new Solution();
        int actual = s.myAtoi("      +042");
        assertEquals(42, actual);
    }

    @Test
    public void test21() {
        Solution s = new Solution();
        int actual = s.myAtoi("31474c3648");
        assertEquals(31474, actual);
    }

    @Test
    public void test22() {
        Solution s = new Solution();
        int actual = s.myAtoi("0-1");
        assertEquals(0, actual);
    }

    @Test
    public void test23() {
        Solution s = new Solution();
        int actual = s.myAtoi("--1");
        assertEquals(0, actual);
    }

    @Test
    public void test24() {
        Solution s = new Solution();
        int actual = s.myAtoi("++1");
        assertEquals(0, actual);
    }

    @Test
    public void test25() {
        Solution s = new Solution();
        int actual = s.myAtoi("-+1");
        assertEquals(0, actual);
    }

    @Test
    public void test26() {
        Solution s = new Solution();
        int actual = s.myAtoi("+-1");
        assertEquals(0, actual);
    }

    @Test
    public void test27() {
        Solution s = new Solution();
        int actual = s.myAtoi("- 1");
        assertEquals(0, actual);
    }

    @Test
    public void test28() {
        Solution s = new Solution();
        int actual = s.myAtoi("+ 1");
        assertEquals(0, actual);
    }

    @Test
    public void test29() {
        Solution s = new Solution();
        int actual = s.myAtoi("  - 1");
        assertEquals(0, actual);
    }

    @Test
    public void test30() {
        Solution s = new Solution();
        int actual = s.myAtoi("   + 1");
        assertEquals(0, actual);
    }

    @Test
    public void test31() {
        Solution s = new Solution();
        int actual = s.myAtoi("   ");
        assertEquals(0, actual);
    }

    @Test
    public void test32() {
        Solution s = new Solution();
        int actual = s.myAtoi("");
        assertEquals(0, actual);
    }

    @Test
    public void test33() {
        Solution s = new Solution();
        int actual = s.myAtoi("0000000000012345678");
        assertEquals(12345678, actual);
    }

    @Test
    public void test34() {
        Solution s = new Solution();
        int actual = s.myAtoi("789838291583958369378512739853285319855389589");
        assertEquals(Integer.MAX_VALUE, actual);
    }

    @Test
    public void test35() {
        Solution s = new Solution();
        int actual = s.myAtoi("-789838291583958369378512739853285319855389589");
        assertEquals(Integer.MIN_VALUE, actual);
    }
}