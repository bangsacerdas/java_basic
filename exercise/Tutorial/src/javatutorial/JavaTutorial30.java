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
class orang {
   int id;  
   String name;  
   public orang(int id,String name){   
        this.id=id;  
        this.name=name;  
    }   
}
class pegawai extends orang{
    float salary;     
    public pegawai(int id, String name,float salary) {
        super(id, name);
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    
}
public class JavaTutorial30 {
    public static void main(String[] args) {
        pegawai e1=new pegawai(1001, "Jupiter",100000f);
    }
  
}
