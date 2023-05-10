/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class fr {
    public void frr(){
        String file="frx.txt";
        String L=null;
        try {
            FileReader fr=new FileReader(file);
            BufferedReader bf=new BufferedReader(fr);
            while((L=bf.readLine())!=null){
                System.out.println(L);
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        fr m=new fr();
        m.frr();
    }
}
