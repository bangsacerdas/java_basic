/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.util.Scanner;

/**
 *
 * @author jupiterzhuo
 */
public class JavaTutorial08 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Masukan Umur ? ");
        int age = input.nextInt();
        System.out.print("Masukan Jenis Kelamin ? ");
        //char gender =input.next().charAt(0);
        String gender =input.next();
        System.out.println("Gender " +  gender);
       
        if( age >= 30 ) // outer if
        {
            if( "M".equals(gender) ){
                System.out.println("Bapak-bapak");
            }
            else{
                System.out.println("Ibu-Ibu");
            }
        }
        else
        {
            if( "M".equals(gender) ){
                System.out.println("Mas-mas");
            }
            else{
                System.out.println("Mba-mba");
            }
        }
 
    }
}
