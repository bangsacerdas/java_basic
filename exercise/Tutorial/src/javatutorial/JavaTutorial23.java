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
class Employee {
    float salary = 10000000f;
}
class Programmer extends Employee{
    float bonus = 2000000f;
}
public class JavaTutorial23 {
    public static void main(String[] args) {
        Programmer budi  = new Programmer();
        System.out.println("Programmer Salary " + String.format("%.2f", budi.salary));
        System.out.println("Programmer Bonus " + budi.bonus);
    }
}
