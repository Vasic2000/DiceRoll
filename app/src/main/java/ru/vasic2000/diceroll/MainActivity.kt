package ru.vasic2000.diceroll

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

import android.media.AudioManager
import ru.vasic2000.diceroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_dice_1, R.id.navigation_dice_2
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//      Эта строка позволяет управлять громкостью Media из приложения кнопками громче тише
        volumeControlStream = AudioManager.STREAM_MUSIC
    }

    private fun rollDice() : Int {
        val dice = Dice(6)
        return dice.roll()
    }

    class Dice(private val numSides : Int) {
        fun roll() : Int {
            return(1..numSides).random()
        }
    }
}
