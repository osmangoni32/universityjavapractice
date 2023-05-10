/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author xahidICE
 */
public class login {
    Connection con;
    Statement st;
    ResultSet rs;
    JFrame f=new JFrame("login popup");
    JLabel l=new JLabel("username");
    JLabel l1=new JLabel("pass");
    JTextField t=new JTextField(10);
     JTextField t1=new JTextField(10);
     JButton b=new JButton("login");
    
    public login(){
        connect();
        frame();
        
    }
    public void connect(){
        String url="jdbc:mysql://localhost:3306/student";
        String uname="root";
        String pass="";
        try { 
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,uname,pass);
        st=con.createStatement();
         String sql="select name from std where id =2 ";
                   rs=st.executeQuery(sql);
         while(rs.next()){
        String nm=rs.getString("name");
       System.out.println(nm);}
            System.out.println("connected");
      JOptionPane.showMessageDialog(null,"connected");
        }
        catch (Exception e) {
        }
       
        
    }
    
    public void frame(){
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setColor(Gray);
        f.setVisible(true);
        JPanel p= new JPanel();
        p.add(l);
          p.add(t);
         p.add(l1);
          p.add(t1);
            p.add(b);
            f.add(p);
             b.addActionListener (new ActionListener(){
               public void actionPerformed(ActionEvent e)
               {
                   try {
                 
                    String name=t.getText().trim();
                    String id=t1.getText().trim();
                   String sq="select id from std where id='"+id+"'";
                   rs=st.executeQuery(sq);
                   
                   int count=0;
                   while(rs.next()){
                       count=count+1;
                   }
                   if(count==1){
                       JOptionPane.showMessageDialog(null,"logged in");
                   }
                   else if(count>1){
                       JOptionPane.showMessageDialog(null,"access denied");
                   }
                    else {
                       JOptionPane.showMessageDialog(null,"not found");
                   }
                   }     
                    catch (Exception ex) {
                   }
                }
             }); 
  
        
        
        
    }
    public static void main(String[] args){
        new login();
    }
}
