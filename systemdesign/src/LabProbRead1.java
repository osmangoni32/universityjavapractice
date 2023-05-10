/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
package labprobread;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class LabProbRead1 {

    
    public static void main(String[] args) {
        
        int num1,num2,num3,num4,add1,sub1,mult1,div1,add2,sub2,mult2,div2;
        try{
              File file=new File("D:\\students.txt");
              Scanner scanner=new Scanner(file);
              while(scanner.hasNext()){
                   num1=scanner.nextInt();
                  num2=scanner.nextInt();
                  num3=scanner.nextInt();
                  num4=scanner.nextInt();
                  add1=num1+num2;
                  sub1 = num1 - num2;
                  mult1 = num1*num2;
                  div1 = num1/num2;
                  add2=num3+num4;
                  sub2 = num3 - num4;
                  mult2 = num3*num4;
                  div2 = num3/num4;
                  System.out.println(add1+" "+sub1+" "+mult1+" "+div1);
                  System.out.println(add2+" "+sub2+" "+mult2+" "+div2);
                  String fileName = "D://temp2.txt";
                  FileWriter fileWriter = new FileWriter(fileName);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(add1+" "+sub1+" "+mult1+" "+div1);
                    bufferedWriter.newLine();
                    bufferedWriter.write(add2+" "+sub2+" "+mult2+" "+div2);
                    bufferedWriter.close();
              }
              scanner.close();
          }catch(Exception e){
              System.out.println("e");
          }
        
        
    }
    
}
