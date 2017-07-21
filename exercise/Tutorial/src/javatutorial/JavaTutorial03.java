/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author jupiterzhuo
 * Local Variable demo
 */
public class JavaTutorial03 {
    public void myAge(){
        int age = 0; 
        // int age; 
        age = age +10;
        System.out.println("My Age is : " + age);
    }
    public static void main(String[] args) {
        JavaTutorial03 _obj  =new JavaTutorial03();
        _obj.myAge();
    }
}
