/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap x:");
        x=sc.nextInt();
        for(int i=1; i<=10;i++){ 
        System.out.printf("%d x %d = %d\n", x, i, x*i);
        }
    }
}
