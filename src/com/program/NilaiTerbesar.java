/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 * 
 * Buatlah algoritma dalam bahasa Java, yang menerima tiga buah angka masukan dan
 * menampilkan nilai yang paling besar dari ketiga masukan
 * 
 * 
 */

import java.util.Scanner;

public class NilaiTerbesar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        
        int terbesar = nilai[0];
        for(int i = 0; i < 3; i++) {
           if(nilai[i] > terbesar) {
               terbesar = nilai[i];
           }
        }
        
        System.out.println("Nilai terbesar dari ketiga nilai diatas adalah " + terbesar);
        
    }
    
}
