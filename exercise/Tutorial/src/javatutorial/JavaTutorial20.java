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
class BankAccount{
    int accNumber;
    String accName;
    String accAddress;
    //default constructor
    /*
    public BankAccount() {
        System.out.println("Constructor is created");
    }
    */
    //Constructor with Parameterized
    public BankAccount(int _accNumber,String  _accName) {
        accNumber = _accNumber;
        accName =_accName;
    }
    public BankAccount(int _accNumber,String  _accName,String _accAddress) {
        accNumber = _accNumber;
        accName =_accName;
        accAddress = _accAddress;
    }
    public void display (){
        System.out.println("Acc No : " + accNumber +  System.lineSeparator() + "Acc name : " + accName +  System.lineSeparator() + "Acc Address : " + accAddress);
    }
}

public class JavaTutorial20 {
    public static void main(String[] args) {
        BankAccount obj1=new BankAccount(10001,"budi");
        BankAccount obj2=new BankAccount(10002, "Dody", "Sunter");
        obj1.display();
        obj2.display();
    }
}
