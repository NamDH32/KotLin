package com.dhnph34455.fpt.edu.kotlin_b1.Lab3

// Lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên
open class Nguoi(
    val hoTen: String,
    val tuoi: Int,
    val queQuan: String,
    val maSoGV: String
) {
    override fun toString(): String {
        return "MSGV: $maSoGV - Họ tên: $hoTen, Tuổi: $tuoi, Quê quán: $queQuan"
    }
}

class CBGV(
    hoTen: String,
    tuoi: Int,
    queQuan: String,
    maSoGV: String,
    var luongCung: Double,
    var luongThuong: Double,
    var tienPhat: Double
) : Nguoi(hoTen, tuoi, queQuan, maSoGV) {

    fun tinhLuongThucLinh(): Double {
        return luongCung + luongThuong - tienPhat
    }

    override fun toString(): String {
        return super.toString() + ", Lương cứng: $luongCung, Lương thưởng: $luongThuong, Tiền phạt: $tienPhat, Lương thực lĩnh: ${tinhLuongThucLinh()}"
    }
}

class QuanLyCBGV {
    private val danhSachCB = mutableListOf<CBGV>()

    fun themCB(cbgv: CBGV) {
        danhSachCB.add(cbgv)
    }

    fun xoaCB(maSoGV: String): Boolean {
        val iterator = danhSachCB.iterator()
        while (iterator.hasNext()) {
            val cbgv = iterator.next()
            if (cbgv.maSoGV == maSoGV) {
                iterator.remove()
                return true
            }
        }
        return false
    }

    fun hienThiDSCB() {
        for (cbgv in danhSachCB) {
            println(cbgv)
        }
    }

    fun tinhLuongThucLinh(maSoGV: String): Double? {
        for (cbgv in danhSachCB) {
            if (cbgv.maSoGV == maSoGV) {
                return cbgv.tinhLuongThucLinh()
            }
        }
        return null
    }
}

fun main() {
    val qlCB = QuanLyCBGV()

    // Thêm cán bộ giáo viên
    val gv1 = CBGV("Nguyễn Văn A", 40, "Hà Nội", "GV001", 15000000.0, 2000000.0, 500000.0)
    val gv2 = CBGV("Trần Thị B", 35, "TP HCM", "GV002", 16000000.0, 2500000.0, 300000.0)

    qlCB.themCB(gv1)
    qlCB.themCB(gv2)

    println("Danh sách cán bộ giáo viên:")
    qlCB.hienThiDSCB()

    val maSoGV = "GV001"
    val luongThucLinh = qlCB.tinhLuongThucLinh(maSoGV)
    if (luongThucLinh != null) {
        println("\nLương thực lĩnh của giáo viên với mã số $maSoGV là: $luongThucLinh")
    } else {
        println("\nKhông tìm thấy giáo viên với mã số $maSoGV")
    }

    qlCB.xoaCB(maSoGV)

    println("\nDanh sách cán bộ giáo viên sau khi xóa:")
    qlCB.hienThiDSCB()
}

