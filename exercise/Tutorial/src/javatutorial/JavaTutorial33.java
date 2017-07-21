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
class Pusat{
    float bungaPinjaman(){
        return 0;
    }

  
}
class Cabang1 extends Pusat{
    @Override
    float bungaPinjaman(){
        return 5.0f;
    }
}
class Cabang2 extends Pusat{
    @Override
    float bungaPinjaman(){
        return 4.0f;
    }
      void testMethod2(){
       
        System.out.println("Test Method 3");
    }
}
class Cabang3 extends Pusat{
    public int test;
    @Override
    float bungaPinjaman(){
        return 10.0f;
    }
   
    void testMethod3(){
       
        System.out.println("Test Method 3");
    }
   public void doIt(Pusat p){
       if(p instanceof Cabang3){
           ((Cabang3)p).testMethod3();
       }
   }
}
public class JavaTutorial33 {
    public static void main(String[] args) {
        
        
        try {
           Pusat a =new Cabang3();
          
           Cabang3 cb3 =(Cabang3) a;
           cb3.testMethod3();
            
        } catch (ClassCastException e) {
            e.getMessage();
        }
        
    }
}
