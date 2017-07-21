/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import models.Mahasiswa;
import models.MahasiswaReguler;
import models.WajibPajak;


/**
 *
 * @author jupiterzhuo
 */
public class VirtualClass {
    public static void main(String[] args) {

        //Create Object
        WajibPajak obj = new WajibPajak();
        //Set Value
        obj.setNpwp(10001);
        obj.setNama("Jupiter");
        obj.setGender("Male");
        obj.setAge(30);
        obj.setMobilePhone("083898986397");
        obj.setGaji(10000000);
        obj.setAddress("Jl Perumahan Merpati", "Jakarta", "Jakarta Barat", "11830");
        
        //Hitung Pajak
 
        System.out.println("Pajak :" 
                + FormatClass.formatCurrency(obj.hitungPajak()));
        
        //Cetak
        obj.cetakWP();
       

        System.out.println(obj.test(2, 3));
        
        MahasiswaReguler obj2 =new MahasiswaReguler(1001, "Jupiter");
        obj2.testMethod();
        Mahasiswa obj3;
        obj3 = new Mahasiswa(0, "Jupiter") {
            @Override
            public void cetakBiodata() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public String hitungGrade(double nilaiUts, double nilaiUas) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public int testhitung() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
    
    
}
