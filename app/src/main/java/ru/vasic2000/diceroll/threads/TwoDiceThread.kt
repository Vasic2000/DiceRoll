package ru.vasic2000.diceroll.threads

import android.widget.ImageView
import ru.vasic2000.diceroll.MainActivity
import ru.vasic2000.diceroll.R

class TwoDiceThread(private val imageView1: ImageView, private val imageView2: ImageView) : Runnable {

    override fun run() {
        try {
            Thread.sleep(220)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        var sideLeft : Int = rollDice()
        var sideRight: Int = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(70)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        sideLeft = rollDice()
        sideRight = rollDice()

        when (sideLeft) {
            1 -> imageView1.post{
                imageView1.setImageResource(R.drawable.dice1)
            }
            2 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice2)
            }
            3 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice3)
            }
            4 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice4)
            }
            5 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice5)
            }
            6 -> imageView1.post {
                imageView1.setImageResource(R.drawable.dice6)
            }
        }

        when (sideRight) {
            1 -> imageView2.post{
                imageView2.setImageResource(R.drawable.dice1)
            }
            2 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice2)
            }
            3 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice3)
            }
            4 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice4)
            }
            5 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice5)
            }
            6 -> imageView2.post {
                imageView2.setImageResource(R.drawable.dice6)
            }
        }
    }

    private fun rollDice() : Int {
        val dice = MainActivity.Dice(6)
        return dice.roll()
    }
}