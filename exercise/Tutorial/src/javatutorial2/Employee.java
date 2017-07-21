/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial2;

/**
 *
 * @author jupiterzhuo
 */
public class Employee extends Person{
    private int empId;
    public Employee(String name, String gender,int empID) {
        super(name, gender);
        this.empId=empID;
    }

    @Override
    public void work() {
        if(this.empId==0)
            System.out.println("Not Working");
        else
            System.out.println("Working as empolyee");
    }
    
    public static void main(String[] args) {
        Person student =new Employee("Jupiter", "Male", 0);
        Person employee =new Employee("Sonia", "Female", 10001);
        student.work();
        employee.work();
        
        student.changeName("Jupiter Zhuo");
        employee.changeName("Sonia Natalia");
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
    
}
