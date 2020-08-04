package ktcntt3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MatHang {
    String ten;
    int SoLuong;
    int DonGia;

    @Override
    public String toString() {
        return "MatHang{" + "ten=" + ten + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }

    public MatHang(String ten, int SoLuong, int DonGia) {
        this.ten = ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
    
}
