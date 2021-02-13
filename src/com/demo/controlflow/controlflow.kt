package com.demo.controlflow
fun main(){
    //Inclusive 1 to 5
    for(i in 1..5){
        print("${i} \t")
    }
    println()
    //Exclude 5
    for(i in 1 until 5){
        print("${i} \t")
    }
    println()
    //1 to 5
    for(i in 1.rangeTo(5)){
        print("${i} \t")
    }
    println()
    //Print in reverse
    for(i in 5 downTo 1){
        print("${i} \t")
    }
    println()
    //increase by 2
    for(i in 1..5 step 2){
        print("${i} \t")
    }
}