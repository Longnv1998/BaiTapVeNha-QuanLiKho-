/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanly;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class MatHang {
    protected int maMathang;
    protected String tenMatHang;
    protected int soLuong;
    protected int dienTich;

    public MatHang() {
    }

    public MatHang(int maMathang, String tenMatHang, int soLuong, int dienTich) {
        this.maMathang = maMathang;
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.dienTich = dienTich;
    }

    public int getMaMathang() {
        return maMathang;
    }

    public void setMaMathang(int maMathang) {
        this.maMathang = maMathang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDienTich() {
        if(tenMatHang.equals("CPU")){
            dienTich=1;
        }else if(tenMatHang.equals("Chuot")){
            dienTich=3;
        }else{
            dienTich=0;
        }
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
    
    public abstract void NhapThongTinMatKhang();

    public void HienThiThongTinMatHang(){
        System.out.println("Thong tin mat hang: ");
        System.out.println("\tMa mat hang: "+maMathang);
        System.out.println("\tTen mat hang: "+ tenMatHang);
        System.out.println("\tSo luong: "+soLuong);
        System.out.println("\tDien Tich: "+dienTich);
    }
        
    @Override
    public String toString() {
        return "MatHang{" + "maMathang=" + maMathang + ", tenMatHang=" + tenMatHang + ", soLuong=" + soLuong + ", dienTich=" + dienTich + '}';
    }


}
