/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Scanner;

import models.Pengusaha;
import models.Profesional;
import models.Karyawan;
import models.Person;
/**
 *
 * @author jupiterzhuo
 */
public class Invoker {
    public static void main(String[] args) {
         
        int input=0;
        int min=1;
        int max=3;
        String alamat,propinsi;
        Scanner sc  =new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("=========");
        System.out.println("1. Pengusaha");
        System.out.println("2. Profesional");
        System.out.println("3. Pekerja");
        System.out.println("");
        boolean inputValidate =false;
        do {
            System.out.print(">> ");
            input =sc.nextInt();
            if (input >= min && input <= max)
                inputValidate=true;
            else 
                System.out.println("Silakan Masukan Pilihan,pilihan 1-3");
                sc.nextLine();
            
        } while (!inputValidate);
        
        
        switch (input) {
            case 1:
                Pengusaha objPerson1=new Pengusaha();
                System.out.println("Silakan Masukan NPWP");
                System.out.print(">> ");
                objPerson1.setNpwp(sc.nextLine());
                System.out.println("Silakan Masukan Nama");
                System.out.print(">> ");
                objPerson1.setNama(sc.nextLine());
                System.out.println("Silakan Masukan Alamat");
                System.out.print(">> ");
                alamat  = sc.nextLine();
                System.out.println("Silakan Masukan Propinsi");
                System.out.print(">> ");
                propinsi =sc.nextLine();

                objPerson1.setAddress(alamat, propinsi);
                System.out.println("Silakan Masukan Omset :");
                System.out.print(">> ");
                objPerson1.setPendapatan(sc.nextDouble());

                objPerson1.cetak(input);
                break;
            case 2:
                Profesional objPerson2=new Profesional();
                System.out.println("Silakan Masukan NPWP");
                System.out.print(">> ");
                objPerson2.setNpwp(sc.nextLine());
                System.out.println("Silakan Masukan Nama");
                System.out.print(">> ");
                objPerson2.setNama(sc.nextLine());
                System.out.println("Silakan Masukan Alamat");
                System.out.print(">> ");
                alamat  = sc.nextLine();
                System.out.println("Silakan Masukan Propinsi");
                System.out.print(">> ");
                propinsi =sc.nextLine();
                objPerson2.setAddress(alamat, propinsi);
                System.out.println("Silakan Masukan Honor :");
                System.out.print(">> ");
                objPerson2.setPendapatan(sc.nextDouble());
                objPerson2.cetak(input);
                break;
            case 3:
                Karyawan objPerson3=new Karyawan();
                System.out.println("Silakan Masukan NPWP");
                System.out.print(">> ");
                objPerson3.setNpwp(sc.nextLine());
                System.out.println("Silakan Masukan Nama");
                System.out.print(">> ");
                objPerson3.setNama(sc.nextLine());
                System.out.println("Silakan Masukan Alamat");
                System.out.print(">> ");
                alamat  = sc.nextLine();
                System.out.println("Silakan Masukan Propinsi");
                System.out.print(">> ");
                propinsi =sc.nextLine();
                objPerson3.setAddress(alamat, propinsi);
                System.out.println("Silakan Status 1. Single  2 Menikah :");
                System.out.print(">> ");
                objPerson3.setStatusMenikah(sc.nextLine());
                System.out.println("Silakan Status 1. Tidak Tetap   2 Tetap :");
                System.out.print(">> ");
                objPerson3.setStatusTetap(sc.nextLine());
                System.out.println("Silakan Masukan Gaji :");
                System.out.print(">> ");
                objPerson3.setPendapatan(sc.nextDouble());
                System.out.println("Silakan Masukan Tunjangan Kesehatan :");
                objPerson3.setTunjangan(sc.nextDouble());
                objPerson3.cetak(input);
                break;
            default:
                break;
        }
            
        

    }
}
