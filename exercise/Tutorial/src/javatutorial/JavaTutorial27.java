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

class hitung1{
     static void add(int a,int b){
          System.out.println("Invoke 1");
    } 
     static void add(double a,double b){
        System.out.println("Invoke 2");
    } 
}
public class JavaTutorial27 {
    public static void main(String[] args) {
      hitung1.add(1, 1.1);
    }
}
