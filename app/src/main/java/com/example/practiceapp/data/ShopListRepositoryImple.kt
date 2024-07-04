package com.example.practiceapp.data

import androidx.lifecycle.LiveData
import com.example.practiceapp.domain.ShopItem
import com.example.practiceapp.domain.ShopListRepository

object ShopListRepositoryImple : ShopListRepository {

    override fun decrement(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun increment(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        TODO("Not yet implemented")
    }
}