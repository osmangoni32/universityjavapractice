/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
import java.util.Scanner;

public class scancgpa {
    
   // int x,y,z;
    
    Scanner sc=new Scanner(System.in);
   int  x=sc.nextInt();
   int y=sc.nextInt();
   int z=x+y;
   public scancgpa(){
       int z1=x+y;
       System.out.println(z1);
   }
    public void  sub(){
        int z2=x-y;
        System.out.println(z2);
    }
    public static void main(String[] args) {
        scancgpa p=new scancgpa();
        p.sub();
        
    }
    
}
