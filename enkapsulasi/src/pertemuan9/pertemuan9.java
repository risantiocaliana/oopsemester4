
package pertemuan9;


public class pertemuan9 {

    
    public static void main(String[] args) {
        data mhs = new data();
        mhs.setnama("risanti");
        mhs.setnim ("2201010475");
        
       
        
        System.out.println ("nama : "+mhs.getnama());
        System.out.println ("nim : "+mhs.getnim());
        
        
        
   }           
      
 }
class data
{
    private String nama;
    private String nim;   
    
    public String getnama()
    {
        return this.nama;
    }
    
     public void setnama(String nama)
    {
         this.nama=nama;
    }
     
    
     public String getnim()
     {
         return this.nim;
         
     }
     public void setnim(String nim)
     {
         this.nim=nim;
     }
            
    
}
    

