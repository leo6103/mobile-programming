package com.app.debug

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImageView = findViewById<ImageView>(R.id.dice_image)

        val rollButton = findViewById<Button>(R.id.roll_button)

        rollButton.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7)

            val drawableResource = when (randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImageView.setImageResource(drawableResource)
        }
    }
}
