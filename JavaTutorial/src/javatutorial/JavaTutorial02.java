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
public class JavaTutorial02 {
    int myvar;
    static double myVar2;
    static final double PI =3.14;
    void myAge(){
        myvar=200;
        int age=0;
        age= age+10;
        System.out.println("My Age is " + age);
    }
    void myMethod(){
        myvar=100;
       
        System.out.println("My Var Value " + myvar);
    }
    public static void main(String[] args) {
       JavaTutorial02 rumah = new JavaTutorial02();
       rumah.myvar=500;
        
        System.out.println("Variable My var " + rumah.myvar);
        rumah.myAge();
        System.out.println("Variable My var " + rumah.myvar);
        myVar2=1.2;
        JavaTutorial02.myVar2=1.3;
        System.out.println("Variable My var " + myVar2 );
   
        System.out.println("Variable My var " + PI );
        
    }
}
