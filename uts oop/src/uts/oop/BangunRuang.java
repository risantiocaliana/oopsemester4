package uts.oop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BangunRuang {

    public static void main(String[] args)throws IOException {
       BufferedReader dataku = new BufferedReader (new InputStreamReader(System.in)); 
 
    int panjang;
    int tinggi;
    int lebar;
    
    System.out.print("masukkan nilai panjang :");
    panjang = Integer.parseInt(dataku.readLine());
        
       
   
    System.out.print("masukan nilai tinggi  :");
    tinggi = Integer.parseInt(dataku.readLine());
    
    System.out.print("masukan nilai lebar  :");
    lebar = Integer.parseInt(dataku.readLine());
    
    
    
    System.out.print("volume bangun kubus :" +panjang * +tinggi * lebar );

    }
    
}
class Balok extends BangunRuang {
    private final double panjang;
    private final double lebar;
    private final double tinggi;
    
    Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
    }
    double hitungVolume(){
        return panjang * lebar * tinggi ;
        
    }
    double hitungVolume(double sisi){
        return sisi * sisi * sisi;
    }
    
}

