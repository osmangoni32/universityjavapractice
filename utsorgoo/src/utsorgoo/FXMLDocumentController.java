/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsorgoo;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author xahidICE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
      @FXML
    private TextField tf1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
         try 
         {
             
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            String ss;
            ss = "INSERT INTO  clt"+ "(NAME,ID,ROLL,SESSION,DEPT,UNIV) "+" VALUES('"+tf1.getText()+"',3,23,13,'ice','pust')";
            st.execute(ss);
            System.out.println("eeeee");
                ResultSet rs ; 
           //String sq="Select NAME from clt '";
               /*   String query="select name from std ";
             rs=st.executeQuery(query);
             while(rs.next())
             {
                  String nm=rs.getString("name");
                 System.out.println(nm);
             }*/

           } catch (Exception e) {
             System.out.println("errror:"+e);
                                                    }
         
               try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("ap1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    
     @FXML
    void form(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("applicationf.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
