package ru.vasic2000.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollTextView : TextView = findViewById(R.id.textView)
        val rollButton = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener{
            rollTextView.setText(rollDice().toString())
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
