package modul2;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
public class percobaan3 {
    public static void main(String[] args) {
        methodx mt = new methodx();
        try {
            //JUDUL PROGRAM
            JOptionPane.showMessageDialog(null,
                    "MENGHITUNG :\n"
                    + "- Persegi Panjang\n"
                    + "- Segitiga\n"
                    + "- Lingkaran", "MENGHITUNG LUAS BANGUN DATAR\n", 1);
            //input dari user
            double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Panjang : ", "PERSEGI PANJANG\n", 3));
            double l = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Lebar : ", "PERSEGI PANJANG\n", 3));
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Alas :", "SEGITIGA\n", 3));
            double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Tinggi : ", "SEGITIGA\n", 3));
            double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Diameter : ", "LINGKARAN\n", 3));
            //memanggil method
            double luas_pp = mt.luas_persegi_panjang (p,l);
            double luas_sg = mt.segitiga (a,t);
            double luas_lk = mt.lingkaran(d);
            //output
            String hasil = "Luas Persegi Panjang\t= " + luas_pp +"\n"
                    + "Luas Segitiga\t= " + luas_sg + "\n"
                    + "Luas Lingkaran\t= " + luas_lk ;
            JOptionPane.showMessageDialog(null, hasil, "HASIL PERHITUNGAN\n",1);
            //output juga ke console
            System.out.println("==== MENGHITUNG LUAS BANGUN DATAR ====");
            System.out.println("Panjang Persegi Panjang\t= " + p);
            System.out.println("Lebar Persegi Panjang\t= " + l);
            System.out.println("Alas Segitiga\t= " + a);
            System.out.println("Tinggi Segitiga\t= " + t);
            System.out.println("Diameter Lingkaran\t= " + d);
            System.out.println("\n==== H.A.S.I.L  P.E.R.H.I.T.U.N.G.A.N ====");
            System.out.println(hasil);
        } catch (Exception e) {
            //jika input salah
            JOptionPane.showMessageDialog(null,"Input Harus Berupa Angka","Error",0);
        } 
        
    }
}
