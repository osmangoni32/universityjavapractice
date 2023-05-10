/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;

import java.net.URL;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static javax.management.Query.value;
import javax.swing.JOptionPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author xahidICE
 */
public class InputController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField nbdt;
    @FXML
    private TextField prof;
    @FXML
    private TextField udpbdd;
    private TextField bgpno;
    private TextField date;
    private TextField place;
    private TextField bgpid;
    private TextField phn;
    private TextField age;
    private TextField weight;
    private TextField bgroup;
    private TextField phone;
    private TextField rid;
    private TextField rcardno;
    private TextField rdate;
    public Button backfrmupd;
    @FXML
    private Button update;
    @FXML
    private Label notification_update;
    

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void getbgp1(ActionEvent event) {
        
                    try 
                    {
                        String url = "jdbc:mysql://localhost:3306/student";
                        String uname = "root";
                        String pass = "";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection(url, uname, pass);
                        Statement st = con.createStatement();
     String sq="INSERT INTO `bgp`(`bgpno`, `bgpid`, `date`, `place`, `name`, `phn`, `age`, `weight`, `bgroup`)"
             + " VALUES (' "+bgpno.getText()+ " '   ,' "+bgpid.getText()+ " ' ,' "+date.getText()+ " ' ,' "+place.getText()+ " ' ,' "+name.getText()+ " ',' "+phn.getText()+ " '   ,' "+age.getText()+ " ' ,' "+weight.getText()+ " ' ,' "+bgroup.getText()+ " ' )";
            st.execute(sq);
            System.out.println("eeeee");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
        
    }
  

    private void getupdate1(ActionEvent event) {
            
                    try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                  Statement st=con.createStatement();
                   
                String sst= id.getText() ;
                   
             String sq="  UPDATE utt SET name='"+name.getText()+ "',bddate='"+udpbdd.getText()+ "',`profession`='"+prof.getText()+ " ' WHERE id='"+sst+" '";
//,bdd=' "+udpbdd.getText()+ " ' ,`profession`='"+prof.getText()+ " ',`bdts`=' "+nbdt.getText()+ " ', WHERE id='"+sst+" '";
          // String sq=" INSERT INTO `udf`(`id`, `name`, `bdd`, `professeion`, `nbdt`)"
             //      + " VALUES (' "+id.getText()+ " '   ,' "+name.getText()+ " ' ,' "+udpbdd.getText()+ " ' ,' "+prof.getText()+ " ' ,' "+nbdt.getText()+ " ' )";
            st.execute(sq);
   
            System.out.println("Update success");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("update error :"+e);
                                                    }
        
    }
    
    
    void getdetails(ActionEvent event) {
        
                       try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
                         ResultSet rs; 
            //String sq="SELECT * FROM `udf` WHERE id='"+id.getText()+" ' ";
            String nmm=id.getText();
            
              String sql="SELECT * FROM utt WHERE id='"+nmm+" ' ";
               System.out.println("yes"+nmm);
            
          rs=  st.executeQuery(sql);
          int c=0;
          while(rs.next()){
               c=c+1;
             
              String nm=rs.getString("name");
              System.out.println("jhdf"+nm);
              name.setText(nm);
                String bdd1=rs.getString("bddate");
              udpbdd.setText(bdd1);
                String pro=rs.getString("profession");
              prof.setText(pro);
                String nbd=rs.getString("bdts");
              nbdt.setText(nbd);     
              
          }
            System.out.println("eehjfjadfee");
             System.out.println("gdghs"+c);
       
         } 
              catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
            }  
    }

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
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in bgp save :"+e);
                                                    }
    }

    private void get_remind_card_issue(ActionEvent event) {
                  try 
                    {
                        String url = "jdbc:mysql://localhost:3306/student";
                        String uname = "root";
                        String pass = "";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection(url, uname, pass);
                        Statement st = con.createStatement();
     String sq="INSERT INTO `remind`(`id`, `cardno`, `date`) VALUES ('"+rid.getText()+"','"+rcardno.getText()+"'   ,'"+rdate.getText()+"')";  
      st.execute(sq);
            System.out.println("success in bgp");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror in bgp :"+e);
                                                    }
    }

    @FXML
    private void getdetails33(ActionEvent event) {
        
                       try 
         {
            String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
                   Statement st=con.createStatement();
                         ResultSet rs; 
            //String sq="SELECT * FROM `udf` WHERE id='"+id.getText()+" ' ";
            String nmm=id.getText();
            
              String sql="SELECT * FROM utt WHERE id='"+nmm+" ' ";
               System.out.println("yes"+nmm);
            
          rs=  st.executeQuery(sql);
          int c=0;
          while(rs.next()){
               c=c+1;
             
              String nm=rs.getString("name");
              System.out.println("jhdf"+nm);
              name.setText(nm);
                String bdd1=rs.getString("bddate");
              udpbdd.setText(bdd1);
                String pro=rs.getString("profession");
              prof.setText(pro);
                String nbd=rs.getString("bdts");
              nbdt.setText(nbd);     
              
          }
            System.out.println("eehjfjadfee");
             System.out.println("gdghs"+c);
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("errror:"+e);
                                                    }
    }

    @FXML
    private void getupdate33(ActionEvent event) {
        
            
                    try 
         {
             String url = "jdbc:mysql://localhost:3306/student";
             String uname = "root";
             String pass = "";
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection(url, uname, pass);
             Statement st = con.createStatement();

     String sst= id.getText() ;
                   
     String sq="  UPDATE utt SET name='"+name.getText()+ "',bddate='"+udpbdd.getText()+ "',`profession`='"+prof.getText()+ "',`bdts`='"+nbdt.getText()+ "' WHERE id='"+id.getText()+"'";//,bdd=' "+udpbdd.getText()+ " ' ,`profession`='"+prof.getText()+ " ',`bdts`=' "+nbdt.getText()+ " ', WHERE id='"+sst+" '";
              st.execute(sq);
   
            System.out.println("Update success");
       
         } catch (  ClassNotFoundException | SQLException e) {
             System.out.println("update error :"+e);
                                                    }
    }

    @FXML
    private void bckfrmupd(ActionEvent event) {
        
        try {
             System.out.println("oh no");
FXMLLoader fl  =new  FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent r1=(Parent) fl.load();
      
        Stage stage=new Stage();
        stage.setScene(new Scene(r1));
        stage.show();
        
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
         // stage.close();
         } catch (Exception e) {
             System.out.println("error"+e);
         }
    }

    

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

    @FXML
    private void Delete(ActionEvent event) {
             try 
         {
             String url = "jdbc:mysql://localhost:3306/student";
             String uname = "root";
             String pass = "";
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection(url, uname, pass);
             Statement st = con.createStatement();

     String idfordelet= id.getText() ;
                   
     String sq=" DELETE FROM utt WHERE utt.`id` = '"+idfordelet+" '";
   //         System.out.println("Update success");
            st.execute(sq);
           
            id.setText("");
            
         
  
       
          
            prof.setText("");
            name.setText("");  udpbdd.setText("");   nbdt.setText("");
            notification_update.setText("Successfully Done ");
         //   TimeUnit.SECONDS.sleep(3);
                //    .Second.sleep(1);
        //notificaton_update.setText("");
         } catch (  ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, ""+e);
    
                                                    }
    }



    



    
}
