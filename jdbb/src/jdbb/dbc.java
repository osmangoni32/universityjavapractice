/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbb;
import java.sql.*;
/**
 *
 * @author xahidICE
 */
public class dbc {
    public static void main(String []args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/student";
       String uname="root";
       String pass="";  
       String query="select name from std ";
       
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,uname,pass);
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery(query);
       while(rs.next()){
       
       String nm=rs.getString("name");
       System.out.println(nm);}
       st.close();
       con.close();
                
    }
    
}
