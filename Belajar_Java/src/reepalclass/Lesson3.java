package reepalclass;

/**
 *
 * @author zaenalalfian
 * @date Saturday, 12-12-2020
 */
public class Lesson3 {
    // Variabel, Assignment dan Deklarasi variabel + Tipe Data Primitif
        int nomor = 1234;
        String nama = "Zaenal Alfian";
        static double desimal; // Deklarasi variabel dan identifier
        static long saham = 10_000_000_000_000L;
        
        // Konstanta
        final double PHI = 13.4; // Deklarasi konstanta
        
    public static void main(String[] args){
        desimal = 15.6; // Identifier dan Assignment nilai masuk kedalam variabel desimal

        System.out.println("Harga Saham = "+saham);
        // Tipe Data Byte
        
        System.out.println("Nilai Max Byte = "+Byte.MAX_VALUE);
        System.out.println("Nilai Min Byte = "+Byte.MIN_VALUE);
        System.out.println("Nilai Bit Byte = "+Byte.SIZE+" Bit");
        System.out.println("Nilai Byte = "+Byte.BYTES+" Byte\n");
        
        // Tipe Data Short
        System.out.println("Nilai Max Short = "+Short.MAX_VALUE);
        System.out.println("Nilai Min Short = "+Short.MIN_VALUE);
        System.out.println("Nilai Bit Short = "+Short.SIZE+" Bit");
        System.out.println("Nilai Short = "+Short.BYTES+" Bytes\n");
        
        // Tipe Data Integer
        System.out.println("Nilai Max Integer = "+Integer.MAX_VALUE);
        System.out.println("Nilai Min Integer = "+Integer.MIN_VALUE);
        System.out.println("Nilai Bit Integer = "+Integer.SIZE+" Bit");
        System.out.println("Nilai Integer = "+Integer.BYTES+" Bytes\n");
        
        // Tipe Data Long
        System.out.println("Nilai Max Long = "+Long.MAX_VALUE);
        System.out.println("Nilai Min Long = "+Long.MIN_VALUE);
        System.out.println("Nilai Bit Long = "+Long.SIZE+" Bit");
        System.out.println("Nilai Long = "+Long.BYTES+" Bytes\n");
        
        // Tipe Data Float
        System.out.println("Nilai Max Float = "+Float.MAX_VALUE);
        System.out.println("Nilai Min Float = "+Float.MIN_VALUE);
        System.out.println("Nilai Bit Float = "+Float.SIZE+" Bit");
        System.out.println("Nilai Float = "+Float.BYTES+" Bytes\n");
        
        // Tipe Data Double
        System.out.println("Nilai Max Double = "+Double.MAX_VALUE);
        System.out.println("Nilai Min Double = "+Double.MIN_VALUE);
        System.out.println("Nilai Bit Double = "+Double.SIZE+" Bit");
        System.out.println("Nilai Double = "+Double.BYTES+" Bytes\n");
        
    }
}
