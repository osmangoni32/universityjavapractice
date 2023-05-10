package utsoor;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class javamailcustomized {


      public static void sendMail(String name_from_program ,String email_from_program,String wishing_text) throws Exception {
    //    System.out.println("Preparing to send email   :"+email_from_program);
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
        String myAccountEmail = "osman.ice.32@gmail.com";
   
         String recepient = ""+email_from_program;
         String  NAME = ""+name_from_program;
         String  WISHING_TEXT = ""+wishing_text;
         String password = "150632ice";
        //Create a session with account credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
   

        //Prepare email message
        
              Message message = prepareMessage(session, myAccountEmail, recepient,NAME,WISHING_TEXT);
              //Send mail
              Transport.send(message);
              System.out.println("Message sent successfully");
               
       
    }

  public static Message prepareMessage(Session session, String myAccountEmail, String recepient,String NAME,String 
          WISHING_TEXT) {
     
        try {
          
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
        
            message.setSubject("BLOOD PROJECT");
             String htmlCode = " dear "+NAME+" <br> "+WISHING_TEXT+" & may allah bless you in your life";
           
           message.setContent(htmlCode, "text/html");          
            return message;
        } catch (Exception ex) {
            Logger.getLogger(javaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
