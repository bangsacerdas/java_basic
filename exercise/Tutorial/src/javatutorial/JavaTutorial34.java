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
class  Nasabah {
    private String name;
    private String address;
    private int nasabahID;

    public Nasabah(String name, String address, int nasabahID) {
        System.out.println("Nasabah Constructor Call");
        this.name = name;
        this.address = address;
        this.nasabahID = nasabahID;
    }

    public void checkMail(){
        System.out.println("Check Mail " + this.name + " " + this.address);
    }
    @Override
    public String toString() {
        return "Nasabah{" + "name=" + name + ", address=" + address + ", nasabahID=" + nasabahID + '}';
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNasabahID() {
        return nasabahID;
    }
    
}
class Hadiah extends Nasabah{
    private double nilaiHadiah;

    public Hadiah(String name, String address, int nasabahID,double nilaiHadiah) {
        super(name, address, nasabahID);
        setNilaiHadiah(nilaiHadiah);
    }
    @Override
    public void checkMail(){
        System.out.println("Check Mail " + getName() + " " + getAddress() + " Nilai Hadiah" +this.nilaiHadiah);
    }
    public void setNilaiHadiah(double nilaiHadiah) {
       if(nilaiHadiah >= 0.0) {
        this.nilaiHadiah = nilaiHadiah;
       }
    }

    public double getNilaiHadiah() {
        return nilaiHadiah;
    }
    public double bayarHadiah(){
        System.out.println("Hadiah dibayarkan untuk" + getName());
        return this.nilaiHadiah-(this.nilaiHadiah *0.1);
    }
    
    
}
public class JavaTutorial34 {
    public static void main(String[] args) {
        Hadiah a =new Hadiah("Jupiter", "Jakarta", 10001, 100000000);
        Nasabah b=new Hadiah("Lona", "Bandung", 10002, 200000000);
        System.out.println("Call Mail Check -- hadiah ");
        a.checkMail();
        
        System.out.println("Call Mail Check -- nasabah ");
        b.checkMail();
        
    }
}
