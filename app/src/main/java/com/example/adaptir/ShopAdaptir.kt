package com.example.adaptir

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fourthday.databinding.ItemSettingShopBinding

class ShopAdaptir(private val dataList:List<ShopModel>):
    RecyclerView.Adapter<ShopAdaptir.ShopViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val binding=ItemSettingShopBinding.inflate(inflater,parent,false)
        return ShopViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.bind(dataList[position])
    }


    class ShopViewHolder(private val binding: ItemSettingShopBinding) : ViewHolder(binding.root) {
        fun bind(data: ShopModel) {
            binding.image1.setImageResource(data.resIcon)
            binding.image1text.text=data.name
            binding.shopprice.text=data.price


        }
    }
}