/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.applet.Applet.*;

/**
 *
 * @author xahidICE
 */
public class polygon extends Applet {

    int x1[]={20,120,220,20};
     int y1[]={20,120,20,20};
     int n1=4;
     int x2[]={120,220,220,120};
     int y2[]={120,20,220,120};
     int n2=4;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint (Graphics g){
        g.drawPolygon(x1, y1, n1);
        g.fillPolygon(x2, y2, n2);
        g.drawOval(100, 100, 111, 111);
        g.fillOval(200, 200, 121, 121);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
