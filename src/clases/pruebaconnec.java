/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class pruebaconnec {
    
    
    public static void main(String[] args) throws SQLException {
    
   
             String sql = "SELECT nombre FROM postulante ";
        Conectarbd con = new Conectarbd();
        Connection c = con.Conectar();
        Statement s =  c.createStatement();
        ResultSet rs = s.executeQuery(sql);
         System.out.println("exito2");
     
        
         while (rs.next()) {
            System.out.println("exito3");
             System.out.println("Nombre: "+rs.getString(1));
                
            
        }
            c.close();
        rs.close();
         
         
         
         
    } 
      
    
    
    
}
