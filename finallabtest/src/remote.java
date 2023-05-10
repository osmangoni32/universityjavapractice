
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
public class remote {
    public static void main(String[] args) {
        try {
            if(args.length>0){
                String host=args[0];
                InetAddress adr[]=InetAddress.getAllByName(host);
                for(int i=0;i<adr.length;i++){
                    System.out.println(""+adr[i]);
                }
            }
            else
            {
                InetAddress adr=InetAddress.getLocalHost();
                System.out.println(""+adr);
            }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
    }
}
