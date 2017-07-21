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
public class JavaTutorial06 {
    public static void main(String arg[])
    {
        byte b;
        int i = 81;
        double d = 323.142;
        float f = 72.38f;
        char c = 'A';
        
        c = (char) i;
        System.out.println("i = " + i + " c = " + c);
        
        i = (int) d; // LINE A
        System.out.println("d = " + d + " i = " + i); // LINE B
        
        i = (int) f; // LINE C
        System.out.println("f = " + f + " i = " + i); // LINE D
        
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);
        
    
    
    }
}
