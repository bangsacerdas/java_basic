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
class Vehicle {
   void run(){
       System.out.println("Vehicle is running");
   }   
}
class Bike extends Vehicle{ 
    @Override
    void run(){
        System.out.println("Bike is running safely");
    }
}

public class JavaTutorial28 {
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.run();
    }
}
