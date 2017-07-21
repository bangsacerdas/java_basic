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
public class JavaTutorial07 {
    public static void main(String[] args) {
          char ch = 'x';
        /*Scanner input =new Scanner(System.in);
        int umur =input.nextInt();
        String jenisKelamin =input.nextLine();
         */
        switch (ch) {
            case 'a':
            case 'A':
            
                
            case 'e':
            case 'E':
                
            case 'i':
            case 'I':
 
            case 'o':
            case 'O':

            case 'u':
            case 'U':
                System.out.println(ch + " Huruf Vokal ");
                break;
            default:
                System.out.println(ch + " Huruf Konsonan");
                break;
        }
	} 
 }

