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
class Animal2 { 
    
}
class Dog4 extends Animal2 {  
  static void method(Animal2 a) {  
       Dog4 d=(Dog4)a;//downcasting  
       System.out.println("ok downcasting performed");  
  }  
}
public class JavaTutorial32 {
    public static void main(String[] args) {
          Animal2 a=new Dog4();  
        Dog4.method(a);  

    }
}
