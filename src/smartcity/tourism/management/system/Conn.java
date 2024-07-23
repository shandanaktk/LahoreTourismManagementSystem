package smartcity.tourism.management.system;
import java.sql.*;

public class Conn {
    
       Connection c;
       Statement s;
       
        Conn()  {
            try{  
            Class.forName("com.mysql.jdbc.Driver");  
              c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "codeforinterview" ); 
           
            s =c.createStatement();  
//            
           
        }catch(Exception e){ 
            e.printStackTrace();
        }  
    }  
}
    
