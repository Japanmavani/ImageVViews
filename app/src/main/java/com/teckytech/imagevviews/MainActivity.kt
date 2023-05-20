package com.teckytech.imagevviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            //Radio Button
            val radio = findViewById<RadioGroup>(R.id.radioGroup)
            val checkedRadioButtonid = radio.checkedRadioButtonId
            val ONE = findViewById<RadioButton>(checkedRadioButtonid)
            //Checked box


            val four = findViewById<CheckBox>(R.id.checkBox3)
            val fours = four.isChecked
            val TWO = findViewById<CheckBox>(R.id.checkBox)
            val twos = TWO.isChecked

            val THREE = findViewById<CheckBox>(R.id.checkBox2)
            val Threes = THREE.isChecked

            val text = findViewById<TextView>(R.id.txt)

//            var checkOneBurgerRadioButtonId: Boolean= ONE.isChecked

            val orderString = "You order burger with \n"+
                    "${ONE.text}" + (if(twos) "\n ${TWO.text} " else "")+
                    (if(Threes) "\n ${THREE.text} " else "") +
                    (if(fours) "\n ${four.text}" else "")

            text.text = orderString
        }


        //ImageView
//        val imgs = findViewById<ImageView>(R.id.imageView)
//        val btn  = findViewById<Button>(R.id.bttn)
//        var count = 0

//        btn.setOnClickListener {
//            if(count == 0){
//                imgs.setImageResource(R.drawable.splashscreen2)
//                count++
//            }
//            else{
//                Log.d("Mydeve", "Image already change")
//                count++
//            }
//        }
    }
}