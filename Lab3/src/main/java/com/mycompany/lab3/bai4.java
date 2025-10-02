/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            System.out.print("  Ho va ten: ");
            hoTen[i] = sc.nextLine();
            System.out.print("  Diem: ");
            diem[i] = sc.nextDouble();
            sc.nextLine(); // bỏ Enter
        }
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho va ten: " + hoTen[i] + 
                               " | Diem: " + diem[i] + 
                               " | Hoc luc: " + xepLoai(diem[i]));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;
                    String tempTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempTen;
                }
            }
        }
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP THEO DIEM TANG DAN  ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Ho ten: " + hoTen[i] + 
                               " | Diem: " + diem[i] + 
                               " | Hoc luc: " + xepLoai(diem[i]));
        }
    }
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
}
