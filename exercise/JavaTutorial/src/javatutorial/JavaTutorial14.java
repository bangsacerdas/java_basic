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
public class JavaTutorial14 {
    public static void main(String[] args) {
       /*
        System.out.println("Printing Numbers from 1 to 10");
        for (int count = 1; count <= 10; count++) {
                System.out.println(count);
        }
        */
        
        System.out.println("Numbers 1 - 10");
        for (int i = 1;; ++i) {
                if (i == 11)
                        break;
                if (i==5)
                    continue;
                // Rest of loop body skipped when i is even
                System.out.println(i + "\t");
        }
      
        
    }
}
