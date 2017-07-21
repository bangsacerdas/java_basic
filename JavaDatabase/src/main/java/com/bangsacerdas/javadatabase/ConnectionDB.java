/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jupiterzhuo
 */
public class ConnectionDB {
    private static final String DB_DRIVER="com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION="jdbc:mysql://localhost:3306/classicmodels";
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="root";
    
    public static Connection DBConnect(){
        Connection conn=null;
         try {
            Class.forName(DB_DRIVER);
        } 
        catch (ClassNotFoundException e) {
            System.out.println("Mysql Driver can't Found");
        }
         
        try {
            
            conn=DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return conn;
        } 
        catch (SQLException e) {
           System.out.println("Connection Failed! Check output console");
        }
        return conn;
    }
}
