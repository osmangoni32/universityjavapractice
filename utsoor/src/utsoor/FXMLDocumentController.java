/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
//improt javafx.scene.control.MenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    


    private TextField nm;

    private TextField nnm;

    private TextField pro;

    private TextField id;

    private TextField fnm;

    private TextField mnm;

    private TextField rid;

    private TextField rpn;





    private TextField nid;
    @FXML
    private AnchorPane mainAnchorPane;


  
    void IMGCHOOSER(ActionEvent event){
        
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
            
                 String sq= " INSERT INTO ut"
              + "(id, type, name, nname, profession, fname, mname, rname, rphone,nid )"
              + " VALUES (' "+id.getText()+ " ',' null ',' "+nm.getText()+ " ',' "+nnm.getText()+ " ',' "+pro.getText()+ " ',' "+fnm.getText()+ " ',' "+mnm.getText()+ " ',' "+rid.getText()+ " ',' "+rpn.getText()+ " ',' "+nid.getText()+ " ')"; 
            st.execute(sq);
            System.out.println("eeeee");
        //,' "+nid.getText()+ " ','null','  ','null','nul',' "+bg.getText()+ " ',' "+bp.getText()+ " ',' "+age.getText()+ " ',' "+wei.getText()+ " ',' "+ppn.getText()+ " ',' "+fb.getText()+ " ',' "+hpn.getText()+ " ',' "+re.getText()+ " ',' "+eml.getText()+ " ',' "+on.getText()+ " ',' "+vill.getText()+ " ',' "+dg.getText()+ " ',' "+th.getText()+ " ',' "+di.getText()+ " ',' "+div.getText()+ " ',' "+pa.getText()+ " ',' null','null',  ' null ',  ' null ',' "+bdn.getText()+ " '
      //, nid,  nationality, religion, sex, bgroup, bpressure, age, weight, pphone, facebook, hphone, relation, email, woard, vilage, post, thana, district, division, paddress, isaddicted, isinterested, cause, socialwork, number
         
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
         
            
     } 

    
   
    
    
    
    
    
    
 
   /* 
    void getinputf(ActionEvent event) {
          try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("applicationf_1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }


    }

    */
   /*
      void toggle(ActionEvent event) {
String type="";
if(mem.isSelected()){
    type +=mem.getText();
}
if(org.isSelected()){
    type +=org.getText();
}
if(don.isSelected()){
    type +=don.getText();
}

   String addiction="";
if(a_y.isSelected()){
    addiction +=a_y.getText();
}
if(a_n.isSelected()){
  addiction +=a_n.getText();
}
if(a_i.isSelected()){
   addiction +=a_i.getText();
}
          System.out.println(addiction);
          
          
   String blood="";
if(b_y.isSelected()){
   blood +=b_y.getText();
}
if(b_n.isSelected()){
blood +=b_n.getText();
}
if(b_i.isSelected()){
   blood +=b_i.getText();
}
          System.out.println(blood);         
System.out.println(type);


                  String rel="";
if(ri.isSelected()){
 rel+=ri.getText();
}
if(rh.isSelected()){
rel+=rh.getText();
}
if(ro.isSelected()){
rel +=ro.getText();
}
          System.out.println(rel);   
          
          
           String nat="";
if(nb.isSelected()){
nat+=nb.getText();
}
if(nf.isSelected()){
nat+=nf.getText();
}
 System.out.println(nat);   
 
 
 String sex="";
if(sm.isSelected()){
sex+=sm.getText();
}
if(sf.isSelected()){
sex+=sf.getText();
}
 System.out.println(sex);   
    }
*/

    //end of input form
  
   
    
    //report
    void getreport(ActionEvent event) {
         try {
           
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("report1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        // ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }

    }
    //search
    
    //input
    void getbgp(ActionEvent event) {
         try {
             //  ((Stage)(((Node)event.getSource()).getScene().getWindow())).close();
             System.out.println("this is working on bgp");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("bgp.fxml"));
        Parent r1=(Parent) fl.load();
   
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
      
         } catch (Exception e) {
             System.out.println("error in cuting in the menu item "+e);
         }

    }
    
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
/*
    private void getreportlot(ActionEvent event) {
           try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("Remind_card_reg.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    
    }

    private void getaplot(ActionEvent event) {
          try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("application_lot_reg.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void getvoulot(ActionEvent event) {
          try {
   
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("Vouchar_reg.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void saveinput(ActionEvent event) {
    }

*/
  
    

    

  /*  private void GETNEWAPPLICATIONJ(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("applicationf_1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void saveinput(ActionEvent event) {
    }
*/
/////start
    @FXML
    private void getnewapplication(ActionEvent event) {
          try {
             System.out.println("yes the fatching new application page is working");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("app11.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        // ((Stage)(((MenuBar)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error IN :"+e);
         }
    }

    @FXML
    private void getreport2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("REPORT1.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
      //   ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getsms2(ActionEvent event) {
          try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("SMS.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
       // Platform.exit();
        
        // ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getsearch2(ActionEvent event) {
          try {
           
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("search.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        ((Stage)(((MenuBar)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void getfile2(ActionEvent event) {
          try {
            // System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("application_lot_reg.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    @FXML
    private void getupdate2(ActionEvent event) {
           try {
           
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("update.fxml"));
 Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        
         } catch (Exception e) {
             System.out.println("error in update"+e);
         }
    }

    @FXML
    private void getbgp2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("bgp.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    private void getremindcardissue2(ActionEvent event) {
         try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("Reminder_card_issue.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
       //  ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }
    
      void GETINPUTSAVE(ActionEvent event) {

    }

    @FXML
    private void table_new(ActionEvent event) {
      try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("certificate.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("TABLE _NEW"+e);
         }
    }

    @FXML
    private void getNewFlie(ActionEvent event) {
        try {
              Stage tage=new Stage();
             
             System.out.println("working on home");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("homee.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         tage.close();
         } catch (Exception e) {
             System.out.println("working on home :"+e);
         }
    }

    private void getNewFlie(Event event) {
         try {
             
             System.out.println("working on home");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("certificate.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
         } catch (Exception e) {
             System.out.println("working on home :"+e);
         }
    }

    @FXML
    private void calling_website(ActionEvent event) {
    try {
         
        Desktop.getDesktop().browse(new URI("http://osman32.epizy.com/"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }
    
    
}
