/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

/**
 *
 * @author xahidICE
 */
import java.net.*;
import java.io.*;
public class client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",1255);
        InputStream in=s.getInputStream();
        DataInputStream i=new DataInputStream(in);
       String st=new String (i.readUTF());
        System.out.println(st);
        i.close();
        in.close();
        s.close();
    }
}
