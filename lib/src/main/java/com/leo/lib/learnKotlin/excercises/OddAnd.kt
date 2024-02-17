package com.leo.lib.learnKotlin.excercises

import java.util.Scanner

//odd and even finder
fun main() {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt();
    if (num%2 == 0){
        println(" number $num is ever")
    }else println("number $num is odd")
}