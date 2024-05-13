package com.dhnph34455.fpt.edu.kotlin_b1.Lab1.ViDu


//toán tử số học
fun main(){
    println("nhập số a")
    val a= readln()
    println("nhập số b")
    val b = readln()

    println("cộng cách 1: "+a+"+"+b+"="+(a+b))
    println("cộng cách 2: "+a+"+"+b+"="+(a.plus(b))) //plus(+)

    println("trừ cách 1: "+a+"-"+b+"="+(a.toInt()-b.toInt()))
    println("trừ cách 2: "+a+"-"+b+"="+(a.toInt().minus(b.toInt()))) //minus(-)

    println("nhân cách 1: "+a+"*"+b+"="+(a.toInt()*b.toInt()))
    println("nhân cách 2: "+a+"*"+b+"="+(a.toInt().times(b.toInt()))) //times(*)

    println()
}

class vidu3 {
}