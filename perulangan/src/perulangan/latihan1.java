
package perulangan;

import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan batas awal");
        int awal = sc.nextInt();
        
        System.out.println("masukkan batas akhir");
        int akhir = sc.nextInt();
        
        
        for(int a =awal; a<=akhir;a++) {
            
            if(a%2!=0)
            {
            System.out.println(a+" ");
            }
        }
    }
    
}


