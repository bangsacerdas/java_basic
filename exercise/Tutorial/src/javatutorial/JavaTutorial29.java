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
class mamalia {
    String Color ="White";
    void makan(){
        System.out.println("Makan....");
    }

    public mamalia() {
        System.out.println("Constructor Mamalia....");
    }
    
}
class sapi extends mamalia{
    String Color ="Black";

    public sapi() {
        super();
         System.out.println("Constructor Sapi....");
    }
    
    void makan(){
        System.out.println("Makan Rumput...");
    }
    void makan2(){
        super.makan();
    }
    void printColor(){
        System.out.println(Color);
        System.out.println(super.Color);
    }
}
public class JavaTutorial29 {
    public static void main(String[] args) {
        sapi obj =new sapi();
        obj.printColor();
        obj.makan();
        obj.makan2();
    }
}
