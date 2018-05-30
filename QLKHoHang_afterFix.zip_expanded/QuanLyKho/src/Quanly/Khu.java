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
public class Khu {

    private int maKhu;
    private String tenKhu;
    private String trangThai="Con Trong";
    private int dienTich;
    private ArrayList<MatHang> List_MH;

    public Khu() {
    }

    public Khu(int maKhu, String tenKhu, String trangThai, int dienTich, ArrayList<MatHang> List_MH) {
        this.maKhu = maKhu;
        this.tenKhu = tenKhu;
        this.trangThai = trangThai;
        this.dienTich = dienTich;
        this.List_MH = List_MH;
    }

    public int getMaKhu() {
        return maKhu;
    }

    public void setMaKhu(int maKhu) {
        this.maKhu = maKhu;
    }

    public String getTenKhu() {
        return tenKhu;
    }

    public void setTenKhu(String tenKhu) {
        this.tenKhu = tenKhu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public ArrayList<MatHang> getList_MH() {
        return List_MH;
    }

    public void setList_MH(ArrayList<MatHang> List_MH) {
        this.List_MH = List_MH;
    }

    public void NhapThongTinKhu() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ma khu: ");
        maKhu = Integer.parseInt(nhap.nextLine());
        System.out.println("Ten Khu:");
        tenKhu = nhap.nextLine();
    }

    public void HienThiThongTinKhu() {
        System.out.println("\tMa Khu: " + maKhu);
        System.out.print("\tTen Khu: " + tenKhu);
        System.out.println("\tTrang Thai: " + trangThai);
        System.out.println("\tDien tich: " + dienTich);
        System.out.print("\tMat hang trong kho: ");
        for (int i = 0; i < List_MH.size(); i++) {
            List_MH.get(i).getTenMatHang();
        }
    }

    @Override
    public String toString() {
        return "Khu{" + "maKhu=" + maKhu + ", tenKhu=" + tenKhu + ", trangThai=" + trangThai + ", dienTich=" + dienTich + ", List_MH=" + List_MH + '}';
    }

}
