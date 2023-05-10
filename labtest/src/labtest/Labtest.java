/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

/**
 *
 * @author xahidICE
 * import 
 */
import java.net.*;
import java.io.*;
public class Labtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        ServerSocket s1=new ServerSocket(1255);
        Socket s=s1.accept();
        OutputStream so =s.getOutputStream();
        DataOutputStream om=new DataOutputStream(so);
        om.writeUTF("this is lab test");
        om.close();
        so.close();
        s.close();
    }
    
}
