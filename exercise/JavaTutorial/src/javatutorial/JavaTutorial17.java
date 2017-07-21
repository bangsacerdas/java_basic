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
class student{
    int id;
    String name;
}
public class JavaTutorial17 {
    public static void main(String[] args) {
        student _obj=new student();
        _obj.id =10001;
        _obj.name="Jupiter";
        System.out.println(_obj.id + " "  + _obj.name);
    }
 
}
