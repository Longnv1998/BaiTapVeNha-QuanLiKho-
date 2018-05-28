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
public class Kho {

    private String tenKho;
    private int chieuDai;
    private int chieuRong;
    protected int dienTichKho;
    private int soKhu;

    public Kho() {
    }

    public Kho(String tenKho, int chieuDai, int chieuRong, int dienTichKho, int soKhu) {
        this.tenKho = tenKho;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.dienTichKho = dienTichKho;
        this.soKhu = soKhu;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    //DT chi co ham get
    public int getDienTichKho() {
        return dienTichKho=chieuDai*chieuRong;
    }

    public int getSoKhu() {
        return soKhu;
    }

    public void setSoKhu(int soKhu) {
        this.soKhu = soKhu;
    }

    public void NhapThongTinKhoHang() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ten kho hang: ");
        tenKho = nhap.nextLine();
        System.out.println("Chieu dai: ");
        chieuDai = Integer.parseInt(nhap.nextLine());
        if(chieuDai<0){
            System.out.println("nhap sai");
        }
        System.out.println("Chieu rong: ");
        chieuRong = Integer.parseInt(nhap.nextLine());
        if(chieuRong<0){
            System.out.println("nhap sai");
        }
        getDienTichKho();
        System.out.println("So khu can dung: ");
        soKhu = Integer.parseInt(nhap.nextLine());
        if(soKhu<0){
            System.out.println("nhap so khu khong dung! nhap lai");
        }
    }

    public void HienThiThongTinKhoHang() {
        System.out.print("\tTen kho: " + tenKho);
        System.out.print("\tChieu dai: " + chieuDai);
        System.out.print("\tChieu rong: " + chieuRong);
        System.out.println("\tSo Khu can dung: " + soKhu);
    }

    @Override
    public String toString() {
        return "Kho{" + "tenKho=" + tenKho + ", chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", dienTichKho=" + dienTichKho + ", soKhu=" + soKhu + '}';
    }
    
}
