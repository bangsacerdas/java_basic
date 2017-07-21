/*+ 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/** 
 *
 * @author jupiterzhuo
 */
public class JavaTutorial12 {
    public static void main(String[] args) {
        int[] myList ; //Array
        myList =new int[5]; 
        myList[0]=10;
        myList[1]=20;
        System.out.println(myList[0]);
        
        double[] myList2 = {1.2,1.3,1.4};
        for (int i = 0; i <myList2.length; i++) {
            System.out.print(myList2[i] + " ");
        }
        System.out.println(" ");
        for(double element :myList2 ){
            System.out.print(element+ " ");
        }
        System.out.println(" ");
    }
}
