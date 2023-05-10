package utsoor;

import javafx.print.PrinterJob;

import java.awt.print.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;
import org.controlsfx.control.Notifications;
//import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class SearchController implements Initializable {

    @FXML
    private TableView<modeltablefinal> TABLE1;
    @FXML
    private TableColumn<modeltablefinal, Integer> ID;
    @FXML
    private TableColumn<modeltablefinal, String> NAME;
    private TableColumn<modeltablefinal, String> FATHER;
    @FXML
    private TableColumn<modeltablefinal, String> PHONE;
    @FXML
    private TableColumn<modeltablefinal, String> AGE;
    @FXML
    private TableColumn<modeltablefinal, String> THANA;
    private TableColumn<modeltablefinal, String> DISTRICT;
    private TableColumn<modeltablefinal, String> VILLAGE;
    private ObservableList<modeltablefinal> dat;

    /**
     * Initializes the controller class.
     */
    DbConnectionfinal d;
    @FXML
    private TableColumn<modeltablefinal, String> BLOOD_GROUP;
    @FXML
    private TableColumn<modeltablefinal, String> PROFESSION;
    private TableColumn<modeltablefinal, String> WEIGHT;
    @FXML
    private TextField namewise;

    private TextField villagewise;
    // 
    @FXML
    private TextField idwise;  //   

    @FXML
    private TextField awardwise; //   
    private TextField genderwise;  //   
    private TextField birthdaywise;  //   
    private TextField mid;     //
    private TextField mvi;  // 
    private TextField mdis;  //   
    @FXML
    private TextField agewise;// 
    @FXML
    private TextField bloodgroup; //   
    private TextField nidwise;     //
    @FXML
    private Label jss;
    private Stage stage;
    @FXML
    private TextField thana;
    @FXML
    private TextField mdi;
    @FXML
    private TextField mth;
    @FXML
    private TextField mbg;
    @FXML
    private TextField eligible_blood_donor;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        d = new DbConnectionfinal();
    }

    @FXML
    private void showtable(ActionEvent event) {

        try {

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt");
// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                //System.out.println("no problem in starting rs");
     dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
        //prepare value factory must be same with

        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
  //      FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));
        //  PHONE.setCellValueFactory(new PropertyValueFactory<>("nname"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
      //  DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        //VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);

    }

    @FXML
    private void namewise(ActionEvent event) {
        

        try {

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();
            String name = namewise.getText();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE name='" + name + "'");

          
            while (rs.next()) {
                //System.out.println("no problem in starting rs");
     dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
        //prepare value factory must be same with

        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
  //      FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));
        //  PHONE.setCellValueFactory(new PropertyValueFactory<>("nname"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
      //  DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        //VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

  @FXML
 
    private void idwise(ActionEvent event) {
      
        try {

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();
            String id = idwise.getText();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE id='" + id + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

        //    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt");
// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                //System.out.println("no problem in starting rs");
     dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
        //prepare value factory must be same with

        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
  //      FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));
        //  PHONE.setCellValueFactory(new PropertyValueFactory<>("nname"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
      //  DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        //VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void awardwise(ActionEvent event) {
                 
        try {

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();
           String award = awardwise.getText();
                  ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE bdts='" + award + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

        //    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt");
// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");
            //  String awardtime=
            while (rs.next()) {
              //System.out.println("no problem in starting rs");
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));
String nam=rs.getString("name");
 //    CertificateController.print_certificatee(nam,award);
            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
         ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);

    }

 

    private void birthdaywise(ActionEvent event) {
        try {
            String birthday = birthdaywise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE bdate='" +birthday + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
   dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
       
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void agewise(ActionEvent event) {
        try {
            String age1 = agewise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE age='" +age1+ "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
   dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
       ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }
/*
    private void mastersearch(ActionEvent event) {
        try {
            String mi = mid.getText();
            String mv = mvi.getText();
            String mdiss = mdis.getText();
            //String mg=mgen.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE village='" + mv + "' and id='" + mi + "' and district='" + mdiss + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
   dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }
            System.out.println("jhgf");
        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);

        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    private void nidwise(ActionEvent event) {
        try {
            String nid = nidwise.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE nid='" + nid + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
  dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
        WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);

    }
*/
    @FXML
    private void bloadgroup(ActionEvent event) {
        try {
            String blood = bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {

  dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void BIRTHDAY(ActionEvent event) {
        try {
            //String blood = bloodgroup.getText();

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

                   
                }

            }

        } catch (Exception e) {
            System.out.println("BIRTH DAY TABLE :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);

    }

    @FXML
    private void ENABLE(ActionEvent event) {

        try {
           // String blood = bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                DbConnectionfinal dc;
                String[] faruk = new String[10];
                String[] osman = new String[10];

                int j, k, l = -1, m, z = -1;
                int i = -1;
                String[] name = new String[100];
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
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

                  //  name[++z] = rs.getString("name");
                    /*    Notifications.create()
                         .title("BIRTHDAY")
                         .text("HAPPY BIRTHDAY  " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i))
                         .show();*/
                }

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        //FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       // WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
       // DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

       // VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);

    }

    @FXML
    private void getprinter(ActionEvent event) { 
        pageSetup(TABLE1, stage);
        
    }
     private void pageSetup(Node node, Stage owner) 
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

// private void print(Node node) 
//    {
//        // Define the Job Status Message
//    //    jss.textProperty().unbind();
//      //  jss.setText("Creating a printer job...");
//         
//        // Create a printer job for the default printer
//        PrinterJob job = PrinterJob.createPrinterJob();
//         
//     //   if (job != null) 
//       // {
//            // Show the printer job status
//                                    //    jss.textProperty().bind(job.jobStatusProperty().asString());
//             
//            // Print the node
//            boolean printed = job.printPage(node);
// 
//         //   if (printed) 
//           // {
//                // End the printer job
//                job.endJob();
//           // } 
////            else
////            {
////                // Write Error Message
////                jss.textProperty().unbind();
////               jss.setText("Printing failed.");
////            }
//        //} 
//       // else
//       // {
//            // Write Error Message
//     //      jss.setText("Could not create a printer job.");
//       // }
//    } 
//

    private void gettest_mail(ActionEvent event) {
        
           try {
            String blood = bloodgroup.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt"); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                DbConnectionfinal dc;
            //   JOptionPane.showMessageDialog(null, "  "+rs.getString("thana"));

              System.out.println(" "+rs.getString("thana"));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
    
    
    
    }

    @FXML
    private void BACKFRMSRCH(ActionEvent event) {
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

    @FXML
    private void thana(ActionEvent event) {
        try {

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();
            String than = thana.getText();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE thana='" + than + "'");

          
            while (rs.next()) {
                //System.out.println("no problem in starting rs");
     dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN  searchcontroller five TABLE  :  " + e);
        }
        //prepare value factory must be same with

        ID.setCellValueFactory(new PropertyValueFactory<>("id"));
//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
  //      FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
    //    WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));
        //  PHONE.setCellValueFactory(new PropertyValueFactory<>("nname"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
      //  DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

        //VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
        
    }

    @FXML
    private void mastersearch(ActionEvent event) {
         try {
            String md = mdi.getText();
            String mt = mth.getText();
            String mbgg = mbg.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();
             ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE district='" +md+ "' or thana='" +mt+ "' and bgroup='" +mbgg+ "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");
           //and thana='" +mt+ "'
          //  ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE age='" +age1+ "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
   dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
       ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       
        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
        
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }

    @FXML
    private void eligible_blood(ActionEvent event) {
         try {
           String ebg = eligible_blood_donor.getText();

            Connection conn = d.con();

            dat = FXCollections.observableArrayList();

            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM utt WHERE bgroup='" +ebg+ "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                DbConnectionfinal dc;
                String[] faruk = new String[10];
                String[] osman = new String[10];

                int j, k, l = -1, m, z = -1;
                int i = -1;
                String[] name = new String[100];
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
    dat.add(new modeltablefinal(rs.getInt("id"), rs.getString("name"), rs.getString("pphone"), rs.getString("bgroup") ,rs.getString("age"), rs.getString("thana"), rs.getString("profession")));

                  //  name[++z] = rs.getString("name");
                    /*    Notifications.create()
                         .title("BIRTHDAY")
                         .text("HAPPY BIRTHDAY  " + name[z])
                         .graphic(null).darkStyle()
                         .hideAfter(Duration.seconds(i))
                         .show();*/
                }

            }

        } catch (Exception e) {
            System.out.println("Loading ERROR IN five TABLE  :  " + e);
        }
        ID.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from main database colum id
        NAME.setCellValueFactory(new PropertyValueFactory<>("name"));
        //FATHER.setCellValueFactory(new PropertyValueFactory<>("fname"));
        PHONE.setCellValueFactory(new PropertyValueFactory<>("pphone"));
        BLOOD_GROUP.setCellValueFactory(new PropertyValueFactory<>("bgroup"));

        AGE.setCellValueFactory(new PropertyValueFactory<>("age"));
       // WEIGHT.setCellValueFactory(new PropertyValueFactory<>("weight"));

        THANA.setCellValueFactory(new PropertyValueFactory<>("thana"));
       // DISTRICT.setCellValueFactory(new PropertyValueFactory<>("district"));

       // VILLAGE.setCellValueFactory(new PropertyValueFactory<>("village"));
        PROFESSION.setCellValueFactory(new PropertyValueFactory<>("profession"));
        // TABLE.setItems(null);//screan builder ar table identifier
        TABLE1.setItems(dat);
    }
    
}
