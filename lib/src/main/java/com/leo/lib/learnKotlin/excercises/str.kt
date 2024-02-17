package com.leo.lib.learnKotlin.excercises

import java.util.Scanner

// write a program to count letters , spaces, numbers,and other characters of an input str.

fun main() {
    println("enter the str")
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()

    println("the total number of letters : ${str.length}")

    var rev = ""
    for (a in str.length-1 downTo 0){
        rev+=(str.get(a))
    }
    println(rev)
}