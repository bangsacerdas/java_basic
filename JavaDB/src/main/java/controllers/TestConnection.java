/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jupiterzhuo
 */
public class TestConnection {
    public static void main(String[] args) {
        Connection conn =null;
        try { 
             Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            return;
        }
        System.out.println("MYSQL Driver Register");
        
        try {
            conn = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/classicmodels",
                            "root", "root");
        } catch (SQLException ex) {
            
            System.out.println("Connection Failed");
            ex.getMessage();
            return;
        }
       
        if(conn!=null){
            System.out.println("Connection Success");
        }
        else {
             System.out.println("Connection Failed");
        }
    }
}
