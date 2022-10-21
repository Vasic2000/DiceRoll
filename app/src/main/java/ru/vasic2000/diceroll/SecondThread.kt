package ru.vasic2000.diceroll

class SecondThread(private val mainActivity: MainActivity) : Runnable {

    override fun run() {
        try {
            Thread.sleep(220)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        var side : Int = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(70)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(50)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                 mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(200)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }

        try {
            Thread.sleep(150)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        side  = rollDice()

        when (side) {
            1 -> mainActivity.diceImageView.post{
                mainActivity.diceImageView.setImageResource(R.drawable.dice1)
            }
            2 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice2)
            }
            3 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice3)
            }
            4 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice4)
            }
            5 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice5)
            }
            6 -> mainActivity.diceImageView.post {
                mainActivity.diceImageView.setImageResource(R.drawable.dice6)
            }
        }
    }

    private fun rollDice() : Int {
        val dice = MainActivity.Dice(6)
        return dice.roll()
    }
}