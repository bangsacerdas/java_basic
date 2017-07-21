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
public class JavaTutorial09 {
    public static void main(String[] args) {  
        int i = 10;  
        i+=10;  
        System.out.println("Addition Operator- "+ i);  
        i-=10;  
        System.out.println("Subtraction Operator- "+ i);   
        i*=10;  
        System.out.println("Multiplication Operator- " + i);  
        i/=10;  
        System.out.println("Division Operator- " + i);  
        i%=3;  
        System.out.println("Reminder Operator- " + i); 
        // Prefix & POstfix
        int a,b,c,d;  
        a=b=c=d=100;  
  
        int p = a++;  
        int r = c--;  
        int q = ++b;  
        int s = --d;  
        System.out.println("prefix increment operator result= "+ p + " & Value of a= "+ a);  
        System.out.println("prefix decrement operator result= "+ r + " & Value of c= "+c);  
        System.out.println("postfix increment operator result= "+ q + " & Value of b= "+ b);  
        System.out.println("postfix decrement operator result= "+ s + " & Value of d= "+d);  
        /*    
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );
        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
        */
    }
}
