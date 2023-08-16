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
public class SegitigaBintang {
    public static void main(String[] args){
        int x,y,z,a;
        
        for(x=1;x<=5;x++){
            System.out.println("");
            for(y=1;y<=x;y++){
                System.out.print(" * ");
            }
        }
        
        for(x=5;x>=1;x--){
            System.out.println("");
            for(y=1;y<=x;y++){
                System.out.print(" * ");
            }
        }
        System.out.println("\n===================");
        
        for(x=1;x<=6;x++){
            for(y=5;y>=x;y--){
                System.out.print(" ");
            }
            for(z=1;z<=x;z++){
                System.out.print("*"); // Kasih spasi disalah satu sisi akan menjadi segitiga sama kaki
            }
            System.out.println();
        }
        
        System.out.println("=====================");
        for(x=1;x<=6;x++){
            for(y=5;y>=x;y--){
                System.out.print(" ");
            }
            for(z=1;z<=x;z++){
                System.out.print(z+" "); // Kasih spasi disalah satu sisi akan menjadi segitiga sama kaki
            }
            System.out.println();
        }
        System.out.println("=====================");
        for(x = 1;x <= 5;x++){
            for(y = 5;y >= x;y--){
                System.out.print(" ");
            }
            for(z = 1;z <= x;z++){
                System.out.print(z);
            }
            for(a = 1; a <= x - 1;a++){ // Min 1 ini untuk mengurangi satu baris perulangan
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
