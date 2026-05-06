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
        } catch (Exception e) {
            //jika input salah
            JOptionPane.showMessageDialog(null,"Input Harus Berupa Angka!","Error",0 );
        } 
        
    }
}
