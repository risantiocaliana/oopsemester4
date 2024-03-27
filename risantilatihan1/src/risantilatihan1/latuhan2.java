
package risantilatihan1;
import java.util.Scanner;


public class latuhan2 {
    public static void main(String[] args)
    {
    Scanner dataku = new Scanner (System.in);
    
    String nama;
    String nim;
    int tinggi;
    int segitiga;
    
    System.out.print("masukkan nama anda :");
    nama = dataku.nextLine();
        
       
    System.out.print("masukkan nim anda :");
    nim = dataku.nextLine();

    System.out.print("masukan tinggi anda :");
    tinggi = dataku.nextInt();
    
    System.out.print("masukan nilai segitiga anda :");
    tinggi = dataku.nextInt();
    
    

       
       System.out.println("nama saya adalah"+nama+ "dengan nim" +nim+ "dengan tinggi badan "+tinggi);
    }
}
