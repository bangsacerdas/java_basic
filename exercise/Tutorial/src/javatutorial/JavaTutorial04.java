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
public class JavaTutorial04 {
  
    // this instance variable is visible for any child class.
    public String name;
    // salary  variable is visible in JavaTutorial04 class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public JavaTutorial04(String empName) {
        name=empName;
    }
    
    // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }
    
    // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }
    
    public static void main(String args[]) {
      JavaTutorial04 empOne = new JavaTutorial04("Jupiter");
      empOne.setSalary(1000);
      empOne.printEmp();
     
   }
}
