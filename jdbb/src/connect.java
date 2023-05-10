/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class connect {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public void conect() {
       
       
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            }
        catch(Exception e){
            System.out.println("error"+e);
    
        }
    }
    public void executeFun(String sql){
        st.execute(sql);
    }

   

}
