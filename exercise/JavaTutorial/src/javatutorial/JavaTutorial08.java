/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author jupiterzhuo
 * This operator is used only for object reference variables. The operator checks whether the object is of a particular type (class type or interface type). 
 */

//Parent Class
class ParentJavaTutorial08{}



public class JavaTutorial08 extends ParentJavaTutorial08{
    public static void main(String[] args) {
      /*
      String name = "James";

      // following will return true since name is type of String
      boolean result = name instanceof String;
      System.out.println( result );
      */
      
      ParentJavaTutorial08 _obj =new JavaTutorial08();
      boolean result =  _obj instanceof JavaTutorial08;
      System.out.println( result );
     
    
    }
}
