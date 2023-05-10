package project;

import javax.swing.*;
import java.awt.event.*;
public abstract class project extends JFrame {
//public abstract class project extends JFrame implements ActionListener{
    JMenuBar menubar;  

    JMenu file,input,search,report,sms;
JMenuItem ff,new1,bd,nw,update,bgp,rci,alg,rclg,bgw,vw,dw,idw,nidw,mfw,dobw,msw,aw,ms;
JMenuItem  vlg,clg,des,ind,dt,awrd,atg,nlm,db,BGP,aao,isms,gsms,noti;

    
public project (String title){
super(title);
setBounds(0,0,840,640);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menubar=new JMenuBar();
setJMenuBar(menubar);
JMenu file=new JMenu("File ") ;
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
//file input
JMenuItem alg=new JMenuItem("Application Lot Reg");        
JMenuItem rclg=new JMenuItem("Reminder Card Lot Reg");  
JMenuItem vlg=new JMenuItem("Voucher  Card Lot Reg");  
JMenuItem clg=new JMenuItem("Contribution Lot Reg");  
JMenuItem des=new JMenuItem("Destroy / Cancel");  

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
//report item
ind=new JMenuItem("Individual Donation");
dt=new JMenuItem("Donation Time");
awrd=new JMenuItem("Awarded");
atg=new JMenuItem("At A Glance");
//sms

nlm=new JMenuItem("Member");
db=new JMenuItem("Doner");
BGP=new JMenuItem("BGP");
aao=new JMenuItem("As A Organizer");
isms=new JMenuItem("Individual SMS");
gsms=new JMenuItem("General SMS");
noti=new JMenuItem("Nonification");

report.add(ind);

report.add(dt);
report.add(awrd);
report.add(atg);
sms.add(nlm);
sms.add(db);
sms.add(BGP);
sms.add(aao);
sms.add(isms);
sms.add(noti);
sms.add(gsms);

file.add(alg);
file.add(rclg);
file.add(vlg);
file.add(clg);
file.add(des);

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
namewise l= new namewise();
l.setVisible(true);
}
}
        );
        
        
        new1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
//if(e.getSource() == new1){
Input_1 m= new Input_1();
m.setVisible(true);
dispose(); //after clicking another JMenuItem this page will auto dispose 

}
}
        );     
//https://www.youtube.com/watch?v=wF7NdrXlsfw
    
}




    public static void main(String[] args){  
       project F = new project("this is javaApplicarion") {};
              F.setVisible(true);
                } 
}
