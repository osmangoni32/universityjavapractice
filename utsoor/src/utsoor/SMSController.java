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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;
import org.controlsfx.control.Notifications;


public class SMSController implements Initializable {
 DbConnectionfinal d ;
    @FXML
    private TextField get_text;
  private ObservableList<modeltablefinal> dat;
    @FXML
    private TextField dbtext;
    @FXML
    private TextField dbid;
    @FXML
    private TextField individual_id_message;
    @FXML
    private TextField general_message;
    @FXML
    private TextField individual_id;
    @FXML
    private TextField enable_notification;
    @FXML
    private TextField bgp_id_name;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     d =new DbConnectionfinal();
        // TODO
    }    

    @FXML
    private void getmail(ActionEvent event) throws Exception {
       
             try {
            String BText = get_text.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                DbConnectionfinal dc;
                String[] faruk = new String[100];
                String[] osman = new String[100];

                int j, k, l = -1, m, z = -1;
                int i = -1,e=-1;
                String[] name = new String[100];
                String[] EMAIL = new String[100];
                Date[] date = new Date[10];
                SimpleDateFormat mdy = new SimpleDateFormat("MM/dd/yyyy");

                osman[++l] = rs.getString("bdate");
                                                                                         //  System.out.print(""+rs.getString("bdate"));
                Date fulldate = mdy.parse(osman[l]);

                faruk[++i] = rs.getString("bdate");
                                                                                        // System.out.println("print"+date[i]);

                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
                Date d2 = sdf.parse(faruk[i]);
                String date1 = sdf.format(d2);//date to string=format

                Date localdate = new Date();
                                 Date localdatee = new Date();

                long ms = System.currentTimeMillis() - fulldate.getTime();
                long age = (long) ((long) ms / (1000 * 60 * 60 * 24));
                            System.out.println("jhfdv:" + age);

                String date3 = sdf.format(localdate);
                if (date1.equals(date3)) {
                   dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

                    name[++z] = rs.getString("name");
                    EMAIL[++e] = rs.getString("email"); 
                     javamailcustomized.sendMail(name[z],EMAIL[e],BText);
                    get_text.setText("Email sent succesfully");
                  
                }

            }

        } catch (Exception e) {
            System.out.println("BIRTH DAY TABLE :  " + e);
        }
    }

    @FXML
    private void Afterdonateblood(ActionEvent event) {
        
         try {
            String id = dbid.getText();
            String BText = dbtext.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE id='" + id + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                   
                    
                  String  name = rs.getString("name");
                  String  EMAIL = rs.getString("email"); 
                  javamailcustomized.sendMail(name,EMAIL,BText);
                dbtext.setText("Email sent succesfully"); 
                  
                
            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e); 
        
        
    }

   

   
    }

    @FXML
    private void get_general_message(ActionEvent event) throws Exception {
            String BText =general_message.getText();
           javaMailUtil.sendMail(BText);
            general_message.setText("Email sent succesfully");
           
        
    }

    @FXML
    private void get_individual(ActionEvent event) { try {
            String id = individual_id.getText();
            String BText = individual_id_message.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE id='" + id + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                     
                    
                   String  name = rs.getString("name");
                  String  EMAIL = rs.getString("email"); 
                     javamailcustomized.sendMail(name,EMAIL,BText);
                     individual_id_message.setText("Email sent succesfully");
                     
                
            }

        }   catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e); 
        
        
    }
    }

    @FXML
    private void get_enablel(ActionEvent event) {
          try {
        //    String blood = bloodgroup.getText();
            String BText = enable_notification.getText();
            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt");
            while (rs.next()) {
                DbConnectionfinal dc;
                String[] faruk = new String[10];
                String[] osman = new String[10];

                int j, k, l = -1, m, z = -1;
                int i = -1;
              //  String[] name = new String[100];
                Date[] date = new Date[100];
                SimpleDateFormat mdy = new SimpleDateFormat("MM/dd/yyyy");

                osman[++l] = rs.getString("bdate");
                Date fulldate = mdy.parse(osman[l]);

                faruk[++i] = rs.getString("bdate");
                // System.out.println("print"+date[i]);

                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
                Date d2 = sdf.parse(faruk[i]);
                String date1 = sdf.format(d2);//date to string=format

                Date localdate = new Date();
                Date localdatee = new Date();

                long ms = System.currentTimeMillis() - fulldate.getTime();
                long age = (long) ((long) ms / (1000 * 60 * 60 * 24));

                System.out.println("jhfdv:" + age);

                String date3 = sdf.format(localdate);
                //     String comaparedate=DAY.getText();
                if (age >= 120) {
                                     
                  String  name = rs.getString("name");
                  String  EMAIL = rs.getString("email"); 
                  javamailcustomized.sendMail(name,EMAIL,BText);
                  enable_notification.setText("Email sent succesfully");
                
                }

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
    }

    @FXML
    private void get_bgp(ActionEvent event) throws Exception {
        String bgp_database=""+bgp_id_name.getText();
                   bgp_mail.sendMail(bgp_database);
                   bgp_id_name.setText("Email sent succesfully");
    }

    @FXML
    private void backfrommail(ActionEvent event) {
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
//osman.ice.32@gmail.com