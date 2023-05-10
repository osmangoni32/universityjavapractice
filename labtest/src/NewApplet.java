/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author xahidICE
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
         

        String java;
java="pust";

// TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        g.drawString("java",10, 200);
        g.drawRect(50, 90, 100, 50);
        g.fillRect(30, 90, 100, 50);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
