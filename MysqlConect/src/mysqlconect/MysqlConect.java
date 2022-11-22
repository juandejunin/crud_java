/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysqlconect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class MysqlConect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/db";
        Connection con;
        Statement stmt;
        //ResultSet rs;
        
        
        //Conectandonos a la libreria
        
        try {
            //cargar y registrar el controlador JDBC para MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConect.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        try {
            //realizando conexion a base de datos

            con = DriverManager.getConnection(url,usuario,clave);
            //una vez que tenemos la conexion ejecutamos una sentencia sql
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO empleados VALUES(null,'Juan','Garcia','calle','123123456')");
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
