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
public class JavaTutorial10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Input Data ");
        int sum=0;
        int nilai = input.nextInt();
        for(int i=1;i<=nilai;i++){
            System.out.print(2*i-1 + " ");
            sum+=2*i-1;
            System.out.print(" ");
        }
        System.out.println("Jumlah dari " + nilai 
                + " data adalah : " + sum  );
    }
}
