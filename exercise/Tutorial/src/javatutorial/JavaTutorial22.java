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
class counter{
     int count =0;

    public counter() {
        count++;
        System.out.println("Counter " + count);
    }
    
}
public class JavaTutorial22 {
    public static void main(String[] args) {
        counter c1= new counter();
        counter c2= new counter();
    }
}
