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
public class JavaDatabase02 {
    private static void insertTable() throws SQLException{
        
        Connection conn =null;
        Statement smt  =null;
        
        String insertTableSql= "INSERT INTO `persons`(`PersonID`,`LastName`,`FirstName`,`Address`,`City`)\n" +
                                "VALUES(3,'Zhuo','Jupiter','Jl Merpati','Jakarta');";
        try {
            conn = ConnectionDB.DBConnect();
            smt =conn.createStatement();
            System.out.println(insertTableSql);
            smt.execute(insertTableSql);
            System.out.println("Insert Success!");
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
            insertTable();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
