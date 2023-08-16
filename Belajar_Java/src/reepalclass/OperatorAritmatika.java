package reepalclass;
import java.util.Scanner;

/**
 *
 * @author zaenalalfian
 * @date Monday, 14-12-2020
 */
public class OperatorAritmatika {
    public static void main(String[] args){
        int angka1,angka2,hasil,pilihan;
        
        System.out.println("Pilih Operasi Matematika :");
        System.out.println("=============================");
        System.out.println("[1] Penjumlahan\n[2] Pengurangan\n[3]Perkalian\n[4]Pembagian\n[5]Modulus");
        System.out.println("=============================");
         
        Scanner inputPilihan = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        
        System.out.print("Input Pilihan Anda = ");
        pilihan = inputPilihan.nextInt();
        
        if((pilihan <= 0)&&(pilihan >=6)){
            System.out.println("Maaf pilihan yang anda masukan tidak terdaftar!");
            
          }
        
            System.out.print("Input Angka-1 = ");
            angka1 = inputAngka.nextInt();
            System.out.print("Input Angka-2 = ");
            angka2 = inputAngka.nextInt();
            System.out.println("=============================");
            
            switch(pilihan){
            case 1:
                hasil = angka1 + angka2;
                System.out.printf("%d + %d = %d\n",angka1,angka2,hasil);
            break;
            case 2:
                hasil = angka1 - angka2;
                System.out.printf("%d - %d = %d\n", angka1,angka2,hasil);
            break;
            case 3:
                hasil = angka1 * angka2;
                System.out.printf("%d x %d = %d\n", angka1,angka2,hasil);
            break;
            case 4:
                hasil = angka1 / angka2;
                System.out.printf("%d / %d = %d\n", angka1,angka2,hasil);
            break;
            case 5:
                hasil = angka1 % angka2;
                System.out.printf("%d %% %d = %d\n", angka1,angka2,hasil);
            break;
            default:
                System.out.println("Maaf Pilihan anda tidak sesuai dengan daftar!");
            break;
            }  
    }
}
