
package latihansegitiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihansegitiga {

    public static void main(String[] args)throws IOException {
       BufferedReader dataku = new BufferedReader (new InputStreamReader(System.in)); 
 
    int alas;
    int tinggi;
    
    System.out.print("masukkan nilai alas :");
    alas = Integer.parseInt(dataku.readLine());
        
       
   
    System.out.print("masukan nilai tinggi  :");
    tinggi = Integer.parseInt(dataku.readLine());
    
    System.out.print("luas alas segitiga:" +tinggi * alas );

    }
    
}
