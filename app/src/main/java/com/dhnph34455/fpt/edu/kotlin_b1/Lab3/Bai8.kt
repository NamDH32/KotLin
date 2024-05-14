package com.dhnph34455.fpt.edu.kotlin_b1.Lab3

import java.util.Scanner

data class SinhVien(
    val hoTen: String, val tuoi: Int, val lop: String
)

data class TheMuon(
    val maPhieuMuon: String,
    val ngayMuon: Int,
    val hanTra: Int,
    val soHieuSach: String,
    val sinhVien: SinhVien
)

class QuanLyTheMuon {
    private val danhSachTheMuon = mutableListOf<TheMuon>()

    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
    }

    fun xoaTheMuon(maPhieuMuon: String): Boolean {
        val iterator = danhSachTheMuon.iterator()
        while (iterator.hasNext()) {
            val theMuon = iterator.next()
            if (theMuon.maPhieuMuon == maPhieuMuon) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    fun hienThiDanhSachTheMuon() {
        for (theMuon in danhSachTheMuon) {
            println(theMuon)
        }
    }
}

fun main() {
    val qlTheMuon = QuanLyTheMuon()
    val scanner = Scanner(System.`in`)

    val sv1 = SinhVien("Nguyễn Văn A", 20, "Khoa CNTT")
    val sv2 = SinhVien("Trần Thị B", 21, "Khoa Toán")

    val theMuon1 = TheMuon("PM001", 1, 15, "S001", sv1)
    val theMuon2 = TheMuon("PM002", 2, 16, "S002", sv2)

    qlTheMuon.themTheMuon(theMuon1)
    qlTheMuon.themTheMuon(theMuon2)

    println("Danh sách thẻ mượn:")
    qlTheMuon.hienThiDanhSachTheMuon()

    println("Nhập mã phiếu mượn muốn xóa: ")
    val maPhieuXoa = scanner.nextLine()
    qlTheMuon.xoaTheMuon(maPhieuXoa)

    println("\nDanh sách thẻ mượn sau khi xóa:")
    qlTheMuon.hienThiDanhSachTheMuon()
}
