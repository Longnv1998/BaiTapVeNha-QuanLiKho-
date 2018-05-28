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
public class Khu {
    private String tenKhu;
    private String tenMatHang=null;
    protected int dienTich;
    protected String thuocKho;

    public Khu() {
    }

    public Khu(String tenKhu, String tenMatHang, int dienTich, String thuocKho) {
        this.tenKhu = tenKhu;
        this.tenMatHang = tenMatHang;
        this.dienTich = dienTich;
        this.thuocKho = thuocKho;
    }

    public String getTenKhu() {
        return tenKhu;
    }

    public void setTenKhu(String tenKhu) {
        this.tenKhu = tenKhu;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getThuocKho() {
        return thuocKho;
    }

    public void setThuocKho(String thuocKho) {
        this.thuocKho = thuocKho;
    }

    
    
    public void NhapThongTinKhu(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("Ten Khu:");
        tenKhu=nhap.nextLine();
    }
    public void HienThiThongTinKhu(){
        System.out.print("\tTen Khu: "+tenKhu);
        System.out.print("\tTen mat hang: "+tenMatHang);
        System.out.println("\tDien tich: "+dienTich);
    }

    @Override
    public String toString() {
        return "Khu{" + "tenKhu=" + tenKhu + ", tenMatHang=" + tenMatHang + ", dienTich=" + dienTich + ", thuocKho=" + thuocKho + '}';
    }

    
    
}
