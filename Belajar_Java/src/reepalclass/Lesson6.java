package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date sunday, 13-12-2020
 */
public class Lesson6 {
    public static void main(String[] args){
        // Operator Unary = Operasi yang dilakukan pada satu operand
        
        // Unary + dan -
        int angka = 1;
        System.out.printf("Unary '+', %d menjadi %d\n", angka,+angka);
        System.out.printf("Unary '-', %d menjadi %d\n", angka,-angka);
        
        // Unary Increment dan Decrement
        int angka2 = 10;
        angka2++; // Bila operasinya dilakukan disini hasilnya akan sama
        ++angka2;
        System.out.println("nilai dengan '++' menjadi = "+angka2);
        int angka3 = 10;
        angka3--;
        System.out.println("Unary dengan '--' menjadi = "+angka3);
        
        int a = 5;
        System.out.printf("Nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d 'sebelum terbaca'\n", b++); // Yang dibaca terlebih dahulu adalah b baru ++ jadi hasilnya akan 5
        System.out.printf("Nilai hasil dari dari postfix menjadi = %d 'sesudah terbaca'\n", b); // sesudah operasi
        
        // Operasi boolean dengan ! untuk negasi
        boolean benar = true;
        System.out.println("nilai boolean = "+ benar);
        System.out.println("Nilai boolean '!' = "+ !benar); // Unary untuk tipe data boolean
    }
}
