package com.coding.kotlinnextlevel.collections.util

import com.coding.kotlinnextlevel.collections.model.Product
import com.coding.kotlinnextlevel.collections.model.ProductType

object ProductConstants {
    val purchasedProducts = listOf(
        Product(
            "Cereal",
            9.1,
            ProductType.FOOD,
        ),
        Product(
            "Radio",
            31.9,
            ProductType.ELECTRONIC,
        ),
        Product(
            "Jacket",
            20.0,
            ProductType.CLOTHES,
        ),
        Product(
            "Bread",
            4.0,
            ProductType.FOOD,
        ),
        Product(
            "Coffee",
            9.0,
            ProductType.BEVERAGE,
        ),
    )
}
