
import java.io.*;
import java.net.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket s=new ServerSocket(1251);
        Socket s1=s.accept();
        OutputStream om=s1.getOutputStream();
        DataOutputStream o=new DataOutputStream(om);
        o.writeUTF("ice");
        o.close();
        om.close();
        s1.close();
        
    }
}
