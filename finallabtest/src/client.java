
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
public class client {
    public static void main(String [] args) throws IOException{
        Socket ss=new Socket("localhost",1251);
        InputStream im=ss.getInputStream();
        DataInputStream  io=new DataInputStream(im);
        String st=new String(io.readUTF());
        System.out.println(""+st);
        io.close();
        im.close();
        ss.close();
    }
}
