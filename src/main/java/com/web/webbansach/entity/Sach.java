package com.web.webbansach.entity;

import java.util.List;

public class Sach {
    private int maSach;
    private String tenSach;
    private String tenTacGia;
    private String ISBN;
    private String moTa;
    private double giaNiemYet;
    private double giaBan;
    private int soLuong;
    private Double trungBinhXepHang;

    List<TheLoai> danhSachTheLoai;
    List<HinhAnh> danhSachHinhAnh;
    List<SuDanhGia> danhSachSuDanhGia;


}
