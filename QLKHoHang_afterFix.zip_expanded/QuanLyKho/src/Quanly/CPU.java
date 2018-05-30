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
public class CPU extends MatHang{
    private String cache;
    private float tocDoXuLy;

    public CPU() {
    }

    public CPU(String cache, float tocDoXuLy) {
        this.cache = cache;
        this.tocDoXuLy = tocDoXuLy;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public float getTocDoXuLy() {
        return tocDoXuLy;
    }

    public void setTocDoXuLy(float tocDo) {
        this.tocDoXuLy = tocDo;
    }

    @Override
    public void NhapThongTinMatKhang() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap cache(L1 or L2): ");
        cache=nhap.nextLine();
        System.out.println("Nhap toc do xu li(2.6-->3.4 GHz): ");
        tocDoXuLy=Float.parseFloat(nhap.nextLine());
    }
    
    @Override
    public void HienThiThongTinMatHang() {
        System.out.println("Thong tin mat hang CPU: ");
        super.HienThiThongTinMatHang(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\tCache: "+cache);
        System.out.println("\tToc do xu ly: "+tocDoXuLy);
    }


    @Override
    public String toString() {
        return "CPU{" + "cache=" + cache + ", tocDoXuLy=" + tocDoXuLy + '}';
    }
}
