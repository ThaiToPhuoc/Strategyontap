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
public class Chietkhaukimcuong implements ITinhchietkhau{

    @Override
    public float tinhchietkhau(int tongtien) {
         if(tongtien <5000)
            return (float) 0.03;
        else
            return (float) 0.06;
    }
    
}
