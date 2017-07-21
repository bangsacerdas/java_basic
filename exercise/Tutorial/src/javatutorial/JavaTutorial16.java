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
public class JavaTutorial16 {
    public static void main(String[] args) {
        int[][]  a = {{1,3,5},{2,4,6}};
        int[][]  b = {{1,3,5},{2,4,6}};
        int[][] c=new int[2][3];
        for(int i=0;i<2;i++){  
            for(int j=0;j<3;j++){  
                c[i][j]=a[i][j]+b[i][j];  
                System.out.print(c[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
     }
}
