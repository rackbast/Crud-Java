package SistemadeEmpleadosbl;

import Conexion.Conexion;
import SistemadeEmpleadosbl.Empleadosbl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author david
 */
public class Empleados_Codigo {

     Empleadosbl empleado;
     Conexion conex = new Conexion();
     Statement st;
     ResultSet rs;
     PreparedStatement pst;

     Connection conexionsql = conex.getconex();

     /*  public void consulta(){
          String sql="select*from dbo.Empleados";
          try {
              Statement st=conexionsql.createStatement();
              ResultSet rs=st.executeQuery(sql);
              while(rs.next()){
                   System.out.println(rs.getString("id")+" "+rs.getString("Nombre"));}
              
          } catch (SQLException e) {
               e.printStackTrace();
          }
         
          
     }*/
 /* public void consultar(){
     String sql= "SELECT nombre FROM dbo.Empleados where id=?";
          try {
               PreparedStatement pstm=conexionsql.prepareStatement(sql);
               pstm.setString(1, "001");
               ResultSet respuesta=pstm.executeQuery();
               while(respuesta.next()){
                    System.out.println(respuesta.getString("Nombre"));}
               
          } catch (Exception e) {
               
          }
}*/
     public void insertarDatos(Empleadosbl empleado) {
          String SQL = "insert Into dbo.Empleados (id,Nombre,Apellidos,Correo) values(?,?,?,?)";
          try {
               PreparedStatement pstm = conexionsql.prepareStatement(SQL);
               pstm.setInt(1, empleado.getId());
               pstm.setString(2, empleado.getNombre());
               pstm.setString(3, empleado.getApellido());
               pstm.setString(4, empleado.getCorreo());
               pstm.executeUpdate();
               JOptionPane.showMessageDialog(null, "se ingreso con exito");
          } catch (SQLException e) {
               System.err.println();
          }
     }

     public DefaultTableModel Mostrar(String buscar) {
          DefaultTableModel modelo;
          String sql = "SELECT*FROM dbo.Empleados";
          String[] Titulos = {"ID", "Nombre", "Apellido", "Correo"};
          String[] registro = new String[4];
          modelo = new DefaultTableModel(null, Titulos);

          try {
               st = conexionsql.createStatement();
               rs = st.executeQuery(sql);
               while (rs.next()) {
                    registro[0] = rs.getString("id");
                    registro[1] = rs.getString("Nombre");
                    registro[2] = rs.getString("Apellidos");
                    registro[3] = rs.getString("Correo");
                    modelo.addRow(registro);
                    
               }
                conexionsql.close();
               return modelo;
              
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
               return null;
          }

     }

     public void eliminar(Empleadosbl empleado) {
          String sql = "Delete from dbo.Empleados where id=?";
          try {
               pst = conexionsql.prepareStatement(sql);
               pst.setInt(1, empleado.getId());
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "se elimino correctamente");
               conexionsql.close();

          } catch (SQLException e) {
               JOptionPane.showConfirmDialog(null, e.getMessage());

          }
     }

     public void editar(Empleadosbl empleado)  {
          String sql = "update dbo.Empleados set Nombre=?,Apellidos=?,Correo=? where id=?" ;
          try {
               pst = conexionsql.prepareStatement(sql);
               pst.setString(1, empleado.getNombre());
               pst.setString(2, empleado.getApellido());
               pst.setString(3, empleado.getCorreo());
               pst.setInt(4, empleado.getId());
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "Se actualizo con exito");
               conexionsql.close();
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e.getMessage());
          }
          
     }

     public static void main(String[] args) {
          Empleados_Codigo a = new Empleados_Codigo();

     }
}
