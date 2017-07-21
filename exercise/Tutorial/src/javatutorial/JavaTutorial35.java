/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jupiterzhuo
 */
public class JavaTutorial35 {
    public static void main(String[] args) throws ParseException {
       SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        //Current Date & Format
        Date objDate = new Date();
        System.out.println(objDate);
        System.out.println(sdf.format(objDate));
        
         //Convert String To Date
         Date date2=sdf.parse("21/08/2017");
         System.out.println(date2);
         System.out.println(sdf.format(date2));
         
    }
}
