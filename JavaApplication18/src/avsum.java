
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class avsum {

  
    
    public void sum(){
       //  global sum;
         float average=0;
         int sum=0;
          int b,c;
        System.out.println("Enter how many number do u want to sum :" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enetr the element:");
        int l=0;
        do {   
            a[l]=sc.nextInt();
            sum=sum+a[l];
           l++ ;
        } while (l<n);
        System.out.println("The sum is:"+sum);
    
    }
    public  void  avg ()
    {
       // System.out.println("new"+sum);
    }
    public class avg extends avsum {
        public void av(){
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        avsum os=new avsum();
        os.sum();
        os.avg();
        
    }
    
}
