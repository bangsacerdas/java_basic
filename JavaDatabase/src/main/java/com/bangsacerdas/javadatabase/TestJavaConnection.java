/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

/**
 *
 * @author jupiterzhuo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJavaConnection {
    public static void main(String[] args) {
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Mysql Driver can't Found");
            e.printStackTrace();
            return;
        }
        
        System.out.println("Mysql JDBC register");
        
        
        try {
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
            
        } 
        catch (SQLException e) {
           System.out.println("Connection Failed! Check output console");
           e.printStackTrace();
           return;
        }
        if (conn !=null)
            System.out.println("Connection Success");
        else
            System.out.println("Connection Failed");
    }
}
