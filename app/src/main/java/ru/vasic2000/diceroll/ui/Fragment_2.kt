package ru.vasic2000.diceroll.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.vasic2000.diceroll.databinding.TwoDicesBinding

class Fragment_2 : Fragment()  {

    private var _binding: TwoDicesBinding? = null

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
        return root
    }

}