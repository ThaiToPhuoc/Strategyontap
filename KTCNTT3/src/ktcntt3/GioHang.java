/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktcntt3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class GioHang {
    
    List<MatHang> listmh = new ArrayList<>();
    
    ITinhchietkhau chietkhau;
    IVanchuyen vanchuyen;
    IKhuyenmai khuyenmai;
    
    public void themhang(MatHang mh)
    {
        this.listmh.add(mh);
    }
   
    public void chonchietkhau(ITinhchietkhau chietkhau)
    {
        this.chietkhau = chietkhau;
    }
    
    public void chonvanchuyen(IVanchuyen vanchuyen)
    {
        this.vanchuyen = vanchuyen;
    }
    
    public void chonkhuyenmai(IKhuyenmai khuyenmai)
    {
        this.khuyenmai = khuyenmai;
    }
    
    public void thanhtoan()
    {
        int tongtien = 0;
        System.out.println("\n Cac mat hang da mua:");
        for(MatHang mh: listmh)
        {
            tongtien += mh.getDonGia() * mh.getSoLuong();
            System.out.println("\n" + mh.toString());
        }
        
        System.out.println("\n Tong tien: " + tongtien);
        System.out.println("\n Tong chiet khau: " + (tongtien * chietkhau.tinhchietkhau(tongtien)));
        System.out.println("\n Tong tien qua chiet khau: " + (tongtien - (tongtien * chietkhau.tinhchietkhau(tongtien))));
        System.out.println("\n Van chuyen: " + vanchuyen.Vanchuyen() + ", tien van chuyen: " + vanchuyen.phivanchuyen());
        System.out.println("\n Khuyen mai: " + khuyenmai.khuyenmai()*tongtien);
     
    }
}
