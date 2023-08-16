/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reepalclass;
import javax.swing.JOptionPane;
/**
 *
 * @author zaenalalfian
 */
public class NilaiKelulusanGUI {
    public static void main(String[] args) {
        String nama;
        int nilai;
        JOptionPane.showMessageDialog(null, "Aplikasi Menentukan Nilai Kelulusan!","WELCOME!",JOptionPane.INFORMATION_MESSAGE);
        nama = JOptionPane.showInputDialog(null, "Masukan Nama Anda :","NAMA ANDA!",JOptionPane.QUESTION_MESSAGE);
        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai Anda :","PREDIKAT ANDA!", JOptionPane.QUESTION_MESSAGE));
        if((nilai >= 90)&&(nilai <= 100)){
            JOptionPane.showMessageDialog(null, "Nama "+nama+" Nilai "+nilai+" Predikat A, LULUS!","PENGUMUMAN!", JOptionPane.INFORMATION_MESSAGE);
        }else if((nilai >= 80)&&(nilai < 90)){
            JOptionPane.showMessageDialog(null, "Nama "+nama+" Nilai "+nilai+" Predikat B, LULUS!","PENGUMUMAN!", JOptionPane.INFORMATION_MESSAGE);
        }else if((nilai >= 70)&&(nilai < 80)){
            JOptionPane.showMessageDialog(null, "Nama "+nama+" Nilai "+nilai+" Predikat C, LULUS!","PENGUMUMAN!", JOptionPane.INFORMATION_MESSAGE);   
        }else if((nilai >= 0)&&(nilai < 70)){
            JOptionPane.showMessageDialog(null, "Nama "+nama+" Nilai "+nilai+" Predikat D, LULUS!","PENGUMUMAN!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "INPUT NILAI INVALID","PERHATIAN!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
