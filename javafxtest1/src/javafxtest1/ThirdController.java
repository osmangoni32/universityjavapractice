/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ThirdController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    void ok(ActionEvent event) {
System.out.println("page button is working");
       try{
            
FXMLLoader fxmlLr = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
       
Parent ro = (Parent) fxmlLr.load();
Stage stage = new Stage();
stage.setTitle("this is homepage ");
stage.setScene(new Scene(ro));  
stage.show();
} 
        catch(Exception e){
        System.out.println("Error : "+e);}
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}