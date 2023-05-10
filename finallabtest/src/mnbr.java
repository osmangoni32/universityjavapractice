
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
public class mnbr implements ActionListener {
    
   public void menubar(){
        JFrame f=new JFrame("menubar");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("file");
         Menu m2=new Menu("edit");
          Menu m3=new Menu("close");
          m3.addActionListener(this);
          mb.add(m1);
          mb.add(m2);
          mb.add(m3);
          f.setMenuBar(mb);
          f.setSize(400, 500);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new menubar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
