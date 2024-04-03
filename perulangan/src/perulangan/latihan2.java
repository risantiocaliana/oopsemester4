package perulangan;

import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan batas awal");
        int awal = sc.nextInt();
        
        System.out.println("masukkan batas akhir");
        int akhir = sc.nextInt();
        
        
        int a =awal; 
        
        while(a<=akhir) {
            
            if(a%2!=0)
            {
            System.out.println(a);
            } 
            a++;
        }
    }
    
}
