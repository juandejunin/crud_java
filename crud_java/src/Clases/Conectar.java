/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author juan_
 */
public class Conectar {
    
    Connection cn;
    //Crear constructor de publico
    public Connection conexion (){
        
        try {
            // la conexion a mysql sera con el driver jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
            System.out.println("Conectado");
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    
    
    };
    
}
