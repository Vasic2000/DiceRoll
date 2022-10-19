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
import ru.vasic2000.diceroll.threads.OneDiceThread
import ru.vasic2000.diceroll.databinding.OneDiceBinding

class Fragment_1 : Fragment()  {

    private var _binding: OneDiceBinding? = null
    lateinit var diceImageView : ImageView

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
        _binding = OneDiceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        diceImageView = root.findViewById(R.id.diceImage)
        val rollButton = root.findViewById<Button>(R.id.buttonRoll_1)

        soundInit()

        rollButton.setOnClickListener {
            sounds.play(soundThrow, 1f, 1f, 1, 0, 1f)
            val threadDraw = OneDiceThread(diceImageView)
            val winDrawThread = Thread(threadDraw)
            winDrawThread.start()
        }

        return root
    }

    private fun soundInit() {
        sounds = SoundPool.Builder()
            .setMaxStreams(2)
            .build()
        soundThrow = sounds.load(context, R.raw.dice, 1)
    }

}