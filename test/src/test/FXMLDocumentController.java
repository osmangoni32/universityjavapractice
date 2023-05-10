/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author xahidICE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
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
    
    
    @FXML
    void oka(ActionEvent event) {
        System.out.println("iya!");

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
