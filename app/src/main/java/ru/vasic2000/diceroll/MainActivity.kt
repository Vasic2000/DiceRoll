package ru.vasic2000.diceroll

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImageView : ImageView

    //    Sounds
    lateinit var sounds : SoundPool
    var soundThrow : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImageView = findViewById(R.id.diceImage)
        val rollButton = findViewById<Button>(R.id.button)

        //      Эта строка позволяет управлять громкостью Media из приложения кнопками громче тише
        volumeControlStream = AudioManager.STREAM_MUSIC
        soundInit()

         rollButton.setOnClickListener {
            sounds.play(soundThrow, 1f, 1f, 1, 0, 1f)
            val threadDraw : SecondThread = SecondThread(this)
             val winDrawThread = Thread(threadDraw)
             winDrawThread.start()
        }
    }

    private fun soundInit() {
        sounds = SoundPool.Builder()
            .setMaxStreams(2)
            .build()
        soundThrow = sounds.load(applicationContext, R.raw.dice, 1)
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
