import java.sql.*;
public class ConnectClass {
    private Connection conect;
    
    public ConnectClass(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            
        }catch(Exception e){
            System.out.println("Error : "+e);
            
        }

    }
    
}
