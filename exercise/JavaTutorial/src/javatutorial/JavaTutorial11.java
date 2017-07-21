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
    /*
        int a =120;
        if(a< 100){
            System.out.println("Variable is less than 100");
        }
        else if(a==100){
            System.out.println("Variable is equal to 100");
        }
        else if (a>100){
            System.out.println("Variable is greater than 100");
        }
    */
    
        int marks=10;
        try {
            Scanner input =new Scanner(System.in);
            System.out.print("Please enter your Marks (between 0 to 100) >> "); 
            marks = input.nextInt();
          
            
            if(marks< 0){  
                System.out.println("Marks can not be negative: Your entry= "+ marks );  
            }
            else if(marks==0){  
                System.out.println("You got Zero Marks: Go to ZOO");  
            }
            else if (marks>100){  
                System.out.println("Marks can not be more than 100: Your entry= "+ marks );  
            }
            else if (marks>0 & marks< 35){  
                System.out.println("You need to work hard: You failed this time with marks ="+ marks);  
            }
            else if (marks>=35 & marks < 50){  
                System.out.println("Your score is not bad, but you need improvement, you got C Grade");  
            }
            else if (marks>=50 & marks < 60){  
                System.out.println("You can improve performance, you got C+ grade");  
            }
            else if (marks>=60 & marks < 70){  
                System.out.println("Good performance with B grade");  
            }
            else if (marks>=70 & marks < 80){  
                System.out.println("You can get better grade with little more efforts, your grade is B+");  
            }
            else if (marks>=80 & marks < 90){  
                System.out.println("Very good performance, your grade is A ");  
            }
            else if (marks>=90){  
                System.out.println("One of the best performance, Your grade is A+");  
            }         
        } 
        catch (Exception e) {
        
        }
    }
}
