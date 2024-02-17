package com.leo.lib.learnKotlin.excercises

import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    println("enter 1st number")
    var a =sc.nextInt()
    println("enter 2nd number")
    var b = sc.nextInt()

    println("reversing the numbers")
    val temp = a
    a = b
    b = temp

    println("the first num is $a and the second num is $b now")

}