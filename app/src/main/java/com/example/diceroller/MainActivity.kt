package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  val diceNum=findViewById(R.id.dice_num)
       val rollBtn:Button=findViewById(R.id.roll_btn)
        val textview:TextView=findViewById(R.id.textView)
       val imageview: ImageView=findViewById(R.id.imageView)
        rollBtn.setOnClickListener(){
       var c:Int=(1..6).random()

            when(c){
                1->imageview.setImageResource(R.drawable.dice_1)
                2->imageview.setImageResource(R.drawable.dice_2)
                3->imageview.setImageResource(R.drawable.dice_3)
                4->imageview.setImageResource(R.drawable.dice_4)
                5->imageview.setImageResource(R.drawable.dice_5)
                else->imageview.setImageResource(R.drawable.dice_6)



            }
        }
    }

}