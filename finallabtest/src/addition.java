/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.in;
import javax.swing.*;

/**
 *
 * @author xahidICE
 */
public class addition extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        int final x=0,y=0,z=0;
        TextField t1=new TextField(8);
        TextField t2=new TextField(8);
        Button b1=new Button("sum");
        Button b2=new Button("sub");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        t1.setText("0");
         t2.setText("0");
           b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               x=Integer.parseInt(t1.getText());
           } 
        });
        
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        int x=0,y=0,z=0;
        String s1,s2,s;
        g.drawString("input in eachbox", 20,50);
      
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
