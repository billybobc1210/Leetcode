package Problem2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        ListNode n1 = convertArrayToList(new int[] { 2,4,3 });
        ListNode n2 = convertArrayToList(new int[] { 5,6,4 });
        ListNode actual = solution.addTwoNumbers(n1, n2);
        ListNode expected = convertArrayToList(new int[] { 7,0,8 });
        assertListsMatch(expected, actual);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        ListNode n1 = convertArrayToList(new int[] { 7,2,4,3 });
        ListNode n2 = convertArrayToList(new int[] { 5,6,4 });
        ListNode actual = solution.addTwoNumbers(n1, n2);
        ListNode expected = convertArrayToList(new int[] { 2,9,8,3 });
        assertListsMatch(expected, actual);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        ListNode n1 = convertArrayToList(new int[] { 0 });
        ListNode n2 = convertArrayToList(new int[] { 0 });
        ListNode actual = solution.addTwoNumbers(n1, n2);
        ListNode expected = convertArrayToList(new int[] { 0 });
        assertListsMatch(expected, actual);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        ListNode n1 = convertArrayToList(new int[] { 9,9,9,9,9,9,9 });
        ListNode n2 = convertArrayToList(new int[] { 9,9,9,9 });
        ListNode actual = solution.addTwoNumbers(n1, n2);
        ListNode expected = convertArrayToList(new int[] { 8,9,9,9,0,0,0,1 });
        assertListsMatch(expected, actual);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        ListNode n1 = convertArrayToList(new int[] { 9 });
        ListNode n2 = convertArrayToList(new int[] { 9 });
        ListNode actual = solution.addTwoNumbers(n1, n2);
        ListNode expected = convertArrayToList(new int[] { 8,1 });
        assertListsMatch(expected, actual);
    }

    private ListNode convertArrayToList(int[] arrayOfInts) {
        ListNode previousNode = null;
        ListNode result = null;

        for (int i = arrayOfInts.length - 1; i >= 0; i--) {
            result = new ListNode(arrayOfInts[i], previousNode);
            previousNode = result;
        }

        return result;
    }

    private void  assertListsMatch(ListNode expected, ListNode actual) {
        ListNode nextExpected = expected;
        ListNode nextActual = actual;

        while ((nextExpected != null) && (nextActual != null)) {
            assertEquals(nextExpected.val, nextActual.val);
            nextExpected = nextExpected.next;
            nextActual = nextActual.next;
        }

        assertFalse((nextExpected != null) || (nextActual != null));
    }
}