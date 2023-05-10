
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class ipname {
    public static void main(String [] args) throws Exception{
        InetAddress adr=InetAddress.getLocalHost();
        System.out.println("name&address"+adr.getHostAddress());
    }
}
