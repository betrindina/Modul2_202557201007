package modul2;
/*
Class ini berisi semua method (volume & luas)
Akan dipanggil oleh file lain (percobaan2 & percobaan3)
*/
public class methodx {
    //=== METHOD VOLUME ===
    //Method menghitung volume tabung
    double volume_tabung (double d, double t) {
    double r = d / 2;       //jari2
    return Math.PI * r * r * t;
}
    //Method menghitung volume kerucut
    double volume_kerucut (double d, double t){
        double r = d / 2;
        return (1.0 / 3) * Math.PI * r * r * t;
    }
    //Method menghitung volume bola
    double volume_bola(double d){
        double r = d / 2;
        return(4.0 / 3) * Math.PI * r * r * r;
    }
    //=== METHOD LUAS ===
    //Method luas persegi panjang
    double luas_persegi_panjang(double p, double l){
    return p * l;
}
    //Method luas segitiga
    double segitiga (double a, double t){
        return 0.5 * a * t;
    }
    //Method luas lingkaran
    double lingkaran ( double d ){
        double r = d / 2;
        return Math.PI * r * r;
    }
    }
    

