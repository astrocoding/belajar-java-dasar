package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date Sunday, 13-12-2020
 */
public class Lesson5 {
    public static void main(String[] args){
        // Konversi Tipe Data Numerik
        int nilaiInt = 10000; // size 32 bit
        System.out.println("Nilai Integer = "+ nilaiInt);
        
        // Memperluas Rentang ke Tipe Data yang lebih besar (otomatis)
        long nilaiLong = nilaiInt;
        System.out.println("Ini nilai Long = "+ nilaiLong);
        
        // Memperkecil Rentang ke Tipe Data yang lebih kecil (akan ada masalah)
        byte nilaiByte = (byte) nilaiInt; // Nilainya akan berputar dan menjadi 0
        System.out.println("Ini adalah nilai Byte = "+ nilaiByte);
        System.out.println("Nilai Max Byte = "+ Byte.MAX_VALUE); // karena nilai ini nilainya akan berubah
        System.out.println("Nilai Min Byte = "+ Byte.MIN_VALUE);
        
        // Casting Pembagian
        
        int a = 10;
        int b = 4;
        float c = a / b; // Nilai c merupakan float tapi a dan b bukan float
        System.out.printf("%d / %d = %f\n", a,b,c); // Hasilnya bukan float tapi tidak akan sesuai perhitungan float
        
        // Cara pertama (tidak direkomendasikan)
        float nilai1 = 10; // Apabila salah satu nilainya float maka akan menjadi float
        int nilai2 = 4;
        float hasil = nilai1 / nilai2; // ini wajib float
        System.out.printf("%f / %d = %f\n", nilai1,nilai2,hasil);
        
        // Cara Kedua (Efisien)
        
        int x = 10;
        int y = 4;
        float z = (float) x / y; // mengkonversi nilainya menjadi float (akan berhasil)
        System.out.printf("%d / %d = %f\n", x,y,z); // Hasilnya akan sesuai pembagian dengan float
        
        
    }
}
