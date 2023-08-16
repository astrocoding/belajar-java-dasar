/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reepalclass;
/**
 *
 * @author zaenalalfian
 */
public class KelulusanNilai {
    public static void main(String[] args){
        int nilai = 600;
        String nama = "Zaenal Alfian";
        
        
        System.out.println("===PROGRAM MENENTUKAN NILAI KELULUSAN===");
        
        
        if((nilai >= 90) && (nilai <= 100)){
            System.out.printf("Nama %s Nilai %d Predikat A, Keterangan LULUS\n", nama,nilai);
        }else if((nilai >= 80) && (nilai < 90)){
            System.out.printf("Nama %s Nilai %d Predikat B, Keterangan LULUS\n", nama,nilai);
        }else if((nilai >= 70) && (nilai < 80)){
            System.out.printf("Nama %s Nilai %d Predikat C, Keterangan LULUS\n", nama,nilai);
        }else if((nilai >= 0) && (nilai < 70)){
            System.out.printf("Nama %s Nilai %d Predikat D, Keterangan TIDAK LULUS\n", nama,nilai);
        }else{
            System.out.println("Nilai Anda Invalid!");
        }
    }
}
