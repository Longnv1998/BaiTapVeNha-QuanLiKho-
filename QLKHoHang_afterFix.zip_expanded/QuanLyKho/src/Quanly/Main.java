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

    ArrayList<Kho> List_Kho = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        Scanner nhap = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("-----Chon chuc nang------");
            System.out.println("1.Nhap Kho");
            System.out.println("2.Nhap Khu");
            System.out.println("3.Hien thong tin");
            System.out.println("4.Them Mat hang");
            System.out.println("5.Xuat");
            System.out.println("6.Bao cao");
            System.out.println("7.Thoat");
            System.out.print("chon: ");
            int chon = Integer.parseInt(nhap.nextLine());
            switch (chon) {
                case 1:
                    status = true;
                    main.NhapKho();
                    break;
                case 2:
                    status = true;
                    main.NhapKhu();
                    break;
                case 3:
                    status = true;
                    main.HienThongtin();
                    break;
                case 4:
                    status = true;
                    main.NhapMatHang();
                    break;
                case 5:
                    main.XuatHang();
                    break;
                case 6:
                    main.XuatPhieuBaoCao();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

    public void NhapKho() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so kho hang muon them: ");
        int n = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < n; i++) {
            Kho kho = new Kho();
            System.out.println("========Kho hang========");
            System.out.println("Nhap kho thu " + (List_Kho.size() + 1) + " :");
            kho.NhapThongTinKhoHang();
            List_Kho.add(kho);
        }
    }

    public void NhapKhu() {
        ArrayList<Khu> List_Khu = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Cac kho hien tai dang co: ");
        for (Kho a : List_Kho) {
            System.out.println(a);
        }
        System.out.println("Chon ma kho muon them khu: ");
        int n = Integer.parseInt(nhap.nextLine());
        for (Kho k : List_Kho) {
            if (k.getMaKho() == n) {
                for (int i = 0; i < k.getSoKhu(); i++) {
                    Khu khu = new Khu();
                    System.out.println("Nhap thong tin khu vuc " + (i + 1));
                    khu.NhapThongTinKhu();
                    khu.setDienTich(k.getDienTichKho() / k.getSoKhu());
                    List_Khu.add(khu);
                }
                List_Kho.get(n - 1).setList_Khu(List_Khu);
            }
        }
    }

    public void HienThongtin() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hien thong tin: ");
        for (Kho a : List_Kho) {
            System.out.println(a);
        }
    }

    public void NhapMatHang() {
        ArrayList<MatHang> List_MH = new ArrayList<>();
        Khu khu = new Khu();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Cac kho hien tai dang co: ");
        for (Kho a : List_Kho) {
            System.out.println(a);
        }
        System.out.print("Chon ma kho muon them: ");
        int maKho = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < List_Kho.size(); i++) {
            if (List_Kho.get(i).getMaKho() == maKho) {
                System.out.println("Cac khu trong kho: ");
                //list khu trong kho
                for (Khu a : List_Kho.get(i).getList_Khu()) {
                    System.out.println(a);
                }
                System.out.print("Chon ma khu : ");
                int maKhu = Integer.parseInt(nhap.nextLine());
                for (Khu k : List_Kho.get(i).getList_Khu()) {
                    if (k.getMaKhu() == maKhu) {
                        System.out.println("Ban muon nhap mat hang nao: ");
                        String tenMH = nhap.nextLine();
                        if (tenMH.equals("CPU")) {
                            CPU cpu = new CPU();
                            System.out.println("Nhap ma mat hang: ");
                            int maMH = Integer.parseInt(nhap.nextLine());
                            for (int j = 0; j <= List_MH.size(); j++) {
                                if (List_MH.size() == 0) {
                                    cpu.setMaMathang(maMH);
                                    System.out.println("So luong: ");
                                    cpu.setSoLuong(Integer.parseInt(nhap.nextLine()));
                                    cpu.setTenMatHang(tenMH);
                                    cpu.NhapThongTinMatKhang();
                                    List_MH.add(cpu);
                                } else {
                                    if (List_MH.get(i).getMaMathang() != maMH) {
                                        cpu.setMaMathang(maMH);
                                        System.out.println("So luong: ");
                                        cpu.setSoLuong(Integer.parseInt(nhap.nextLine()));
                                        cpu.setTenMatHang(tenMH);
                                        cpu.NhapThongTinMatKhang();
                                        List_MH.add(cpu);
                                    } else {
                                        System.out.println("trong kho da co mat hang nay");
                                        System.out.print("ban muon nhan them bao nhieu: ");
                                        int slThem = Integer.parseInt(nhap.nextLine());
                                        List_MH.get(i).setSoLuong(cpu.getSoLuong() + slThem);
                                    }
                                }
                            }
                        } else if (tenMH.equals("Chuot")) {
                            Chuot c = new Chuot();
                            System.out.println("Nhap ma mat hang: ");
                            int maMH = Integer.parseInt(nhap.nextLine());
                            for (int j = 0; j <= List_MH.size(); j++) {
                                if (List_MH.size() == 0) {
                                    c.setMaMathang(maMH);
                                    System.out.println("So luong: ");
                                    c.setSoLuong(Integer.parseInt(nhap.nextLine()));
                                    c.setTenMatHang(tenMH);
                                    c.NhapThongTinMatKhang();
                                    List_MH.add(c);
                                } else {
                                    if (List_MH.get(i).getMaMathang() != maMH) {
                                        c.setMaMathang(maMH);
                                        System.out.println("So luong: ");
                                        c.setSoLuong(Integer.parseInt(nhap.nextLine()));
                                        c.setTenMatHang(tenMH);
                                        c.NhapThongTinMatKhang();
                                        List_MH.add(c);
                                    } else {
                                        System.out.println("trong kho da co mat hang nay");
                                        System.out.print("ban muon nhan them bao nhieu: ");
                                        int slThem = Integer.parseInt(nhap.nextLine());
                                        List_MH.get(i).setSoLuong(c.getSoLuong() + slThem);
                                    }
                                }
                            }
                        }
                    }
                    List_Kho.get(maKho - 1).getList_Khu().get(maKhu - 1).setList_MH(List_MH);
                    List_Kho.get(maKho - 1).getList_Khu().get(maKhu - 1).setTrangThai("Da chua hang");
                }
                for (MatHang a : List_MH) {
                    System.out.println(a);
                }
            }
        }
    }

    public void XuatHang() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Ban muon xuat mat hang nao: ");
        String tenMH = nhap.nextLine();
        System.out.println("Thong tin Kho: ");
        for (Kho a : List_Kho) {
            System.out.println(a);
        }
        System.out.print("Chon ma kho: ");
        int maKho = Integer.parseInt(nhap.nextLine());
        System.out.println("Thong tin khu trong kho " + List_Kho.get(maKho - 1).getTenKho());
        for (Khu a : List_Kho.get(maKho - 1).getList_Khu()) {
            System.out.println(a);
        }
        System.out.println("Chon ma khu: ");
        int maKhu = Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < List_Kho.get(maKho - 1).getList_Khu().size(); i++) {
            if (List_Kho.get(maKho - 1).getList_Khu().get(i).getMaKhu() == maKhu) {
                for (int j = 0; j < List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().size(); j++) {
                    if (List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getTenMatHang().equals(tenMH)) {
                        for (MatHang a : List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH()) {
                            System.out.println(a);
                        }
                        System.out.print("Moi ban chon Thu tu mat hang: ");
                        int maMH = Integer.parseInt(nhap.nextLine());
                        if (List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getMaMathang() == maMH) {
                            System.out.println("Ban muon xuat bao nhieu cai  " + tenMH + " : ");
                            int sl = Integer.parseInt(nhap.nextLine());
                            if (sl > List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getSoLuong()) {
                                System.out.println("So luong ban muon xuat da vuot qua so luong trong khu!");
                            } else {
                                System.out.println("Xuat kho thanh cong!");
                                List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).setSoLuong(List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getSoLuong() - sl);
                                System.out.println("So luong san pham " + tenMH + " trong kho con lai la: " + List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getSoLuong());
                                PhieuXuat px = new PhieuXuat();
                                ArrayList<PhieuXuat> List_PX = new ArrayList<>();
                                px.setTenMH(tenMH);
                                px.setMaMH(maMH);
                                px.setSoLuongConLai(List_Kho.get(maKho - 1).getList_Khu().get(i).getList_MH().get(j).getSoLuong());
                                px.setSoLuongXuat(sl);
                                px.setViTri("Thuoc khu " + List_Kho.get(maKho - 1).getList_Khu().get(i).getTenKhu());
                                List_PX.add(px);
                                List_Kho.get(maKho - 1).setList_PX(List_PX);
                                for (PhieuXuat a : List_Kho.get(maKho-1).getList_PX()) {
                                    System.out.println(a);
                                }
                            }
                        } else {
                            System.out.println("nhap sai ma MH");
                        }
                    } else {
                        System.out.println("trong khu k co mat hang ban can xuat");
                    }
                }
            }
        }
    }

    public void XuatPhieuBaoCao() {
        Scanner nhap = new Scanner(System.in);

        for (Kho a : List_Kho) {
            System.out.println(a);
        }
        System.out.println("Chon mã kho muốn xem phiếu xuất: ");
        int chonKHO=Integer.parseInt(nhap.nextLine());
        for (int i = 0; i < List_Kho.size(); i++) {
            if(List_Kho.get(i).getMaKho()==chonKHO){
                for (PhieuXuat a : List_Kho.get(i).getList_PX()) {
                    System.out.println("Kho "+List_Kho.get(i).getTenKho()+" : ");
                    System.out.println(a); 
                }
            }
        }
    }
}
