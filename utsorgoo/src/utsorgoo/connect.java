/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsorgoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xahidICE
 */
public class connect 
{
     public void cnn() throws SQLException
     {
         try 
         {
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
          ResultSet rs;
           } catch (Exception e) {
             System.out.println("errror:"+e);
                                                    }
      }
}
