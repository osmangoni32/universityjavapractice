/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CertificateController implements Initializable {

  private Stage stage;
  @FXML
    private Label jss;
    
    DbConnectionfinal d;
  @FXML
    private TextField singleprintid;
  @FXML
    private AnchorPane certificatepane;
  @FXML
    private Label uhh;
    private TextField blood_times;
  @FXML
    private Label date;
  @FXML
    private TextField blood;
  @FXML
    private Label blood_time;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          d = new DbConnectionfinal();
    }    
/*public static void passvalue(String name_from_program, String value_from_program ) {
        // TODO
      String namme=""+name_from_program;
       String valuee=""+value_from_program; 
    getname.setText(namme);
   get_donate_time.setText(namme);
   
   
        
    }  */  

  @FXML
    private void print_certificate(ActionEvent event) {
       
         try {

        Connection conn = d.con();

            String  bloods= blood.getText();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE bdts='" +bloods+ "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

         
         
  
            while (rs.next()) {
          String namme= rs.getString("name");
          String blood_donate_times= rs.getString("bdts");
          uhh.setText(namme);
          blood_time.setText(blood_donate_times);
          
          Date localdate = new Date();
          
          SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
           String date1 = sdf.format(localdate);//date to string=format
            date.setText(date1);
            
         pageSetup(certificatepane, stage);
            } 
    
        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
       
    }
  

  @FXML
    private void singleprint(ActionEvent event) {
         try {

        Connection conn = d.con();

            String id = singleprintid.getText();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE id='" +id + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

         
         
         
         
         
        
            while (rs.next()) {
                //System.out.println("no problem in starting rs");
          // String[] osman =new String[30];
          String namme= rs.getString("name");
          String blood_donate_times= rs.getString("bdts");
          uhh.setText(namme);
          blood_time.setText(blood_donate_times);
          
          Date localdate = new Date();
          
          SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                //Date d2 = sdf.parse(faruk[i]);
                String date1 = sdf.format(localdate);//date to string=format
               date.setText(date1);
         pageSetup(certificatepane, stage);
            } 
    
        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
    }
       private  void pageSetup(Node node, Stage owner) 
    {
        // Create the PrinterJob
        PrinterJob job = PrinterJob.createPrinterJob();
         
        if (job == null) 
        {
            return;
        }
         
        // Show the page setup dialog
        boolean proceed = job.showPageSetupDialog(owner);
         
        if (proceed) 
        {
            print(job, node);
        }
    }
     
    private void print(PrinterJob job, Node node) 
    {
        // Set the Job Status Message
        jss.textProperty().bind(job.jobStatusProperty().asString());
         
        // Print the node
        boolean printed = job.printPage(node);
     
        if (printed) 
        {
            job.endJob();
        }
    }

  @FXML
    private void backfromcertificate(ActionEvent event) {
         try {
             System.out.println("working back button");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        ((Stage)(((Node)event.getSource()).getScene().getWindow())).close();
      //  this.close();
         // stage.close();
//          Stage stag = (Stage) Close.getScene().getWindow();
//   stag.close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void BACKFRMHOME(ActionEvent event) {
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
