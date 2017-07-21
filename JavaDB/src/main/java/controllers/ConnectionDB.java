/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD="root";
    
    public static Connection ConnectDB(){
        Connection conn =null;
        try { 
             Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
           
        }
        System.out.println("MYSQL Driver Register");
        
        try {
            conn = DriverManager.
                    getConnection(DB_CONNECTION,
                            DB_USERNAME, DB_PASSWORD);
        } catch (SQLException ex) {
            
            System.out.println("Connection Failed");
            ex.getMessage();
   
        }
        return conn;
       
        
    }
}
