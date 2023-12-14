package com.example.shop

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adaptir.ShopAdaptir
import com.example.adaptir.ShopModel
import com.example.fourthday.R
import com.example.fourthday.databinding.ActivityShoppingBinding

class ShoppingActivity : AppCompatActivity() {
    private var binding:ActivityShoppingBinding?=null
    private val adaptir=ShopAdaptir(createlist())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = ActivityShoppingBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initRecview()
    }

    private fun initRecview() {
        binding?.recyclerViewid?.adapter=adaptir
    }

    private fun  createlist()= listOf(
ShopModel(R.drawable.image_15, name = "The Lola High Rise Skinny 30L", price = "$76.44"),
    ShopModel(R.drawable.image_6, name = "The Lola High Rise Skinny 30L", price = "$76.44"),
    ShopModel(R.drawable.product, name = "The Lola High Rise Skinny 30L", price = "$76.44")





)
    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}