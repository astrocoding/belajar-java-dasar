/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date Saturday, 26-12-2020
 */
public class VariabelKonstantaTipedata {
   static int nilai;
   static char inisial; // Class Variabel
   public static final double PHI = 3.14;
   public static char x;
   
    public static void main(String[] args){
        // Variabel, Konstanta dan Tipe data
        String nama;
        nama = new String("Zaenal Alfian");
        String name = "Haikal Fasiha Fayyadh";
        String kelas = new String("XII RPL 1");
        nilai = 100;
        inisial = 'Z';
        x = 120; // number key untuk character x kecil pada keyboard
        
        double bagi; // Casting tipe data numerik
        bagi = (float) 5/2; // Konversi float ke double otomatis sebaliknya tidak
        
        // Output
        
        System.out.printf("%s dan %s dari kelas %s\n", nama, name, kelas);
        System.out.printf("%c\n",x);
        System.out.printf("%f\n",bagi);
    }
}
