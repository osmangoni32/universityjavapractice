/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xahidICE
 */
public class cft {
    public void ct(){
        try {
            Class.forName("cft");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        cft s=new cft();
        s.ct();
    }
    
}
