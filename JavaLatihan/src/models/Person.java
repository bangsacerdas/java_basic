/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Misc;

/**
 *
 * @author jupiterzhuo
 */
public class Person implements IPajak{
    private String npwp;
    private String nama;
    private Address address;
    private double pendapatan;
    public void setAddress(String _alamat,String _provinsi){
        address =new Address();
        address.setAlamat(_alamat);
        address.setProvinsi(_provinsi);
    }
    
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }



    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetak(int pilihan) {
           System.out.println("---------Laporan Bayar Pajak------------------");
           System.out.print("Jenis Laporan : ");
           switch(pilihan)
           {
               case 1:
                   System.out.println("Pengusaha");
                   break;
               case 2:
                   System.out.println("Profesional");
                   break;
               case 3:
                   System.out.println("Karyawan");
                   break;
           }
           System.out.println("NPWP : "+ this.getNpwp());
           System.out.println("Nama : "+ this.getNama());
           System.out.println(address.toString());
           System.out.println("Pendapatan : " + Misc.formatCurrency(this.getPendapatan()));
           
    }
    
  
  
   
}
