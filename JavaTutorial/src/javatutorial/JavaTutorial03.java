/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author jupiterzhuo
 */
public class JavaTutorial03 {
    public static void main(String[] args) {
        byte b =50;
        short s =4125;
        int i = 80000;
        long l = 1023738L;
        s=b;
        i=s;
        l=i;
        float f = 2.30f;
        double d = 3.203;
        i=(int)f;
        f=(float) d;
        
        System.out.println("b= " + b);
        System.out.println("s= " + s);
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("f= " + f);
        System.out.println("d= " + d);
        
              
    }
}
