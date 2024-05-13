package com.dhnph34455.fpt.edu.kotlin_b1.ui.theme


fun main(){
    //khai báo và sử dụng mảng
    var mangSN = intArrayOf(1,2,3,4)
    println(mangSN.asList())

    println("các phần tử mảng x")
    //cach 1
    for (x in mangSN){
        println(x)
    }

    mangSN[1] = 4
    mangSN[mangSN.size-1] = 5 //phần tử cuối cùng
    //cach 2
    for (i in mangSN.indices){
        println("phần tử thứ $i trong mảng x: ${mangSN[i]}")
    }

    //danh sách
    var listX = mangSN.asList().toMutableList()
    listX.add(6)

    for (i in listX.indices){
        println("phan tu thu $i trong mang : ${listX[i]}")
    }

    val listY= mutableListOf(3,4,5,6)
    listY.add(0,9)
    listY.removeAt(listY.size-1)
    println("ListY: $listY")


    println("nhap ten sv")
    var s = readln()
    if (s != null){
        println(getMssv(s))
    }

}

private val map_dsSV: Map<String, String> = mutableMapOf("PH34455" to "Dinh hoai nam", "PH34456" to "Dinh Nguyen Anh Thu" )
//cú pháp when trong kotlin

fun getMssv(tenSV: String) :String?{
    when(tenSV){
        "PH34455" -> {return map_dsSV.get(tenSV)}
        "PH34456" ->{return map_dsSV.get(tenSV)}

    }
    return "khong co"
}

class b2 {
}