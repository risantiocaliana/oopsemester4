
package uts.oop;

import java.util.Scanner;

public class TampilAngka {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah indeks array: ");
        int size = sc.nextInt();
        
        int[] dataArray = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan data ke-" + (i+1)+ ": ");
            dataArray[i] = sc.nextInt();
        }
        
        System.out.print("Tampilan angka yang diinput: ");
        for (int i = 0; i < size; i++) {
            System.out.print(dataArray[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        
        sc.close();
    }
     
    
}
