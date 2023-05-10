/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iimage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 *
 * @author xahidICE
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private ImageView imgv;
    @FXML
    private Button imgc;
    @FXML
    private Button button;
    @FXML
    private Label label;
    private Window primaryStage;
    
      @FXML
    private void imgch(ActionEvent event) {
        try {
            FileChooser fc=new FileChooser();
 File sf=fc.showOpenDialog(primaryStage);
 Image img=new Image(sf.toURI( ).toString( ),200,200,true,true);
 imgv=new ImageView(img);
 imgv.setFitWidth(100);
 imgv.setFitHeight(100);
 imgv.setPreserveRatio(true);
 
 //AnchorPane.setAllignment(imgv, pos.TOP_LEFT);
        } catch (Exception e) {
            System.out.println("hgdf"+e);
        }
 //Layout.setCenter(imgv);
 
    }

 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  
   
}
