package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Smashburger", "Burger Nook", "McDonald's", "Burger King", "Meltz", "Hardees")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            foodtxt.text = foodList[randomFood].toString()
        }
        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }

    }
}