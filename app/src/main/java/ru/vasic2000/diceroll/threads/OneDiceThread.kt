package ru.vasic2000.diceroll.threads

import android.widget.ImageView
import ru.vasic2000.diceroll.MainActivity
import ru.vasic2000.diceroll.R

class OneDiceThread(private val imageView: ImageView) : Runnable {

    override fun run() {
        try {
            Thread.sleep(220)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        var side : Int = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(70)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> imageView.post{
                imageView.setImageResource(R.drawable.dice1)
            }
            2 -> imageView.post {
                imageView.setImageResource(R.drawable.dice2)
            }
            3 -> imageView.post {
                imageView.setImageResource(R.drawable.dice3)
            }
            4 -> imageView.post {
                imageView.setImageResource(R.drawable.dice4)
            }
            5 -> imageView.post {
                imageView.setImageResource(R.drawable.dice5)
            }
            6 -> imageView.post {
                imageView.setImageResource(R.drawable.dice6)
            }
        }
    }

    private fun rollDice() : Int {
        val dice = MainActivity.Dice(6)
        return dice.roll()
    }
}