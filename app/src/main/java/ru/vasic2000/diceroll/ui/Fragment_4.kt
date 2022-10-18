package ru.vasic2000.diceroll.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.vasic2000.diceroll.databinding.FourDicesBinding

class Fragment_4 : Fragment()  {

    private var _binding: FourDicesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FourDicesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

}