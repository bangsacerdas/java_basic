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
public class JavaTutorial15 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        //Initial Array
        //myList[0]=1.9;  

        //double myList[]= {1.9, 2.9, 3.4, 3.5};
         // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
           System.out.println(myList[i] + " ");
        }
        /*
        for (double element: myList) {
         System.out.println(element);
        }*/
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
      
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max); 
    }
}
