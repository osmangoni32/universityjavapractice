/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author xahidICE
 */
public class drawing extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
public void paint(Graphics g){
    g.drawOval(50, 50, 65, 100);
     g.drawOval(60, 50, 5, 10);
      g.drawOval(60, 60, 5, 10);
    g.drawLine(11, 11, 212, 22);
    //repaint();
}
    // TODO overwrite start(), stop() and destroy() methods
}
