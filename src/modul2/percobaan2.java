package modul2;

import java.util.Scanner;
public class percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //membuat objek dari class methodx
        methodx mt = new methodx();
        System.out.println("==== PROGRAM MENGHITUNG VOLUME BANGUNAN ===");
        //input diameter dan tinggi (sekali saja)
        System.out.println("Masukkan Diameter\t: ");
        double d = input.nextDouble();
        System.out.println("Masukkan Tinggi\t: ");
        double t = input.nextDouble();
        
        //memanggil semua method volume
        double tabung = mt.volume_tabung(d,t);
        double kerucut = mt.volume_kerucut(d,t);
        double bola = mt.volume_bola(d);
        
    }
    
}
