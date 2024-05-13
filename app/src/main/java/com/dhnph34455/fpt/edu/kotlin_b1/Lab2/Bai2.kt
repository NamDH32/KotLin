package com.dhnph34455.fpt.edu.kotlin_b1.Lab2

//Nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm. Biết
//rằng tháng 1, 2, 3 là quý 1; tháng 4, 5, 6 là quý 2; tháng 7, 8, 9 là quý 3; tháng 10,
//11, 12 là quý 4

fun main() {
    var month = 0
    var isVldInput = false

    while (!isVldInput) {


        println("Nhập tháng: ")
        val s: String? = readLine()
        if (s != null && s.isNotEmpty()) {
            month = s.toIntOrNull() ?: 0 //chuyển đổi sang số nguyên ( fale thì gán = 0 )
            if (month >= 1 && month <= 12) {
                isVldInput = true
            } else {
                println("Tháng chỉ có từ tháng 1 đến 12")
            }
        }else{
            println("Vui lòng nhập lại tháng")
        }
    }


    when (month) {
        1, 2, 3 -> println("Đây là tháng " + month + " thuốc quý 1")
        4, 5, 6 -> println("Đây là tháng " + month + " thuốc quý 2")
        7, 8, 9 -> println("Đây là tháng " + month + " thuốc quý 3")
        10, 11, 12 -> println("Đây là tháng " + month + " huốc quý 4")
        else -> println("Đây là tháng" + month + "không có dữ liệu của tháng này")
    }
}


class Bai2 {
}