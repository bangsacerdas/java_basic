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

class  Address{
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
}
class emp {
    int empNo;
    String empName;
    Address empAddress;

    public emp(int empNo, String empName, Address empAddress) {
        this.empNo = empNo;
        this.empName = empName;
        this.empAddress = empAddress;
    }
    
    void display(){
        System.out.println(empNo + " " +empName);
        System.out.println(empAddress.city + " " + empAddress.state + " " +empAddress.country);
    }
}
public class JavaTutorial25 {
    public static void main(String[] args) {
        Address objAddress01 = new Address("Jakarta", "Jakarta Barat", "Indonesia");
        Address objAddress02 = new Address("Banten", "Tangerang Selatan", "Indonesia");
        
        emp objEmp01 = new emp(1001, "Jupiter", objAddress02);
        objEmp01.display();
        
    }
}
