/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class App11Controller implements Initializable {

    @FXML
    private TextField name;
    private TextField nname;
    @FXML
    private TextField profession;
    @FXML
    private TextField id;
    @FXML
    private TextField fname;
    private TextField mname;
    private TextField rname;
    private TextField rphone;
    @FXML
    private TextField bgroup;
    @FXML
    private TextField bpressure;
    @FXML
    private TextField age;
    private TextField weight;
    @FXML
    private TextField pphone;
    @FXML
    private TextField email;
    @FXML
    private TextField thana;
    @FXML
    private TextField district;
    private TextField village;
    private TextField nid;
    @FXML
    private TextField bddate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getapp11save(ActionEvent event) {
                   try 
         {
             
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
    /*  String sq=" INSERT INTO `tt`"
                   + "(`id`, `name`, `nname`, `professeion`) "
                   + "VALUES (' "+id.getText()+ "' ,' null',' "+nnm.getText()+ "',' "+pro.getText()+ "')";*/
            
                 String sq= " INSERT INTO utt"
              + "(id,  name,  profession, bdate,bgroup,age,pphone,email,thana,district)"
              + " VALUES ('"+id.getText()+"','"+name.getText()+"',' "+profession.getText()+ " ','"+bddate.getText()+ "','"+bgroup.getText()+ "','"+age.getText()+ "','"+pphone.getText()+ "','"+email.getText()+ "','"+thana.getText()+ "','"+district.getText()+ "')"; 
         
     if(id.getText().equals("") )
        {
            System.out.println("not valid");
            JOptionPane.showMessageDialog(null, "You have to fill red marked field ");
        }    
     else if(name.getText().equals("") )
        {
            System.out.println("not valid");
            JOptionPane.showMessageDialog(null, "You have to fill red marked field ");
        } 
     else if(bddate.getText().equals("") )
        {
            System.out.println("not valid");
            JOptionPane.showMessageDialog(null, "You have to fill red marked field ");
        }  
     else if(email.getText().equals("") )
        {
            System.out.println("not valid");
            JOptionPane.showMessageDialog(null, "You have to fill red marked field ");
        }  
     else if(bgroup.getText().equals("") )
        {
            System.out.println("not valid");
            JOptionPane.showMessageDialog(null, "You have to fill red marked field ");
        }  
        
         else
         {
            st.execute(sq);
            System.out.println("eeeee");
            System.out.println("ok");
            id.setText("");
            name.setText("");
            profession.setText("");
            bddate.setText("");
            bgroup.setText("");
            age.setText("");
            pphone.setText("");
            email.setText("");
            thana.setText("");
            fname.setText("");
            district.setText("");
            bpressure.setText("");
             JOptionPane.showMessageDialog(null, "successfully saved");
             }
        
      
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in save button:"+e);
             JOptionPane.showMessageDialog(null, "Enter the correct ID");
                                                    }
    }

    @FXML
    private void backfromnewapp(ActionEvent event) {
        try {
             System.out.println("working back button");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        ((Stage)         (((Node)                     event.getSource()).getScene().getWindow())).close();
      //  this.close();
         // stage.close();
//          Stage stag = (Stage) Close.getScene().getWindow();
//   stag.close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    
}
