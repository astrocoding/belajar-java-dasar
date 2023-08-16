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
public class GanjilGenap {
    public static void main(String[] args){
        int input;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("===PROGRAM MENENTUKAN BILANGAN GANJIL & GENAP===");
        System.out.print("Masukan Bilangan = ");
        input = masukan.nextInt();
        
        // Menentukan ganjil/genap
        if(input % 2 ==0){
            System.out.printf("Bilangan %d Adalah bilangan Genap !\n", input);
        }else{
            System.out.printf("Bilangan %d Adalah bilangan Ganjil !\n", input);
        }
    }
}
