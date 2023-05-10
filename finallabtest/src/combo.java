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

public class combo {
    combo(){
        String[] it={"ab","ac","ad" };
        JComboBox cm=new JComboBox(it);
        cm.setBounds(50, 50, 40, 30);
        JFrame f=new JFrame();
        f.add(cm);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new combo();
    }
    
}
