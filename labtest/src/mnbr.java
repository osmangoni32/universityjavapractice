
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class mnbr implements ActionListener  {
    
   mnbr(){
        JFrame f=new JFrame("menubar");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("file");
         Menu m2=new Menu("edit");
          Menu m3=new Menu("close");
          MenuItem i1=new MenuItem("esit");
          i1.addActionListener(this);
          m1.add(i1);
          mb.add(m1);
          mb.add(m2);
          mb.add(m3);
          f.setMenuBar(mb);
          f.setSize(400, 500);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new mnbr();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  String choice=e.getActionCommand();
  if(choice.equals("esit")){
      System.exit(0);
  }
    }
    
}
