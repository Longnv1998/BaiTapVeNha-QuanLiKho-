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
public class Main {

    ArrayList<Khu> List_Khu = new ArrayList<>();
    ArrayList<Kho> List_Kho = new ArrayList<>();
    ArrayList<MatHang> List_MH = new ArrayList<>();
    ArrayList<HoaDon> List_HD = new ArrayList<>();

    public void NhapThongTin() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so luong Kho:");
        int n = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < n; i++) {
            //nhap kho
            Kho kho = new Kho();
            System.out.println("=====Kho Hang=====");
            System.out.println("Kho hang thu " + (i + 1));
            kho.NhapThongTinKhoHang();
            List_Kho.add(kho);
            for (int j = 0; j < kho.getSoKhu(); j++) {
                //nhap khu
                Khu khu = new Khu();
                System.out.println("=====Khu=====");
                System.out.println("Khu thu " + (j + 1));
                System.out.print("Khu nay de nhap hay de trong, chon 1 de nhap...2 de trong: ");
                int d = Integer.parseInt(nhap.nextLine());
                if (d == 2) {
                    System.out.println("Nhap ten khu: ");
                    khu.setTenKhu(nhap.nextLine());
                    khu.setDienTich(kho.getDienTichKho() / kho.getSoKhu());
                    khu.setTenMatHang(null);
                    khu.setThuocKho(kho.getTenKho());

                    List_Khu.add(khu);
                } else if (d == 1) {
                    khu.NhapThongTinKhu();
                    List_Khu.add(khu);
                    khu.setDienTich(kho.getDienTichKho() / kho.getSoKhu());//tinh dien tich khu
                    khu.setThuocKho(kho.getTenKho());//xet ten khu thuoc kho nao
                    //Nhap mat hang
                    MatHang MH = new MatHang();
                    MH.NhapThongTinMatKhang();
                    if (MH.getSoLuong() * MH.getDienTich() > khu.dienTich) {
                        System.out.println("So luong vuot qua dien tich cua KHU");
                        System.out.println("So luong:");
                        MH.setSoLuong(Integer.parseInt(nhap.nextLine()));
                    }
                    khu.setTenMatHang(MH.getTenMatHang()); //nhap ten mat hang vao bang Khu
                    List_MH.add(MH);
                    MH.setThuocKhu(khu.getTenKhu());
                    MH.HienThiThongTinMatHang();
                } else {
                    System.out.println("co muon nhap nua k?");
                }
                //
            }
            System.out.println("");
        }
    }

    //
    public void HienThongTin() {
        Main m = new Main();
        Scanner nhap = new Scanner(System.in);
        boolean stt = true;
        System.out.println("Ban muon hien thi theo:");
        System.out.println("1-Kho    2-Mat Hang");
        System.out.print("chon: ");
        int number = Integer.parseInt(nhap.nextLine());
        if (number < 1 || number > 2) {
            System.out.println("Nhap ngu");
        }
        if (number == 1) {
            System.out.println("Thong tin kho:");
            for (Kho a : List_Kho) {
                System.out.println(a);
            }
        } else {
            for (int i = 0; i < List_Kho.size(); i++) {
                System.out.println("Thong tin kho hang thu " + (i + 1) + ":");
                List_Kho.get(i).HienThiThongTinKhoHang();
                System.out.println("Trong kho co cac Khu: ");
                for (int j = 0; j < List_Khu.size(); j++) {
                    if (List_Khu.get(j).getThuocKho().equals(List_Kho.get(i).getTenKho())) {
                        List_Khu.get(j).HienThiThongTinKhu();
                        if (List_Khu.get(j).getTenMatHang() != null) {
                            System.out.println("Thong tin mat hang " + List_Khu.get(j).getTenMatHang() + " trong khu:");
                        }
                        for (int k = 0; k < List_MH.size(); k++) {
                            if (List_MH.get(k).getThuocKhu().equals(List_Khu.get(j).getTenKhu())) {
                                List_MH.get(k).HienThiThongTinMatHang();
                            }
                        }
                        System.out.println("");
                    }
                }
            }
            System.out.println("");
        }
    }

    //
    public void XuatKho() {
        Main M = new Main();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Ban muon xuat mat hang nao: ");
        String tenMH = nhap.nextLine();
        System.out.println("Cac Kho Hang hien co: ");
        for (int i = 0; i < List_Kho.size(); i++) {
            System.out.println("ten Kho hang "+(i+1)+" : " + List_Kho.get(i).getTenKho());
        }
        System.out.print("Moi chon so thu tu Kho Hang can xuat: ");
        int sttKho = Integer.parseInt(nhap.nextLine());
        if (sttKho < 0 || sttKho > List_Kho.size()) {
            System.out.println("Nhap ngu!");
            M.XuatKho();
        } else {
            System.out.println("Trong Kho " + List_Kho.get(sttKho - 1).getTenKho());
            for (int i = 0; i < List_Khu.size(); i++) {
                if (List_Khu.get(i).getThuocKho().equals(List_Kho.get(sttKho - 1).getTenKho())) {
                    System.out.println("ten Khu " + (i + 1) + ": " + List_Khu.get(i).getTenKhu());
                }
            }
            System.out.print("Chon Khu: ");
            int sttKhu = Integer.parseInt(nhap.nextLine());
            if (sttKhu > 0 && sttKho <= List_Khu.size()) {
                if (List_MH.get(sttKhu - 1).getTenMatHang().equals(tenMH)) {
                    System.out.print("Ban muon xuat bao nhieu chiec: ");
                    int num = Integer.parseInt(nhap.nextLine());
                    if (List_MH.get(sttKhu - 1).getSoLuong() < num) {
                        System.out.println("Vuot qua so luong trong Kho! nhap lai");
                    } else {
                        System.out.println("Xuat Thanh Cong!");
                        HoaDon hd=new HoaDon();
                        hd.setTenMH(tenMH);
                        hd.setSoLuongXuat(num);
                        hd.setSoLuongConLai(List_MH.get(sttKhu-1).getSoLuong()-num);
                        List_MH.get(sttKhu-1).setSoLuong(hd.getSoLuongConLai());
                        System.out.println("So Luong san pham trong kho hien tai la: " + hd.getSoLuongConLai());
                        hd.setViTri("Thuoc khu "+List_MH.get(sttKhu-1).getThuocKhu()+" Trong kho hang "+List_Khu.get(sttKhu-1).getThuocKho());
                        List_HD.add(hd);
                    }
                } else {
                    System.out.println("Trong kho khong co mat hang ban can!");
                }
            } else {
                System.out.println("Lai nhap ngu!");
                M.XuatKho();
            }

        }
    }

    public void KiemTraHang() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Cac Kho hang hien co:");
        for (int i = 0; i < List_Kho.size(); i++) {
            System.out.println("Kho" + (i + 1) + " ten la: " + List_Kho.get(i).getTenKho());
        }
        System.out.println("Chon kho o vi tri thu : ");
        int stt = Integer.parseInt(nhap.nextLine()); //stt kho
        System.out.println("Trong kho chua cac khu nhu sau:");
        for (int i = 0; i < List_Khu.size(); i++) {
            if (List_Khu.get(i).getThuocKho().equals(List_Kho.get(stt - 1).getTenKho())) {
                if(List_Khu.get(i).getTenMatHang() != null){
                System.out.println("Khu " + List_Khu.get(i).getTenKhu() + " chua " + List_Khu.get(i).getTenMatHang());
                }else{
                    System.out.println("Khu "+List_Khu.get(i).getTenKhu()+" dang trong!");
                }
                for (int j = 0; j < List_MH.size(); j++) {
                    if (List_Khu.get(i).getTenKhu().equals(List_MH.get(j).getThuocKhu())) {
                        if (List_MH.get(j).getSoLuong() == List_Khu.get(i).getDienTich()) {
                            System.out.println("Kho nay da day!");
                        } else {
                            System.out.println("\t Khu "+List_Khu.get(i).getTenKhu()+" con co the them " + (List_Khu.get(i).getDienTich() - List_MH.get(j).getSoLuong())+" san pham");
                        }
                    }
                }
            }
        }
    }
    public void XuatHoaDong(){
        for (HoaDon a : List_HD) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner nhap = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("-----Chon chuc nang------");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Hien thong tin");
            System.out.println("3.Xuat kho");
            System.out.println("4.kiem tra Hang");
            System.out.println("5.Xuat Hoa Don");
            System.out.println("6.Thoat");
            System.out.print("chon: ");
            int chon = Integer.parseInt(nhap.nextLine());
            switch (chon) {
                case 1:
                    status = true;
                    main.NhapThongTin();
                    break;
                case 2:
                    status = true;
                    main.HienThongTin();
                    break;
                case 3:
                    main.XuatKho();
                    System.out.println("Ban co muon xuat them san pham nao nua k(y or n): ");
                    String bl = nhap.nextLine();
                    if (bl.equals("y")) {
                        main.XuatKho();
                    } else {
                        status = true;
                    }
                    break;
                case 4:
                    main.KiemTraHang();
                    break;
                case 5:
                    main.XuatHoaDong();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

}
