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
class hitung{
    static int add(int a,int b){
        return a+b;
    } 
    /*
    static int long(long a,long b){
        return a+b;
    } */
    static long add(int a,int b,int c){
        return a+b+c;
    }  
}
public class JavaTutorial26 {
    public static void main(String[] args) {
        System.out.println(hitung.add(11,11));  
        System.out.println(hitung.add(11,11,11)); 
    }
}
