/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
     private Connection conexion=null;
     private DriverManager driver;
     private String url="jdbc:sqlserver://localhost:1433;databaseName=Registro;user=usuario1;password=123";
     
     public Connection getconex(){
          try {
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               conexion=DriverManager.getConnection(url);
          } catch (SQLException  |ClassNotFoundException e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
          }
           return conexion;
     }
     
     public void cerrarConexion()
     {
          try {
               conexion.close();
               JOptionPane.showMessageDialog(null, "SE CERRO LA CONEXION)");
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
          }
     }
   
}
