/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsoor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class bgp_mail {
    
    static int K;

      public static void sendMail(String wish_from_program) throws Exception {
    //    System.out.println("Preparing to send email   :"+wish_from_program);
        Properties properties = new Properties();
        int S;
        //Enable authentication
        properties.put("mail.smtp.auth", "true");
        //Set TLS encryption enabled
        properties.put("mail.smtp.starttls.enable", "true");
        //Set SMTP host
        properties.put("mail.smtp.host", "smtp.gmail.com");
        //Set smtp port
        properties.put("mail.smtp.port", "587");

        //Your gmail address
        String myAccountEmail = "faruk.ice.pust@gmail.com";
        //= "osman.ice.32@gmail.com";
        
        //Your gmail password
     //   String password = "150632ice";
         String password = "01688200644";
        String  WISHING_TEXT = ""+wish_from_program;
        String[] recepients = new String[30];
 DbConnectionfinal d=new  DbConnectionfinal();
 int i=0,j=0;
 
 
 
 
        //Create a session with account credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
          try {
            Connection conn = d.con();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM "+WISHING_TEXT+""); //WHERE bgroup='" + blood + "'");// WHERE phonenumber='"+pn+"' and fathername='"+fn+"'");

            while (rs.next()) {
                DbConnectionfinal dc;
                System.out.println(" " + rs.getString("email"));
                recepients[i++] = "" + rs.getString("email");
                j++;
                System.out.println("value of j :  " + j);
              }

          } catch (Exception e) {
              System.out.println("Loading ERROR IN five TABLE  :  " + e);
          }

        //Prepare email message
          for (K = 0; K < j; K++) {
              Message message = prepareMessage(session, myAccountEmail, recepients);
              //Send mail
              Transport.send(message);
              System.out.println("Message sent successfully");
          }
    }

  public static Message prepareMessage(Session session, String myAccountEmail, String[] recepients) {
           
        try {
          
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
          //    System.out.println("  "+K);
    
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepients[K]));
         //     System.out.println("  "+K);
            message.setSubject("BGP");
            String htmlCode = "<h1> hi this is utsorgo <br> Bgp general message</h1>";
            message.setContent(htmlCode, "text/html");          
            return message;
        } catch (Exception ex) {
            Logger.getLogger(javaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
