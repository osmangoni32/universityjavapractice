/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.applet.*;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author xahidICE
 */
public class add extends Applet implements ActionListener{
    int x,y,z,ad,sb;
    TextField t1=new TextField(10);
     TextField t2=new TextField(10);
     Label l1=new Label("value 1:");
       Label l2=new Label("value 1:");
       Button b1=new Button("result");
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g){
        g.drawString("the sum is:"+ad, 20, 50);
         g.drawString("the sub is:"+sb, 20, 70);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        x=Integer.parseInt(t1.getText());
         y=Integer.parseInt(t2.getText());
         ad=x+y;
         sb=x-y;
         repaint();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
