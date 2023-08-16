package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date Saturday, 12-12-2020
 */
public class Lesson1 { // Ini merupakan Class
    
    public static void main(String[] args){ // Ini merupakan Method
        System.out.println("Hello, Minna!!"); // Ini merupakan Statement (Statement pasti diakhiri ;)
        System.out.print("Ini statement ke-2\n");
        System.out.printf("Baris Ke-%d : Hello, Minna!!\n", 1);
        System.out.printf("Baris Ke-%d : Oogenki desu ka?", 2);
        
        int x = 1; // Ini merupakan variabel
        while(x <= 10){ // Ini merupakan perulangan (while loop)
            System.out.printf("Baris Ke-%d\n",x);
            x++;
        }
    }
}
