/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 * 
 * Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
 * periksa apakah masukan adalah ribuan.
* 
* 
 */

import java.util.Scanner;
        
public class AngkaRibuan {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] angka = new int[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
        }
        
        for(int i = 0; i < 3; i++) {
            if (angka[i] >= 1000 && angka[i] <1000000) {
                System.out.println("Angka " + angka[i] + " termasuk ribuan");
            } else {
                System.out.println("Angka " + angka[i] + " bukan termasuk ribuan");
            }
        }
        
    }
    
}
