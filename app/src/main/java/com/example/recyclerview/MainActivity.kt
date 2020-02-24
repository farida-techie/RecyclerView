package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),onCarItemClickListner {
    lateinit var binding: ActivityMainBinding
    lateinit var carlist: ArrayList<Cars>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        carlist = ArrayList()
        addCars()

        carRecycler.layoutManager = LinearLayoutManager(this)
        carRecycler.addItemDecoration(DividerItemDecoration(this,1))
        carRecycler.adapter = CarAdapter(carlist,this)


    }

    fun addCars() {
        carlist.add(Cars("Farida", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Anjum", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("zoya", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Rida", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("shahnaj", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Sonam", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Parveen", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Shahin", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Alamas", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Kajal", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Aarfiya", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Alafiya", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Tamana", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("shagupta", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("shahista", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Yasmeen", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))
        carlist.add(Cars("Saniya", "unique, gold and trustful.good bussiness women.smart girl.unique, gold and trustful", R.drawable.baby))


    }

    override fun onItemClick(item: Cars, position: Int) {
        Toast.makeText(this,item.name,Toast.LENGTH_SHORT).show()
        val intent = Intent(this,CarDetailActivity::class.java)
        intent.putExtra("CARNAME",item.name)
        intent.putExtra("CARDESCRIPTION",item.description)
        intent.putExtra("CARLOGO",item.logo.toString())
        startActivity(intent)

    }



}
