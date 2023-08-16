/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reepalclass;
import java.util.Scanner;
/**
 *
 * @author zaenalalfian
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        int alas,tinggi;
        float luas;
        System.out.println("=== Menghitung Luas Segitiga ===");
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Alas Segitiga (cm) = ");
        alas = masukan.nextInt();
        System.out.print("Masukan Tinggi Segitiga (cm) = ");
        tinggi = masukan.nextInt();
        
        // Menghitung
        System.out.println("=====================");
        luas = (float) (alas*tinggi)/2;
        System.out.printf("%d cm x %d cm / 2 = %f cm \n", alas,tinggi,luas);
        
        
    }
}
