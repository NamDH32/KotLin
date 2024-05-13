package com.dhnph34455.fpt.edu.kotlin_b1.Lab1.ViDu

//kiểu string và trả về unit (không có giá trị trả về)
fun game(fifa: String):Unit{
    println(fifa)
}

//kiểu gán dữ liệu truyền vào
fun kieu(mess: String , fb: String = "namDH"){
    println("[$mess], $fb")
}

fun tong(x: Int, y: Int):Int{
    return x+y
}

//chạy
fun main(){
    game("Hi cac ban")

    kieu("Hi cac ban")
    kieu("Hi","xin chao")
    kieu(mess = "Hi", fb = "cac ban")

    println(tong(1,2))
}

class vidu2 {
}