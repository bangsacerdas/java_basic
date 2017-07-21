/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.text.NumberFormat;

/**
 *
 * @author jupiterzhuo
 */

class Account{
    int accountNo ;
    String name;
    float amount;
    void insert(int _accountNo, String _name, float _amount ){
        accountNo =_accountNo;
        name =_name;
        amount =_amount;
    }
    void deposit(float _amount){
        amount =amount +_amount;
        System.out.println(_amount + " desposited");
    }
    void withdraw(float _amount){
        if (amount < _amount){
            System.out.println("Insufficent Balance");
        }
        else{    
            amount=amount -_amount;
            System.out.println(_amount + " withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("Balance is :" + amountFormat(amount));
    }
    void display(){
        //System.out.println(accountNo + " " + name   +" " +String.format("%,.2f", amount));
         System.out.println(accountNo + " " + name   +" " + amountFormat(amount));
    }
    String amountFormat(float _amount){
        NumberFormat  formatter = NumberFormat.getCurrencyInstance();
        String amountformat =formatter.format(_amount);
        return amountformat;
    }
    
}
public class JavaTutorial19 {
    public static void main(String[] args) {
        Account budiAccount = new Account();
        budiAccount.insert(10001,"Budi", 10000000);
        budiAccount.display();
        budiAccount.checkBalance();
        budiAccount.deposit(2000000);
        budiAccount.checkBalance();
    }
}
