
package latihan2;

import java.util.Scanner;


public class latihan {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        persegi pg = new persegi();
        
        System.out.println ("masukkan sisi : ");
        pg.setsisi(sc.nextInt());
        int luas= pg.getsisi()*pg.getsisi();
        System.out.println ("luas persegi adalah : "+luas);
        int keliling= pg.getsisi()*4;      
        //pg.getsisi();//
        System.out.println ("keliling persegi adalah : "+keliling);

        
        
        
        
   }           
      
 }
class persegi
{
    private int sisi;  
    
    public int getsisi()
    {
        return this.sisi;
    }
    
     public void setsisi (int sisi)
    {
         this.sisi=sisi;
         
    }
         

    }
    
     
        
    
    

    

