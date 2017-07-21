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
public class JavaTutorial11 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.print("Input Data ");
       int nilai = input.nextInt();
       System.out.println("\n");
       for (int i = 0; i <=nilai; i++) {
            System.out.println(nilai + "X" + i + " = " + nilai*i);
       }
 
    }
}
