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
public class circle extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        g.drawOval(50, 55,145, 145);
        g.fillOval(50, 55,145, 145);
        g.drawString("it is an circle", 75, 35);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
