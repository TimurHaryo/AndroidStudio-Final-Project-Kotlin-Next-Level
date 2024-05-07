package com.coding.kotlinnextlevel.generics.model

import com.coding.kotlinnextlevel.generics.model.Beverages

data class Coffee(
    override val isCold: Boolean,
    val coffeeType: String,
) : Beverages {

    override fun drink() {
        println("Yummy coffee")
    }
}
