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
public  class Person {
    private int npwp;
    private String nama;
    private String gender;

    private int age;
    private String mobilePhone;
    private Address a;
    
    public void setAddress(String alamat, String propinsi, String kabupaten, String zipcode){
        a=new Address();
        a.setAlamat(alamat);
        a.setPropinsi(propinsi);
        a.setKabupaten(kabupaten);
        a.setZipCode(zipcode);
    }

    
    public void checkType(){
        //a=new Address();
        System.out.println(this.a.getClass().getName()); 
    }

    public int getNpwp() {
        return npwp;
    }

    public void setNpwp(int npwp) {
        this.npwp = npwp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    
    public Person() 
    {
        System.out.println("Call Constructor person");
    }
    
    public void cetakBiodata(){
        System.out.println("NPWP :" + this.npwp);
        System.out.println("Nama :" + this.nama);
        System.out.println("gender :" + this.gender); 
        System.out.println("Umur :" + this.age);
        System.out.println("Mobile :" + this.mobilePhone);
        System.out.println(a.toString());
    }
    
    void hitung(int a, int b ){;
    
        System.out.println("Ini adalah Method Hitung Parent ");
    }
    
    public int test(int a, int b ){
       return a*b;
    }
   
    public double test(double a, double b ){
       return a*b;
    }
    public int test(int a, int b, int c){
        return a*b*c;
    }
    
    
    
}
