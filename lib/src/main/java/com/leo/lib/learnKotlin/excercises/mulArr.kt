package com.leo.lib.learnKotlin.excercises

fun main() {
    var array1 = arrayOf(2,2,2,2,2,2,2,2,2,2,2,2)
    var arr2 = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    println("the multiplication is below :")
    for (a in array1.indices){
        println(" ${array1[a]} X ${arr2[a]} = ${array1[a] * arr2[a]}")
    }
}