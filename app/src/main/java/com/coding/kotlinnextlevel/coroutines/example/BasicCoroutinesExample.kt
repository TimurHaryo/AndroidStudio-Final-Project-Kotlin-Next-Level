package com.coding.kotlinnextlevel.coroutines.example

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    basicLaunchingCoroutines()
    launchingCoroutinesWithResultOriented()
}

private fun basicLaunchingCoroutines() {
    runBlocking {
        println("Starting coroutine...")
        val data = fetchDataFromNetwork()
        println("Data fetched: $data")
    }

    println("Main thread continues...")
}

private fun launchingCoroutinesWithResultOriented() {
    runBlocking {
        println("Starting coroutine...")
        val deferredData = async { fetchDataFromNetwork() }
        val data = deferredData.await()
        println("Data fetched: $data")
    }

    println("Main thread continues...")
}

private suspend fun fetchDataFromNetwork(): String {
    delay(2000)  // Simulate network delay
    return "Some data from network"
}
