/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author jupiterzhuo
 * String Example
 */
public class JavaTutorial31 {
        public static void main(String[] args) {
             String s1="java";//creating string by java string literal 
             char[] myChar={'b','a','n','g','s','a','c','e','r','d','a','s'};
             String s2  = new  String(myChar); //converting char array to string
             String s3=new String("Tutorial"); //creating java string by new keyword
             
             System.out.println("myString : " + s1); 
             System.out.println("myString : " + s2);
             System.out.println("myString : " + s3); 
             //Concat 
             s2.concat(s3);
             //String Compare
             String x = "Java Tutorial";
             String y = new String("Java TUtorial");
             String z = "Java";
             boolean compare1=x.equals(y);
             System.out.println(compare1);
             boolean compare2 =x.equalsIgnoreCase(y);
             System.out.println(compare2);
             //String Compare
             String a1="Java";
             String a2="Java";
             String a3 =new String("Java");
             
             System.out.println(a1==a2);
             System.out.println(a1==a3);
             //String SubString
             String b1 ="Belajar Java";
             System.out.println(b1.substring(0, 3));
             System.out.println(b1.toLowerCase());
             System.out.println(b1.toUpperCase());
             
         
        }
       
    }

