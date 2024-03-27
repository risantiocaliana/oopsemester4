
package risantilatihan1;

import javax.swing.JOptionPane;

public class latihan3 {
   public static void main(String[] args)
   { 
       String nama;
       nama = JOptionPane.showInputDialog("masukan nama anda :");
       String pesan = "hai "+nama;
       JOptionPane.showMessageDialog(null, pesan);
   }
}
