package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerview.databinding.ActivityCarDetailBinding
import kotlinx.android.synthetic.main.activity_car_detail.*

class CarDetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityCarDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_car_detail)

        car_name.text = getIntent().getStringExtra("CARNAME")
        car_description.text = getIntent().getStringExtra("CARDESCRIPTION")
        image_car.setImageResource(getIntent().getStringExtra("CARNAME").toInt())
    }
}
