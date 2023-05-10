
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class cnvn2ip {
    public static void main(String [] args) throws Exception{
        InetAddress adr=null;
        try{
            adr=InetAddress.getByName("www.google.com");
        }catch(UnknownHostException e){
            System.out.println("error:"+e);
            System.exit(2);
        }
        System.out.println("addres:"+adr.getHostAddress());
        
    }
}
