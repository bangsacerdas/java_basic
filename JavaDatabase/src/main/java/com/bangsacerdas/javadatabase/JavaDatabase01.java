/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase01 {
    private static void createTable() throws SQLException{
        
        Connection conn =null;
        Statement smt  =null;
        
        String insertSql= "INSERT INTO `persons`(`PersonID`,`LastName`,`FirstName`,`Address`,`City`)\n" +
                                "VALUES(2,'Zhuo','Jupiter','Jl Merpati','Jakarta');\n";
        try {
            conn = ConnectionDB.DBConnect();
            smt =conn.createStatement();
            System.out.println(insertSql);
            smt.executeUpdate(insertSql);
            System.out.println("Record Insert!");
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (smt!=null)
                smt.close();
            if (conn !=null)
                conn.close();
        }
    }
    public static void main(String[] args) {
        try {
            createTable();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
