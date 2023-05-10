package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
public class Input_1 extends JFrame {
JMenu file,input,search,report;
JMenuItem bw,nw,new1;
    public Input_1(){
setBounds(0,0,840,640);     
//  setBounds(60,40,600,400);

      setVisible(true);
   //setSize(400,500);
   //setLocation(100,120);
           setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JLabel f =new JLabel("this is utso ");
        JLabel T=new JLabel("a;lkj;alksj");
f.setBounds(13,14,100,100);

add(f,BorderLayout.CENTER);
add(T,BorderLayout.CENTER);           //...............................    copy   ............................................
           JMenuBar menubar=new JMenuBar();
setJMenuBar(menubar);
JMenu file=new JMenu("File") ;
JMenu input=new JMenu("Input") ;
JMenu search=new JMenu("Search") ;
JMenu report=new JMenu("Report") ;
JMenu sms=new JMenu("SMS") ;
//input item
 new1=new JMenuItem("New");
JMenuItem bd=new JMenuItem("Bload Donation");
JMenuItem update=new JMenuItem("Update");
JMenuItem bgp=new JMenuItem("Bload Groupint Program");        
JMenuItem rci=new JMenuItem("Reminder Card Issue");        
JMenuItem open2=new JMenuItem("open2");        
JMenuItem alg=new JMenuItem("Application Lot Reg");        
JMenuItem rclg=new JMenuItem("Reminder Card Lot Reg");  

//search item
JMenuItem bgw=new JMenuItem("Blood Group Wise");
nw=new JMenuItem("Name Wise");
JMenuItem vw=new JMenuItem("Village Wise");
JMenuItem dw=new JMenuItem("Distric Wise");
JMenuItem idw=new JMenuItem("Id Wise");
JMenuItem nidw=new JMenuItem("NID Wise");
JMenuItem mfw=new JMenuItem("Male/Female Wise");
JMenuItem dobw=new JMenuItem("Date Of Birtd Wise");
JMenuItem ms=new JMenuItem("Master Search");
JMenuItem aw=new JMenuItem("Age Wise");

input.add(new1);
input.add(update);
input.add(bgp);
input.add(rci);
input.add(bd);

search.add(bgw);
search.add(nw);
search.add(vw);
search.add(dw);
search.add(idw);
search.add(nidw);
search.add(mfw);
search.add(dobw);
search.add(ms);
search.add(aw);

        menubar.add(file);
        menubar.add(input);
        menubar.add(search);
        menubar.add(report);
        menubar.add(sms);
        
            nw.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
//if(e.getSource() == new1){
//namewise l= new namewise();
//l.
       new namewise().setVisible(true);
}

            });
        
        
        new1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
//if(e.getSource() == new1){
Input_1 m= new Input_1();
m.setVisible(true);
}
}
        );    
//
              
           
           //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
           
    }
           
    
}
