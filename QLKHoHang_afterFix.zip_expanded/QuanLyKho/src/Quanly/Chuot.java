/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanly;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Chuot extends MatHang{
    private String hangSX;
    private String mauSac;
    private boolean loai;

    public Chuot() {
    }

    public Chuot(String hangSX, String mauSac, boolean loai) {
        this.hangSX = hangSX;
        this.mauSac = mauSac;
        this.loai = loai;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    @Override
    public void NhapThongTinMatKhang() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap hang san xuat: ");
        hangSX=nhap.nextLine();
        System.out.println("Nhap mau sac: ");
        mauSac=nhap.nextLine();
        System.out.println("Nhap loai: ");
        loai=Boolean.parseBoolean(nhap.nextLine());
    }

    @Override
    public void HienThiThongTinMatHang() {
        System.out.println("Thong tin mat hang chuot may tinh: ");
        super.HienThiThongTinMatHang(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\tHang San xuat: "+hangSX);
        System.out.println("\tMau sac: "+mauSac);
        System.out.println("\tLoai: "+loai);
    }
    
    
}
