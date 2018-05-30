/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Kho {
    private int maKho;
    private String tenKho;
    private int chieuDai;
    private int chieuRong;
    private int dienTichKho;
    private int soKhu;
    public ArrayList<Khu> List_Khu ;
    private ArrayList<PhieuXuat> List_PX;

    public Kho() {
    }

    public Kho(int maKho, String tenKho, int chieuDai, int chieuRong, int dienTichKho, int soKhu, ArrayList<Khu> List_Khu, ArrayList<PhieuXuat> List_PX) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.dienTichKho = dienTichKho;
        this.soKhu = soKhu;
        this.List_Khu = List_Khu;
        this.List_PX = List_PX;
    }

    public int getMaKho() {
        return maKho;
    }

    public void setMaKho(int maKho) {
        this.maKho = maKho;
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

    public int getDienTichKho() {
        return dienTichKho=chieuDai*chieuRong;
    }

    public void setDienTichKho(int dienTichKho) {
        this.dienTichKho = dienTichKho;
    }

    public int getSoKhu() {
        return soKhu;
    }

    public void setSoKhu(int soKhu) {
        this.soKhu = soKhu;
    }

    public ArrayList<Khu> getList_Khu() {
        return List_Khu;
    }

    public void setList_Khu(ArrayList<Khu> List_Khu) {
        this.List_Khu = List_Khu;
    }

    public ArrayList<PhieuXuat> getList_PX() {
        return List_PX;
    }

    public void setList_PX(ArrayList<PhieuXuat> List_PX) {
        this.List_PX = List_PX;
    }

    

    public void NhapThongTinKhoHang() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ma kho hang: ");
        maKho=Integer.parseInt(nhap.nextLine());
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
        System.out.println("So khu vuc: ");
        soKhu=Integer.parseInt(nhap.nextLine());
    }

    public void HienThiThongTinKhoHang() {
        System.out.print("\tTen kho: " + tenKho);
        System.out.print("\tChieu dai: " + chieuDai);
        System.out.print("\tChieu rong: " + chieuRong);
        System.out.println("\tSo khu vuc: "+soKhu);
        System.out.println("\tcac khu trong kho: ");
        for (int i = 0; i < List_Khu.size(); i++) {
            List_Khu.get(i).getTenKhu();
        }
    }

    @Override
    public String toString() {
        return "Kho{" + "maKho=" + maKho + ", tenKho=" + tenKho + ", chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", dienTichKho=" + dienTichKho + ", soKhu=" + soKhu + ", List_Khu=" + List_Khu + ", List_PX=" + List_PX + '}';
    }

    
    
}
