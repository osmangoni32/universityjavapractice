/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest1;

import java.sql.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private PasswordField gd;

   
       void ct(ActionEvent event) {

    }
           void send(ActionEvent event) {

    }
    
    void handleButtonAction(ActionEvent event) {
try{
FXMLLoader fxmlLr = new FXMLLoader(getClass().getResource("ap.fxml"));
       
Parent ro = (Parent) fxmlLr.load();
Stage stage = new Stage();
stage.setTitle("this is second ");
stage.setScene(new Scene(ro));  
stage.show();
}
catch(Exception e){
    System.out.println("error"+e);}
    }


    @FXML
    public void ItemNew(ActionEvent Event){
        try{
FXMLLoader fxmlLr = new FXMLLoader(getClass().getResource("ap.fxml"));
       
Parent ro = (Parent) fxmlLr.load();
Stage stage = new Stage();
stage.setTitle("this is second ");
stage.setScene(new Scene(ro));  
stage.show();
}
catch(Exception e){System.out.println("Error : "+e);}
        
    }
    
    @FXML
     public void jahid(ActionEvent Event){
        try{
            
FXMLLoader fxmlLr = new FXMLLoader(getClass().getResource("third.fxml"));
       
Parent ro = (Parent) fxmlLr.load();
Stage stage = new Stage();
stage.setTitle("this is third ");
stage.setScene(new Scene(ro));  
stage.show();
} 
        catch(Exception e){
        System.out.println("Error : "+e);}
  /*      try{
String url="jdbc:mysql://localhost:3306/javadb";
String username="root";
String password="";
Class.forName(com.mysql.jdbc.Driver);
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
String sql="INSERT into my(id,name,gender)values('"+id.getText()+"','"+name.getText()+"','"+gd.getText()+"')";
st.execute(sql);

System.out.println("successfull");
}
catch(Exception e){
    System.out.println("database error : "+e);}
    */    
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void secondwindow(ActionEvent event) {
           try{
            
FXMLLoader fxml = new FXMLLoader(getClass().getResource("second_window.fxml"));
       
Parent ro1 = (Parent) fxml.load();
Stage stage = new Stage();
stage.setTitle("this is second Window ");
stage.setScene(new Scene(ro1));  
stage.show();
} 
        catch(Exception e){
        System.out.println("Second Page loading Error : "+e);}
    }
    
}
