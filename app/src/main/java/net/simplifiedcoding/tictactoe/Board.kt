package net.simplifiedcoding.tictactoe

class Board {

    companion object {
        const val PLAYER = "O"
        const val COMPUTER = "X"
    }

    val board = Array(3) { arrayOfNulls<String>(3) }

    fun placeMove(cell: Cell, player: String) {
        board[cell.i][cell.j] = player
    }

}