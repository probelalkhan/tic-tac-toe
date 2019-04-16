package net.simplifiedcoding.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val boardCells = Array(3){ arrayOfNulls<ImageView>(3)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadBoard()
    }


    private fun loadBoard(){

        for(i in boardCells.indices){
            for(j in boardCells.indices){
                boardCells[i][j] = ImageView(this)
                boardCells[i][j]?.layoutParams = GridLayout.LayoutParams().apply {
                    rowSpec = GridLayout.spec(i)
                    columnSpec = GridLayout.spec(j)
                    width = 250
                    height = 230
                    bottomMargin = 5
                    topMargin = 5
                    leftMargin = 5
                    rightMargin = 5
                }
                boardCells[i][j]?.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
                layout_board.addView(boardCells[i][j])
            }
        }
    }
}
