package javatutorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jupiterzhuo
 */
public class JavaTutorial13 {
    public static void main(String[] args) {
        String s1= "Java";
        char[] myString = {'J','a','v','a'};
        String s2 =new String("Tutorial");
        String s3 ="Java";
        String s4 =new String("Java");
        System.out.println(s1);
        System.out.println(myString);
        System.out.println(s2);
        //Concat
        System.out.println(s1.concat(s2));
        
        //
        System.out.println(s1.equals(myString));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        //SubString
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        //empty
        boolean isEmptyString=s1.isEmpty();
        System.out.println(isEmptyString);
        System.out.println(s1.length());
        
        String s5  =s1.replace("a", "u");
        System.out.println(s5);
    }
 
}
