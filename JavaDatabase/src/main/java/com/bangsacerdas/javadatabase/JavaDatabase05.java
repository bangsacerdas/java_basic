/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bangsacerdas.javadatabase;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author jupiterzhuo
 */
public class JavaDatabase05 {
     private static void insertTable() throws SQLException{
        
        Connection conn =null;
        PreparedStatement smt  =null;
        
        String insertTableSql= "INSERT INTO `persons`"
                        + "(`PersonID`,`LastName`,`FirstName`,`Address`,`City`) "
                        + "VALUES(?,?,?,?,?);";
        try {
            conn = ConnectionDB.DBConnect();
            smt =conn.prepareStatement(insertTableSql);
            smt.setInt(1, 4);
            smt.setString(2, "Zhuo");
            smt.setString(3, "Hosea");
            smt.setString(4, "Jl Serpong");
            smt.setString(5, "Tangsel");
        
            smt.executeUpdate();
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
