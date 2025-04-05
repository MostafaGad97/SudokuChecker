

fun main() {
    check(
        "when have a sudoku 9 * 9  (without empty cells and not repeated number) it should return true",
        result = isValidSudoku(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )

    check(
        "when have a sudoku 9 * 9 (with empty cells and not repeated number) it should return true",
        result = isValidSudoku(
            listOf(
                listOf("5", "-", "4", "6", "7", "-", "9", "1", "2"),
                listOf("6", "7", "2", "1", "-", "5", "3", "4", "8"),
                listOf("1", "9", "8", "-", "-", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("-", "2", "6", "8", "5", "-", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "-", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )

    check(
        "when have a sudoku 9 * 9 (with repeated numbers in row and column) it should return false",
        result = isValidSudoku(
            listOf(
                listOf("7", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "-", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "-", "3", "7", "9", "1"),
                listOf("7", "-", "3", "-", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "-", "9")
            )
        ),
        correctResult = false
    )

    check(
        "when have a sudoku 9 * 9 (with repeated numbers in box) it should return false",
        result = isValidSudoku(
            listOf(
                listOf("7", "3", "4", "6", "7", "8", "9", "1", "-"),
                listOf("6", "7", "2", "1", "-", "-", "3", "4", "8"),
                listOf("1", "9", "-", "3", "-", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        "when have a sudoku 1 * 1 it should return false",
        result = isValidSudoku(
            listOf(
                listOf("-")
            )
        ),
        correctResult = false
    )

    check(
        "when have a sudoku 16 * 16 (without repeated numbers) it should return true",
        result = isValidSudoku(
            listOf(
                listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G"),
                listOf("5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "1", "2", "3", "4"),
                listOf("9", "A", "B", "C", "D", "E", "F", "G", "1", "2", "3", "4", "5", "6", "7", "8"),
                listOf("D", "E", "F", "G", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C"),
                listOf("2", "1", "4", "3", "6", "5", "8", "7", "-", "9", "C", "B", "E", "D", "G", "F"),
                listOf("6", "5", "8", "7", "A", "9", "C", "B", "E", "D", "G", "F", "2", "1", "4", "3"),
                listOf("A", "9", "C", "B", "E", "D", "G", "F", "2", "1", "4", "3", "6", "5", "8", "7"),
                listOf("E", "D", "G", "F", "2", "1", "4", "3", "6", "5", "8", "7", "A", "9", "C", "B"),
                listOf("3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A", "-", "G", "D", "E"),
                listOf("7", "8", "5", "6", "B", "C", "9", "A", "F", "G", "D", "E", "3", "4", "1", "2"),
                listOf("B", "C", "9", "A", "F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "5", "6"),
                listOf("F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "-", "6", "B", "C", "9", "A"),
                listOf("4", "3", "2", "1", "8", "7", "6", "5", "C", "B", "A", "9", "G", "F", "E", "D"),
                listOf("8", "7", "6", "5", "C", "B", "A", "9", "G", "F", "E", "D", "4", "3", "2", "1"),
                listOf("C", "B", "A", "9", "G", "F", "E", "D", "4", "3", "2", "1", "8", "7", "6", "5"),
                listOf("G", "F", "E", "D", "4", "3", "2", "1", "8", "7", "6", "5", "C", "B", "A", "9")
            )
        ),
        correctResult = true
    )

    check(
        "when have a sudoku 4 * 4 (all cells are empty) it should return true",
        result = isValidSudoku(
            listOf(
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "-", "-"),
            )
        ),
        correctResult = true
    )

    check(
        "when have a sudoku (with invalid dimensions 3 * 4) it should return false",
        result = isValidSudoku(
            listOf(
                listOf("1", "2", "3", "4"),
                listOf("3", "4", "1", "2"),
                listOf("2", "1", "4", "3"),
            )
        ),
        correctResult = false
    )

    check(
        "when have a sudoku (with invalid dimensions 4 * 3) it should return false",
        result = isValidSudoku(
            listOf(
                listOf("-", "-", "-"),
                listOf("-", "-", "7", "-"),
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "-", "-"),
            )
        ),
        correctResult = false
    )

    check(
        "when have a sudoku 4 * 4 (with out of range values) it should return false",
        result = isValidSudoku(
            listOf(
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "7", "-"),
                listOf("-", "-", "-", "-"),
                listOf("-", "-", "-", "-"),
            )
        ),
        correctResult = false
    )

    check(
        "when have a non standard sudoku 6 * 6 it should return false",
        result = isValidSudoku(
            listOf(
                listOf("1", "2", "3",   "4", "5", "6"),
                listOf("4", "5", "6",   "1", "2", "3"),

                listOf("2", "3", "4",   "5", "6", "1"),
                listOf("5", "6", "1",   "2", "3", "4"),

                listOf("3", "4", "5",   "6", "1", "2"),
                listOf("6", "1", "2",   "3", "4", "5")
            )
        ),
        correctResult = false
    )

    check(
        name = "when have a sudoku 3 * 3 it should return false",
        result = isValidSudoku(
            listOf(
                listOf("1", "2", "3"),
                listOf("2", "3", "1"),
                listOf("3", "1", "2"),
            )
        ),
        correctResult = false
    )

}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if(result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}