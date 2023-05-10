/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.EOFException;
import java.io.IOException;

public class eoff {
    public void f(){
        File ff=new File("D:tt.txt");
        DataInputStream dt=null;
        try {
            dt=new DataInputStream(new FileInputStream(ff));
            while(true){
                dt.readInt();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(dt!=null){
                    dt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        eoff l=new eoff();
        l.f();
    }
}
