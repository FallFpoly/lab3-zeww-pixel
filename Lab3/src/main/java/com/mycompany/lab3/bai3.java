/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("\nMang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }
        if (dem > 0) {
            double tbc = (double) tong / dem;
            System.out.println("Trung binh cac phan tu chia het cho 3: " + tbc);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3.");

        }
    }
}
