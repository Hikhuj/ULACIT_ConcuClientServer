/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulacit;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class Local_dao {
    
    public List<Local> getAllLocalList(){
        
        List<Local> localList = null;
        
        // code here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal?useSSL=false", "root", "mysql");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal?useSSL=false", "root", "mysql");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal?useSSL=false", "root", "mysql");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM local");
            localList = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt(1);
                String direccion1 = rs.getString(2);
                String direccion2 = rs.getString(3);
                String provincia = rs.getString(4);
                String canton = rs.getString(5);
                String distrito = rs.getString(6);
                String telefono = rs.getString(7);
                String email = rs.getString(8);
                
                localList.add(new Local(id, direccion1, direccion2, provincia, canton, distrito, telefono, email));
            }
            rs.close();
            stmt.close();
            con.close();
            
            return localList;
        } catch(Exception e){
            System.out.println(e);
        }
        
        
        return localList;
        
    }
    
}
