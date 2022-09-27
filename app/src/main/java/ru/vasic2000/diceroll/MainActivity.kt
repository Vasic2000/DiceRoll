package ru.vasic2000.diceroll

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImageView : ImageView = findViewById(R.id.diceImage)
        val rollButton = findViewById<Button>(R.id.button)

         rollButton.setOnClickListener {
            var side : Int = rollDice()
            when (side) {
                1 -> diceImageView.setImageResource(R.drawable.dice1)
                2 -> diceImageView.setImageResource(R.drawable.dice2)
                3 -> diceImageView.setImageResource(R.drawable.dice3)
                4 -> diceImageView.setImageResource(R.drawable.dice4)
                5 -> diceImageView.setImageResource(R.drawable.dice5)
                6 -> diceImageView.setImageResource(R.drawable.dice6)
            }
        }
    }

    private fun rollDice() : Int {
        val dice = Dice(6)
        return dice.roll()
    }

    class Dice(val numSides : Int) {
        fun roll() : Int {
            return(1..numSides).random()
        }
    }
}
