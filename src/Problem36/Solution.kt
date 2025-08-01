package Problem36

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