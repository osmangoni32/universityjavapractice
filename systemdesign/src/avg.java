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

public class avg {
    
    
   float average=0;
    int sum=0;
    int n,b,c;
    Scanner sc=new Scanner(System.in);
    
   public void average(){
       System.out.println("how many number do u want:");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("entr the item");
       for (int i = 0; i < n; i++) {
           a[i]=sc.nextInt();
           sum=sum+a[i];     
       }
       
       average = (float)sum/n;
       if(n!=0)
       {  System.out.println("the sum is:"+sum);
             System.out.println("the average is:"+average);}
       else
       { System.out.println("the sum is:"+sum);
           System.out.println("the average is:"+"0");
       }
   }
   
   
    public static void main(String[] args) {
        avg p=new avg();
        p.average();
        
    }
    
}
