
package latihan3;

import java.util.Scanner;


public class latihan3 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         
         System.out.print("masukkan jumlah data yang di input :");
         int jml = sc.nextInt();
         
         int angka[]= new int[jml];
         
         for(int a=0;a<angka.length;a++)
         {
             System.out.print("masukkan data ke "+(a+1)+":");
             angka [a]=sc.nextInt();
         }
         
         System.out.println("tampilkan data");
         for(int c=0;c<angka.length;c++)
         {
         System.out.print(angka[c]+" ");
     }
    
}}
