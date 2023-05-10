package javafxtest1;
//import java.util.loggin.Level;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
public Connection connect(){/*
          try{
String url="jdbc:mysql://localhost:3306/javadb";
String username="root";
String password="";

Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection(url,username,password);

System.out.println("successfull");
}
catch(Exception e){
    System.out.println("database error : "+e);}
return null; */
       try {
            //Your database url string,ensure it is correct
            String url = "jdbc:mysql://localhost:3306/javadb";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
}
}