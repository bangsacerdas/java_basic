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
public class JavaTutorial06 {
    public static void main(String[] args) {
        int nilai = 100 ;
        /*
        100-90 = A;
        89-80  = B;
        79-70  = C;
        69-60  = D;
        <=59   = E;
        */
        if (nilai >= 90 ){
            if(nilai == 100){
                System.out.println("Grade A++");
                
            }
            else{
                System.out.println("Grade A");
            }
        }
        else if(nilai >= 80 && nilai <= 89){
            System.out.println("Grade B");
        } 
        else if(nilai >= 70 && nilai <= 79){
            System.out.println("Grade C");
        }
        else if(nilai >= 60 && nilai <= 69){
            System.out.println("Grade D");
        } 
        else{
            System.out.println("Grade E");
        }
        
    }
}
