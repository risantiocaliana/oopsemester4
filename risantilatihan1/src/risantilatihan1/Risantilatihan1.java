
package risantilatihan1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Risantilatihan1 {

    
    public static void main(String[] args) throws IOException {
       BufferedReader dataku = new BufferedReader (new InputStreamReader(System.in));
       String nama;
       String nim;
       int tinggi;
       
       System.out.print("masukkan nama anda ");
       nama = dataku.readLine();
        System.out.println("nama saya adalah "+nama);
       
       System.out.print("masukkan nim anda ");
       nim = dataku.readLine();
        System.out.println("nim saya adalah "+nim);
       
       System.out.print("masukan tinggi anda ");
       tinggi = Integer.parseInt(dataku.readLine());
       
       System.out.println("tinggi badan saya adalah "+tinggi);
       
       System.out.println("nama saya adalah"+nama+ "dengan nim" +nim+ "dengan tinggi badan "+tinggi);
      
    }
    
}
