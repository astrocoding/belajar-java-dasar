package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date Sunday, 13-12-2020
 */
public class Lesson4 {
    public static void main(String[] args){
        // Operasi Aritmatika
        /**
         * Pejumlahan (+)
         * Pengurangan (-)
         * Perkalian (*)
         * Pembagian (/)
         * Modulus (%)
         * Note : Operasi Aritmatika Dipengaruhi oleh Tipe Datanya
        */
        
        int a = 11, b = 5, c; // Deklarasi Variabel
        
        c = a + b; // Penjumlahan
        System.out.printf("%d + %d = %d\n", a,b,c);
        c = a - b; // Pengurangan
        System.out.printf("%d - %d = %d\n", a,b,c);
        c = a * b; // Perkalian
        System.out.printf("%d * %d = %d\n", a,b,c);
        c = a / b; // Pembagian
        System.out.printf("%d / %d = %d\n", a,b,c);
        c = a % b; // Modulus (Sisa Pembagian)
        System.out.printf("%d %% %d = %d\n", a,b,c);
        
        float x = 5, y = 6, z;
        z = x / y;
        // System.out.printf("%d / %d = %d\n", x,y,z);
        System.out.println(x +" / "+y+" = "+z);
    }
}
