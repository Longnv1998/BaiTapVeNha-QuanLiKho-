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
public class MatHang {

    protected String tenMatHang;
    protected int soLuong;
    protected int dienTich;
    protected String thuocKhu;

    public MatHang() {
    }

    public MatHang(String tenMatHang, int soLuong, int dienTich, String thuocKhu) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.dienTich = dienTich;
        this.thuocKhu = thuocKhu;
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
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getThuocKhu() {
        return thuocKhu;
    }

    public void setThuocKhu(String thuocKhu) {
        this.thuocKhu = thuocKhu;
    }

    public void NhapThongTinMatKhang() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ten mat hang:");
        String d = nhap.nextLine();
        if (d.equals("CPU")) {
            dienTich = 1;
            tenMatHang = d;
            System.out.println("So luong:");
            soLuong = Integer.parseInt(nhap.nextLine());
        } else if (d.equals("screen")) {
            dienTich = 5;
            tenMatHang = d;
            System.out.println("So luong:");
            soLuong = Integer.parseInt(nhap.nextLine());
        } else if (d.equals("mouse")) {
            dienTich = 2;
            tenMatHang = d;
            System.out.println("So luong:");
            soLuong = Integer.parseInt(nhap.nextLine());
            
        } else if (d.equals("keyboard")) {
            dienTich = 8;
            tenMatHang = d;
            System.out.println("So luong:");
            soLuong=Integer.parseInt(nhap.nextLine());
            
        } else {
            System.out.println("Nhap ten san pham khong dung!!");
            NhapThongTinMatKhang();
        }

    }

    public void HienThiThongTinMatHang() {
        System.out.println("\tten mat hang: " + tenMatHang);
        System.out.println("\tSo luong: " + soLuong);
        System.out.println("\tDien tich: " + dienTich);
    }

    @Override
    public String toString() {
        return "MatHang{" + "tenMatHang=" + tenMatHang + ", soLuong=" + soLuong + ", dienTich=" + dienTich + '}';
    }

}
