
package apaaja;

import java.util.Scanner;


public class volume {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         hitungkubus hk = new hitungkubus();
         hk.volumekubus(sc);
         
         //System.out.println("masukan sisi ; ");
         int sisi = sc.nextInt();
         //System.out.println("volume kubus adalah : "+(int) (Math.pow(sisi,3)));
         
     }
    
}
class hitungkubus{
    
    String nama,nim; //int
    public void volumekubus(Scanner sc)//yang di bagian int bisa di ganti dengan void
    {
         //Scanner sc = new Scanner(System.in);
         System.out.println("masukan NIM anda ; ");
         nama = sc.nextLine(); //int hasil = sisi*sisi*sisi;
        System.out.println("masukan nama anda:");
        nim = sc.nextLine();
        System.out.println("nama saya adalah "+nama+" dengan nim"+nim);
        
        //return hasil;//ini bisa dihapus kalo tidak menggunakan int
        
    }
}
