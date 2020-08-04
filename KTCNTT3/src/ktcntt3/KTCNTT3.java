/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktcntt3;

/**
 *
 * @author DELL
 */
public class KTCNTT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang giohang = new GioHang();
        
        MatHang mh1 = new MatHang("Game1", 2, 500000);
        MatHang mh2 = new MatHang("Game2", 1, 200000);
        
        giohang.themhang(mh1);
        giohang.themhang(mh2);
        
        ITinhchietkhau Vang = new Chietkhauvang();
        IVanchuyen Nhanh = new Giaohangnhanh();
        IKhuyenmai khongkhuyenmai = new Khongkhuyenmai();
        
        giohang.chonchietkhau(Vang);
        giohang.chonvanchuyen(Nhanh);
        giohang.chonkhuyenmai(khongkhuyenmai);
        
        giohang.thanhtoan();
    }
    
}
