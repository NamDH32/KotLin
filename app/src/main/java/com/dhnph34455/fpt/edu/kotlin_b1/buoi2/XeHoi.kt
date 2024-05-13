package com.dhnph34455.fpt.edu.kotlin_b1.buoi2

fun main() {
    val xe1 = XeHoi("xe1", 100, 2003)
    println(xe1.hienThi())
    val xe2 = XeHoi("xe2", 300)
    println(xe2.hienThi())
    var tenSv = "Dinh Nguyen Anh Thu"
    MesSv(tenSv)
}

fun MesSv(tenSinhVien: String) {
    if (tenSinhVien == null) {
        println("ten khoong null")
    } else
        println("ten sv la: $tenSinhVien")
}

class XeHoi(val tenXe: String, var giaXe: Int) {

    var namSX: Int? = 0

    constructor(tenXe: String, giaXe: Int, namSX: Int) : this(tenXe, giaXe) {
        this.namSX = namSX
    }

    fun hienThi(): String {
        if (namSX == null || namSX == 0) {
            return "Ten xe: $tenXe, Gia xe: $giaXe"
        } else
            return "Ten xe: $tenXe , Gia xe: $giaXe, namSx: $namSX"
    }

}