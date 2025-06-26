package problem21

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    public fun test1() {
        val list1 = convertArrayToList(arrayOf());
        val list2 = convertArrayToList(arrayOf())

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)

        val expectedResult = convertArrayToList(arrayOf())
        assertListsMatch(expectedResult, mergedList)
    }

    @Test
    public fun test2() {
        val list1 = convertArrayToList(arrayOf(1, 2, 4));
        val list2 = convertArrayToList(arrayOf())

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)

        val expectedResult = convertArrayToList(arrayOf(1,2,4))
        assertListsMatch(expectedResult, mergedList)
    }

    @Test
    public fun test3() {
        val list1 = convertArrayToList(arrayOf());
        val list2 = convertArrayToList(arrayOf(1, 3, 4));

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)

        val expectedResult = convertArrayToList(arrayOf(1,3,4))
        assertListsMatch(expectedResult, mergedList)
    }

    @Test
    public fun test4() {
        val list1 = convertArrayToList(arrayOf(1, 2, 4));
        val list2 = convertArrayToList(arrayOf(1, 3, 4));

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)

        val expectedResult = convertArrayToList(arrayOf(1,1,2,3,4,4))
        assertListsMatch(expectedResult, mergedList)
    }

    @Test
    public fun test5() {
        val list1 = convertArrayToList(arrayOf(1, 2, 100, 150, 9090, 54930));
        val list2 = convertArrayToList(arrayOf(1, 3, 4, 100, 110, 359, 100000));

        val solution = Solution()
        val mergedList = solution.mergeTwoLists(list1, list2)

        val expectedResult = convertArrayToList(arrayOf(1,1,2,3,4,100,100,110,150,359,9090,54930,100000))
        assertListsMatch(expectedResult, mergedList)
    }

    fun convertArrayToList(arrayOfInts: Array<Int>): ListNode? {
        var previousNode: ListNode? = null
        var result: ListNode? = null

        arrayOfInts.reversedArray().forEach { i ->
            result = ListNode(i, previousNode)
            previousNode = result
        }

        return result
    }

    fun assertListsMatch(expected: ListNode?, actual: ListNode?) {
        var nextExpected: ListNode? = expected
        var nextActual: ListNode? = actual

        while ((nextExpected != null) && (nextActual != null)) {
            assertEquals(nextExpected.`val`, nextActual.`val`)
            nextExpected = nextExpected.next
            nextActual = nextActual.next
        }

        assertFalse((nextExpected != null) || (nextActual != null))
    }
}