package com.example.practiceapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun decrement(shopItem: ShopItem)

    fun increment(shopItem: ShopItem)

    fun getShopList() : LiveData<List<ShopItem>>

}