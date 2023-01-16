package project.stn991622161.inClassExerciseByBingChenSun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var diceImage : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{ countUp() }

        diceImage = findViewById(R.id.imageView)
    }

    private fun rollDice(){

        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        // add images for roll button
        val  drawableResource = when(randomInt){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage?.setImageResource(drawableResource)
    }

    private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt ++
                resultText.text = resultInt.toString()

                //add images to count up button
                val  drawableResource = when(resultInt){
                    1 -> R.drawable.dice1
                    2 -> R.drawable.dice2
                    3 -> R.drawable.dice3
                    4 -> R.drawable.dice4
                    5 -> R.drawable.dice5
                    else -> R.drawable.dice6
            }
                diceImage?.setImageResource(drawableResource)
        }
        }
    }
}