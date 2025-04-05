import kotlin.math.sqrt

fun main() {

}

fun isValidSudoku(gridList: List<List<String>>): Boolean {

    val gridSize = gridList.size
    val boxSize = sqrt(gridSize.toDouble()).toInt()

    if(gridSize == 1 || boxSize * boxSize != gridSize) return false

    val isValidSudokuDimensions = isValidSudokuDimensions(gridList = gridList)
    if(!isValidSudokuDimensions) return false

    val isValidRowsAndColumns = isValidRowsAndColumns(gridList = gridList)
    if (!isValidRowsAndColumns) return false

    val isValidBox = isValidBox(boxSize = boxSize, gridList = gridList)
    if(!isValidBox) return false

    return true
}

fun isValidSudokuDimensions(gridList: List<List<String>>): Boolean {
    val gridSize = gridList.size

    for(row in gridList) {
        if(row.size != gridSize) return false
    }

    return true
}

fun isValidBox(boxSize: Int, gridList: List<List<String>>): Boolean {
    val gridSize = gridList.size

    for (row in 0 until gridSize step boxSize) {    // start row
        for (col in 0 until gridSize step boxSize) {   // start column

            val seenCells = mutableListOf<String>()

            for (i in 0 until boxSize) {
                for (j in 0 until boxSize) {

                    val currentCell = gridList[row + i][col + j]

                    if (currentCell in seenCells) return false
                    else if(currentCell != "-") seenCells.add(currentCell)
                }
            }
        }
    }
    return true
}

fun isValidRowsAndColumns(gridList: List<List<String>>): Boolean {
    val gridSize = gridList.size

    for (row in 0 until gridSize) {
        val seenRowItems = mutableListOf<String>()
        val seenColumnItems = mutableListOf<String>()

        for (col in 0 until gridSize) {
            //check for the Row
            if (gridList[row][col] in seenRowItems || !isValidNumber(value = gridList[row][col], maxValue = gridSize)) {
                return false
            }
            else if(gridList[row][col] != "-") {
                seenRowItems.add(gridList[row][col])
            }

            //check for the Column
            if (gridList[col][row] in seenColumnItems || !isValidNumber(value = gridList[col][row], maxValue = gridSize)) {
                return false
            }
            else if(gridList[col][row] != "-") {
                seenColumnItems.add(gridList[col][row])
            }
        }
    }
    return true
}

fun isValidNumber(value: String, maxValue: Int): Boolean {
    if(value == "-") return true

    val isDigit = value.toIntOrNull() != null

    if (maxValue <= 9) {
        return isDigit && value.toInt() in 1..maxValue
    }

    if(isDigit && value.toInt() in 1..9) return true
    if(!isDigit && value in "A".."G") return true
    return false
}