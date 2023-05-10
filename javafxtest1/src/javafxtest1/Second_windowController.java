/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author user
 */
public class Second_windowController implements Initializable {

      

    @FXML
    private void databasesender(ActionEvent event) {
         try{
String url="jdbc:mysql://localhost:3306/javadb";
String username="root";
String password="";

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st=con.createStatement();
String sql="INSERT into my(id,name,gender)values('"+id.getText()+"','"+name.getText()+"','"+gd.getText()+"')";
st.execute(sql);

System.out.println("successfull");
}
catch(Exception e){
    System.out.println("database error : "+e);}
        
    }
    
     @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField gd;
    @FXML
    private TableView<modeltable> table;//where i mada new class
    @FXML
    private TableColumn<modeltable,Integer> columid;
    @FXML
    private TableColumn<modeltable, String> columname;
    @FXML
    private TableColumn<modeltable, String> columgender;
    @FXML
    private Button btnload;
    //initiallaze obervable list to hold our database to data
private ObservableList<modeltable> data;
private DbConnection dc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dc=new DbConnection();
    } 

    @FXML
    private void loadfromdatabase(ActionEvent event) {
       
        try{
           
    Connection conn=dc.connect();
   
    data=FXCollections.observableArrayList();
    ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM my");
    while(rs.next()){
    data.add(new modeltable(rs.getInt(1),rs.getString(2),rs.getString(3)));
  
    }
        }
      catch(Exception e){System.out.println("Loading ERROR :  "+e);}
    //prepare value factory must be same with

  columid.setCellValueFactory(new PropertyValueFactory<>("id"));//here ("id") is the id from modeltable private final IntegerProperty id; 
    
   columname.setCellValueFactory(new PropertyValueFactory<>("name"));
        columgender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        
        //table.setItems(null);//screan builder ar table identifier
        table.setItems(data);
}}
    
    

