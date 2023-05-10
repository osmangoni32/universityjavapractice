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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class T1Controller implements Initializable {

    @FXML
    private TextField bgpno;
    @FXML
    private TextField date;
    @FXML
    private TextField name;
    @FXML
    private TextField place;
    @FXML
    private TextField bgpid;
    @FXML
    private TextField phone;
    @FXML
    private TextField age;
    @FXML
    private TextField weight;
    @FXML
    private TextField bgroup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bgp_save(ActionEvent event) {
         try 
                    {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
     String sq="INSERT INTO `bgp`(`bgpno`, `id`, `date`, `place`, `name`,  `age`, `weight`, `phone`,`blood`)"
             + " VALUES ('"+bgpno.getText()+"'   ,'"+bgpid.getText()+"' ,'"+date.getText()+"' ,'"+place.getText()+"','"+name.getText()+"','"+age.getText()+"' ,'"+weight.getText()+"' ,'"+phone.getText()+"','"+bgroup.getText()+"')";
            st.execute(sq);
            System.out.println("success in bgp");
             JOptionPane.showMessageDialog(null, "BGP SAVED");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in bgp save :"+e);
                                                    }
    }

    @FXML
    private void backfrombgp(ActionEvent event) {
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
