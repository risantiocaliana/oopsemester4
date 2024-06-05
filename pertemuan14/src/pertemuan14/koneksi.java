package pertemuan14;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class koneksi {
 public static Connection con;
 public static Statement stm;
public static Connection configDB()throws SQLException{
 try {
 String url
="jdbc:mysql://localhost/mahasiwa";
 String user="root";
 String pass="";
 Class.forName("com.mysql.cj.jdbc.Driver");
 con =(Connection)
DriverManager.getConnection(url,user,pass);
 stm = con.createStatement();
 System.out.println("koneksi berhasil;");
 } catch (Exception e) {
 System.err.println("koneksi gagal"
+e.getMessage());
 }
 return con;
 }


}