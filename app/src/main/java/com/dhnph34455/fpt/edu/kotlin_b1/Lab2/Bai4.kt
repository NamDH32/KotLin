package com.dhnph34455.fpt.edu.kotlin_b1.Lab2


//lưu trữ thông tin của mỗi sinh viên
data class SinhVien(
    var tenSV: String,
    var mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)

// Khai báo lớp QuanLySinhVien chứa các phương thức quản lý sinh viên
class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVien>()

    fun themSinhVien(sinhVien: SinhVien) {
        danhSachSinhVien.add(sinhVien)
    }

    fun xoaSinhVien(mssv: String) {
        val sinhVien = danhSachSinhVien.find { it.mssv == mssv }
        sinhVien?.let {
            danhSachSinhVien.remove(it)
            println("Đã xóa sinh viên có mã số $mssv")
        } ?: println("Không tìm thấy sinh viên có mã số $mssv")
    }

    fun suaThongTinSinhVien(
        mssv: String,
        tenMoi: String,
        diemTBMoi: Float,
        daTotNghiepMoi: Boolean?,
        tuoiMoi: Int?
    ) {
        val sinhVien = danhSachSinhVien.find { it.mssv == mssv }
        sinhVien?.apply {
            tenSV = tenMoi
            diemTB = diemTBMoi
            daTotNghiep = daTotNghiepMoi
            tuoi = tuoiMoi
            println("Đã cập nhật thông tin cho sinh viên có mã số $mssv")
        } ?: println("Không tìm thấy sinh viên có mã số $mssv")
    }

    fun xemDanhSachSinhVien() {
        println("Danh sách sinh viên:")
        danhSachSinhVien.forEachIndexed { index, sinhVien ->
            println("Sinh viên ${index + 1}:")
            println("Tên: ${sinhVien.tenSV}")
            println("MSSV: ${sinhVien.mssv}")
            println("Điểm TB: ${sinhVien.diemTB}")
            println("Đã tốt nghiệp: ${sinhVien.daTotNghiep ?: "Chưa rõ"}")
            println("Tuổi: ${sinhVien.tuoi ?: "Chưa rõ"}")
            println()
        }
    }
}

fun main() {
    val quanLy = QuanLySinhVien()

    // Thêm sinh viên vào danh sách
    val sinhVien1 = SinhVien("Nguyen Van A", "SV001", 8.5f, true, 21)
    val sinhVien2 = SinhVien("Tran Thi B", "SV002", 7.3f, false, 22)
    quanLy.themSinhVien(sinhVien1)
    quanLy.themSinhVien(sinhVien2)

    quanLy.xemDanhSachSinhVien()

    quanLy.suaThongTinSinhVien("SV002", "Tran Thi B", 7.8f, true, 23)

    quanLy.xemDanhSachSinhVien()

    quanLy.xoaSinhVien("SV001")

    quanLy.xemDanhSachSinhVien()
}
