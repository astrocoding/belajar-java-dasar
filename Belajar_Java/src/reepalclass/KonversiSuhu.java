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
public class KonversiSuhu {
    public static void main(String[] args) {
        double C,F,R;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("===PROGRAM KONVERSI SUHU===");
        System.out.print("Masukan Nilai Celcius = ");
        C = masukan.nextDouble();
        
        R = C*4/5;
        F = C*9/5+32;
        System.out.printf("Nilai Celcius = %f C\n", C);
        System.out.printf("Nilai Reamur = %f Re\n", R);
        System.out.printf("Nilai Fahrenheit = %f F\n", F);
    }
}
