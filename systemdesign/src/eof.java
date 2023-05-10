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
import java.io.File;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;


public class eof 
{
       public void eff()
       {
                  File f=new File("D:\\students.txt");
                   DataInputStream dt=null;
                            try 
                            {
                                   dt=new DataInputStream(new FileInputStream(f));
                                    while(true)
                                     {
                                            dt.readInt();
                                      }
                            } catch (IOException e) {
                                    e.printStackTrace();}
        
                                   //  catch(EOFException ex)
                                    // {
                                    //     ex.printStackTrace();
                                     // }
                                              finally
                                              {
                                                       try 
                                                       {
                                                             if(dt!=null)
                                                             {
                                                                         dt.close();
                                                              }
                                                      } 
                                                       catch (Exception e) 
                                                       {
                                                                e.printStackTrace();
                                                        }
                                              }
        }
    
       public static void main(String[] args) {
        eof p=new eof();
        p.eff();
    }
    
}
