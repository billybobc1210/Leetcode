package Problem36

/*
Leetcode problem 36

https://leetcode.com/problems/valid-sudoku/description/

Problem statement:

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

- Each row must contain the digits 1-9 without repetition.
- Each column must contain the digits 1-9 without repetition.
- Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
*/
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return areValidRows(board) &&
               areValidColumns(board) &&
               areValidBoxes(board)
    }

    fun areValidRows(board: Array<CharArray>): Boolean =
        board.all { row ->
            isValidGroup(row)
        }

    fun areValidColumns(board: Array<CharArray>): Boolean =
        (0 until 9).all { column ->
            isValidGroup(
                board.map { row ->
                    row[column]
                }.toCharArray()
            )
        }

    fun areValidBoxes(board: Array<CharArray>): Boolean =
        (0 until 3).all { boxRow ->
            (0 until 3).all { boxColumn ->
                isValidGroup(
                    (0 until 3).flatMap { row ->
                        (0 until 3).map { column ->
                            board[(boxRow * 3) + row][(boxColumn * 3) + column]
                        }
                    }.toCharArray()
                )
            }
        }

    fun isValidGroup(cells: CharArray): Boolean {
        val nonEmptyCells = cells.filter { it in ('1' .. '9') }

        return nonEmptyCells.size == nonEmptyCells.toSet().size
    }
}