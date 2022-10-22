package ru.vasic2000.diceroll.ui

import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import ru.vasic2000.diceroll.R
import ru.vasic2000.diceroll.databinding.TwoDicesBinding
import ru.vasic2000.diceroll.threads.OneDiceThread
import ru.vasic2000.diceroll.threads.TwoDiceThread

class Fragment_2 : Fragment()  {

    private var _binding: TwoDicesBinding? = null
    lateinit var diceImageView1 : ImageView
    lateinit var diceImageView2 : ImageView

    //    Sounds
    private lateinit var sounds : SoundPool
    private var soundThrow : Int = 0

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TwoDicesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        diceImageView1 = root.findViewById(R.id.diceImageLeft)
        diceImageView2 = root.findViewById(R.id.diceImageRight)

        val rollButton2 = root.findViewById<Button>(R.id.buttonRoll_2)

        soundInit()

        rollButton2.setOnClickListener {
            sounds.play(soundThrow, 1f, 1f, 1, 0, 1f)
            val threadDraw2 = TwoDiceThread(diceImageView1, diceImageView2)
            val winDrawThread = Thread(threadDraw2)
            winDrawThread.start()
        }

        return root
    }

    private fun soundInit() {
        sounds = SoundPool.Builder()
            .setMaxStreams(2)
            .build()
        soundThrow = sounds.load(context, R.raw.dices_2, 1)
    }

}