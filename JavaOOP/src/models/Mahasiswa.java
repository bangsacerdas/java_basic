/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jupiterzhuo
 */
public abstract class Mahasiswa{
    private int nim;
    private String nama;
    public static final double  PI=3.14;
    public abstract void cetakBiodata();
    public abstract  String hitungGrade(double nilaiUts, double nilaiUas);
    public abstract int testhitung();
    public void testMethod(){
        System.out.println("Ini adalah Test Method");
    }
    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
   
}
