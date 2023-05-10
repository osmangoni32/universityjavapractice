
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
public class rmt {
    public static void main(String[] args) throws Exception{
        try{
            if(args.length>0){
                String host=args[0];
                InetAddress adr []=InetAddress.getAllByName(host);
                System.out.println("remote address:");
                for(int i=0;i<adr.length;i++){
                    System.out.println(""+adr[i]);
                }
               
            }
            else
            {
                InetAddress adr=InetAddress.getLocalHost();
                System.out.println("local host"+adr);
            }
        }catch(Exception e){
            
        }
    }
    
}
