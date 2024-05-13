package com.dhnph34455.fpt.edu.kotlin_b1.ui.theme

fun main(){
    println("Lab 1 - MD18305")


    //khai bao bien: dùng val or var
    // cach1: dung val: không thay đổi giá trị biến
//    val a = 1
//    val b = 2
//    val c = 3
//    val d = a + b + c
//    println("Tong a , b va c la : $d")
//
//    //cach 2: khai bao bien - ro du lieu
//    val so1 : Int = 2
//    val so2 : Float = 3f
//    val so3 : Double = 4.0
//    val tich = so1 * so2 * so3
//    val mess : String = "tich 2 so $so1  $so2 va $so3 la: $tich"
//    println("$mess")


//    //readln(): nhap du lieu dau vao
//    println("Moi nhap so thu nhat")
//    val soThuNhat = readln()
//    println("Moi nhap so thu 2")
//    val soThu2 = readln()
//
//    val tong2So = soThuNhat.toInt() + soThu2.toInt()
//    //toInt() : ep kieu int
//
//    println("tong 2 so = : $tong2So")

    println("Moi nhap so A")
    val soA = readln()
    println("Moi nhap so B")
    val soB = readln()

    println("thuong 2 so a va b la: ${thuong(soA.toFloat(), soB.toFloat())}")
}


fun thuong(soA: Float, soB: Float): Float {
    if (soB == 0f){
        return 2f
    }
    val Thuong = soB / soA
    return Thuong
}

class b1 {
}