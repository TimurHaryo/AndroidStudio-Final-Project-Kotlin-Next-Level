package com.coding.kotlinnextlevel.generics.model

data class Bread(
    override val discount: Double,
    val taste: String,
) : Food {

    override fun eat() {
        println("Have a bread day!")
    }
}
