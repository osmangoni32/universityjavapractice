/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.io.*;
public class file {
    public static void main(String[] args) {
        String filename="temp.txt";
        String Line=null;
        try {
             FileReader fr=new FileReader(filename);
             BufferedReader bf=new BufferedReader(fr);
             while((Line=bf.readLine())!=null){
                 System.out.println(Line);
                   }
             bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("this is:"+e);
        }
        catch(IOException e)
        {
            System.out.println(e);
    }
}
}
