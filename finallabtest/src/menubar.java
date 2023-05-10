/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.awt.*;
import javax.swing.*;
public class menubar {
    
    menubar(){
        JFrame f=new JFrame("menubar example");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("file");
          Menu m2=new Menu("edit");
            Menu m3=new Menu("search");
            
            
            MenuItem i1=new MenuItem("new");
               MenuItem i2=new MenuItem("open");
                  MenuItem i3=new MenuItem("close");
  //MenuItem i1=new MenuItem("new");
  
  
  m1.add(i1);
  m1.add(i2);
  m1.add(i3);
  mb.add(m1);
   mb.add(m2);
    mb.add(m3);
    
    f.setMenuBar(mb);
    f.setSize(400, 600);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public static void main(String args[]){
        new menubar();
    }
    
}
