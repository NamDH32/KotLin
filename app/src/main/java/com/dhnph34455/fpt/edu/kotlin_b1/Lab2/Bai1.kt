package com.dhnph34455.fpt.edu.kotlin_b1.Lab2

import com.dhnph34455.fpt.edu.kotlin_b1.ui.theme.b1

// nhap a va b va giai phuong trinh ax+b=0
//fun main() {
//    var a = 0.0
//    var b = 0.0
//    println("Nhập a:")
//    var s = readLine() // đọc dữ liệu từ bàn phím
//    if (s != null) a = s.toDouble()
//    println("Nhập b:")
//    s = readLine()
//    if (s != null) b = s.toDouble()
//
//    println("Hệ Phương Trình có nghiệm x = ${HePhuongTrinh(a1 = a, b1 = b)}")
//}
//
//fun HePhuongTrinh(a1: Double, b1: Double): Double {
//    if (a1 == 0.0 && b1 == 0.0) {
//        println("Phương trình vô nghiệm")
//    } else if (a1 == 0.0 && b1 != 0.0) {
//        println("Phương trình vô nghiệm")
//    }
//    val x = -b1 / a1
//    return x
//
//}
fun main(){

    var a = 0.0
    var b = 0.0
    var isVldInput = false

    while (!isVldInput){
        println("Nhập a: ")
        val s = readLine()
        if (s != null && s.isNotEmpty()){
            a = s.toDoubleOrNull()?:0.0
        }
    }
}

class Bai1 {
}