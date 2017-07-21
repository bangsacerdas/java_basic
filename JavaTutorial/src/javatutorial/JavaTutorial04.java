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
public class JavaTutorial04 {
    public static void main(String[] args) {
        int i = 10;
        i+=10;
        System.out.println("Nilai i " + i);
        i-=10;
        System.out.println("Nilai i " + i);
        i*=10;
        System.out.println("Nilai i " + i);
        i%=3;
        System.out.println("Nilai i " + i);
        
        int a,b,c,d;
        a=b=c=d=100;
        
        int p =a++;
        int r =c--;
        int q=++b;
        int s=--d;
        System.out.println("nilai p = " + p + " nilai a= " + a );
        System.out.println("nilai r = " + r + " nilai c= " + c );
        System.out.println("nilai q = " + q + " nilai b= " + b );
        System.out.println("nilai s = " + s + " nilai d= " + d );
        //Ternary Operator
        /*
            Multiline Comment 
            Comment disini
        */
       
        int x;
        String y;
        x=10;
        y=(x==1)?"benar":"Salah";
        System.out.println("Nilai y " + y);
        
        y=(x==10)?"Benar":"Salah";
        System.out.println("Nilai y " + y);
        
        
    }
}
