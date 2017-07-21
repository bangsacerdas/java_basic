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
class Student{
   int studentID;
   String studentName;
   static String studentCollage ="Sciencom";
   static final String TEST="123";
    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    void display (){
        System.out.println(this.studentID + " " + this.studentName +  " " + Student.studentCollage);
    }
    // Static
     static void change(){
        // Student.TEST="345";
         Student.studentCollage="bangsacerdas";
    }
}
public class JavaTutorial21 {
    public static void main(String[] args) {
         Student.change();
        Student obj =new Student(10001, "Budi");
        obj.display();
        obj.change();
        System.out.println(Student.TEST);
        System.out.println(Student.studentCollage);
    }
}
