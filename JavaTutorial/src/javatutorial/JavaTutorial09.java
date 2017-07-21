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
public class JavaTutorial09 {
    public static void main(String[] args) {
        int var =1;
        int limit  =10;
        while (var <= limit) {            
            System.out.println("Conter1 " +  var);
            var++;
        }
        
        int  i=10;
        do {            
            i=i+10;
            System.out.println("Counter2 " + i);
        } while (i<10);
        
        for (int j = 0;; j++) {
            if(j==11)
                break;
            if (j==5)
                continue;
            System.out.println("Counter3 " +  j);
        }
        
        for(int x=1;x<=5;x++){
            for (int y=1 ;y<=x;y++){
                System.out.print(y);
                System.out.println("");
            }
        }
        
        
    }
}
