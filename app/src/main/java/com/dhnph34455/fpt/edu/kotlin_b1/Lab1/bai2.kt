package com.dhnph34455.fpt.edu.kotlin_b1.Lab1

fun main(){
println("Mời nhập số a: ")
    val a = readln()
println("Mời nhập số b: ")
    val b = readln()

    println("Tổng 2 số a và b là: ${tong(a.toFloat(), b.toFloat())}")
    println("Hiệu 2 số a và b là: ${hieu(a.toFloat(), b.toFloat())}")
    println("Tích 2 số a và b là: ${tich(a.toFloat(), b.toFloat())}")
    println("Thương 2 số a và b là: ${thuong(a.toFloat(), b.toFloat())}")

}
fun tong(soA: Float, soB: Float):Any{
    val Tong= soA + soB
    return Tong
}

fun hieu(soA: Float, soB: Float): Any{
    val Hieu = soA - soB
    return Hieu
}

fun tich(soA: Float, soB: Float):Any{
    val Tich = soA * soB
    return Tich
}

fun thuong(soA: Float, soB: Float): Any{
    if (soB == 0f){
        println("số b không được bằng 0")
    }
    val Thuong = soA / soB
    return Thuong
}


class bai2 {
}