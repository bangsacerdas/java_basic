/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;
import javatutorial2.Student;
/**
 *
 * @author jupiterzhuo
 */
public class JavaTutorial18 {
   
    public static void main(String[] args) {
        Student  obj =new Student();
        obj.id =10001;
        obj.name="Jupiter";
        System.out.println(obj.id + " " + obj.name);
    }
}
