/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanly;

/**
 *
 * @author admin
 */
public class HoaDon {
    protected String tenMH;
    protected int soLuongConLai;
    protected int soLuongXuat;
    protected String viTri;

    public HoaDon() {
    }

    public HoaDon(String tenMH, int soLuongConLai, int soLuongXuat, String viTri) {
        this.tenMH = tenMH;
        this.soLuongConLai = soLuongConLai;
        this.soLuongXuat = soLuongXuat;
        this.viTri = viTri;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoLuongConLai() {
        return soLuongConLai;
    }

    public void setSoLuongConLai(int soLuongConLai) {
        this.soLuongConLai = soLuongConLai;
    }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }

    public void setSoLuongXuat(int soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "tenMH=" + tenMH + ", soLuongConLai=" + soLuongConLai + ", soLuongXuat=" + soLuongXuat + ", viTri=" + viTri + '}';
    }
    
    
}
