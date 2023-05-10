/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author xahidICE
 */
public class Bdate {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
  
       SimpleDateFormat  sdf1=new   SimpleDateFormat("MM/dd");
      SimpleDateFormat  sdf=new   SimpleDateFormat("MM/dd/yyyy");
             Date dt1=sdf.parse("12/16/2016");
       Date dt=sdf1.parse("12/16/2007");
                                                                                                                                                    //Date dt1=sdf.parse("12/16/2016");
                                                                                                                                                 //   System.out.println("date"+dt1);
                                                                                                                                                   // if(dt.compareTo(dt1)==0){
                                                                                                                                                      //  System.out.println("today");  }
                                                                                                                                                        // LocalDate ld=LocalDate.now();


                                                                                                                                                  // SimpleDateFormat  sdf=new   SimpleDateFormat("MM/dd");
                                                                                                                                                  // Date dt=sdf.parse("12/16/2007");
                                                                                                                                                   // Date dt1=sdf.parse("12/16/2016");
          Date d=new Date();
                  
             
              String d1= sdf1.format(d);
              Date d2=sdf1.parse(d1);
                 
              String d11= sdf1.format(d);
              Date d12=sdf1.parse(d1);
       
        long ms=System.currentTimeMillis()-dt1.getTime();
       long age=(long)((long)ms/(1000.0*60*60*24));
       System.out.println("jhfdv:"+age);
   
        if(dt.compareTo(d2)==0){
      
            System.out.println("today");  }
        else 
                System.out.println("not");
                                                                                                                                                    //  System.out.println(sdf1.format(d));
                                                                                                                                                       //System.out.println(""+dt);
      
                }
    
}
