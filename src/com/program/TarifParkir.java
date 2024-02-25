/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 * 
 * Menentukan biaya parkir berdasarkan lama parkir yang dihitung berdasarkan selisih
 * jam masuk dan jam keluar (dengan ketentuan seperti soal no 1). Biaya parkir 2 jam
 * pertama 1500 dan perjam berikutnya 1000.
 * 
 * 
 */
import java.util.Scanner;


public class TarifParkir {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();
        
        System.out.println("Masukkan jam keluar: ");
        int jamKeluar = input.nextInt();

        int lamaParkir;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (12 - jamMasuk) + jamKeluar;
        }

        int biayaParkir = 0;
        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }
        
        System.out.println("Lama parkir Anda adalah " + lamaParkir + " jam");
        System.out.println("Biaya parkir yang harus dibayar sebesar Rp " + biayaParkir);
        
    }
    
    
    
}