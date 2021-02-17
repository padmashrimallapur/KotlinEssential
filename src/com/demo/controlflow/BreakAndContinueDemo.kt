package com.demo.controlflow

fun main() {
    outerloop@for (i in 1..3) {
        innerloop@ for (j in 1..3) {
            if (j == 2) break@outerloop
            println("i : ${i}, j : ${j}")
        }
        println()
    }

    println()
        listOf(1,2,3,4,5).forEach{
            if(it == 3) return@forEach
            println(it)
        }

}