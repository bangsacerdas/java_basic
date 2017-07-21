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
public class JavaTutorial05 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please input User Age :");
        int user=input.nextInt();
       
        if(user<=18){
            System.out.println("User is 18 or younger");
            System.out.println("User is 18 or younger");
        }
        else
            System.out.println("User is older than 18");
        
    }
}
