/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces_Graficas;

import SistemadeEmpleadosbl.Empleados_Codigo;
import SistemadeEmpleadosbl.Empleadosbl;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class formulario extends javax.swing.JFrame {

     DefaultTableModel Modelo;

     public formulario() {
          initComponents();
          mostrar("");

     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          idtxt = new javax.swing.JTextField();
          nombretxt = new javax.swing.JTextField();
          txtapellido = new javax.swing.JTextField();
          txtcorreo = new javax.swing.JTextField();
          jScrollPane1 = new javax.swing.JScrollPane();
          Tabla = new javax.swing.JTable();
          jSeparator1 = new javax.swing.JSeparator();
          jSeparator2 = new javax.swing.JSeparator();
          jSeparator3 = new javax.swing.JSeparator();
          jSeparator4 = new javax.swing.JSeparator();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          btnAgregar = new javax.swing.JButton();
          btnEditar = new javax.swing.JButton();
          btnEliminar = new javax.swing.JButton();
          btnLimpiar = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setLocationByPlatform(true);
          setUndecorated(true);
          setResizable(false);
          getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          jPanel1.setBackground(new java.awt.Color(255, 255, 255));
          jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
          jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
          jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mousePressed(java.awt.event.MouseEvent evt) {
                    jPanel1MousePressed(evt);
               }
          });

          jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
          jLabel1.setText("ID");

          jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
          jLabel2.setText("Nombre");

          jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
          jLabel3.setText("Apellidos");

          jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
          jLabel4.setText("Correo");

          idtxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
          idtxt.setBorder(null);
          idtxt.setFocusTraversalPolicyProvider(true);
          idtxt.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    idtxtActionPerformed(evt);
               }
          });

          nombretxt.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
          nombretxt.setBorder(null);

          txtapellido.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
          txtapellido.setBorder(null);

          txtcorreo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
          txtcorreo.setBorder(null);

          Tabla.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
               },
               new String [] {
                    "ID", "Nombre", "Apellidos", "Correo"
               }
          ));
          Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TablaMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(Tabla);

          jSeparator1.setBackground(new java.awt.Color(51, 51, 51));

          jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

          jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

          jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

          jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/pnge.png"))); // NOI18N
          jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mousePressed(java.awt.event.MouseEvent evt) {
                    jLabel5MousePressed(evt);
               }
          });

          jLabel6.setBackground(new java.awt.Color(255, 51, 51));
          jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
          jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/cancelar.png"))); // NOI18N
          jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel6MouseClicked(evt);
               }
               public void mousePressed(java.awt.event.MouseEvent evt) {
                    jLabel6MousePressed(evt);
               }
          });
          jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyPressed(java.awt.event.KeyEvent evt) {
                    jLabel6KeyPressed(evt);
               }
          });

          btnAgregar.setBackground(new java.awt.Color(204, 255, 153));
          btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/guardar.png"))); // NOI18N
          btnAgregar.setText("Agregar");
          btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnAgregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAgregarActionPerformed(evt);
               }
          });

          btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/editar.png"))); // NOI18N
          btnEditar.setText("Editar");
          btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnEditar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEditarActionPerformed(evt);
               }
          });

          btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/eliminar.png"))); // NOI18N
          btnEliminar.setText("Eliminar");
          btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarActionPerformed(evt);
               }
          });

          btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Escritorio\\png\\limpiar.png")); // NOI18N
          btnLimpiar.setText("Limpiar");
          btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLimpiarActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(43, 43, 43))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel4)
                                             .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(btnAgregar)
                                             .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addComponent(txtapellido)
                                   .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                   .addComponent(nombretxt))))
                    .addContainerGap(20, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addComponent(btnEditar)
                                             .addGap(28, 28, 28)
                                             .addComponent(btnEliminar)
                                             .addGap(18, 18, 18)
                                             .addComponent(btnLimpiar))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                              .addGap(39, 39, 39))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel5)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jLabel6)
                              .addContainerGap())))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel5)
                         .addComponent(jLabel6))
                    .addGap(67, 67, 67)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnAgregar)
                         .addComponent(btnEditar)
                         .addComponent(btnEliminar)
                         .addComponent(btnLimpiar))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 500));

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_idtxtActionPerformed

     private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
          //Codigo a eliminar
     }//GEN-LAST:event_jLabel6MouseClicked

     private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
          //cOdigo a eliminar
     }//GEN-LAST:event_jLabel6KeyPressed


     private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          //Código a eliminar
     }//GEN-LAST:event_jPanel1MousePressed

     private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
          JOptionPane.showMessageDialog(null, "gracias ");
         dispose();

     }//GEN-LAST:event_jLabel6MousePressed

     private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          Empleadosbl empleado1 = new Empleadosbl();
          Empleados_Codigo empleado = new Empleados_Codigo();
          empleado1.setId(Integer.parseInt(idtxt.getText()));
          empleado1.setNombre(nombretxt.getText());
          empleado1.setApellido(txtapellido.getText());
          empleado1.setCorreo(txtcorreo.getText());

          empleado.insertarDatos(empleado1);
          Modelo.addRow(new Object[]{
               empleado1.getId(), empleado1.getNombre(), empleado1.getApellido(), empleado1.getCorreo()});
     }//GEN-LAST:event_btnAgregarActionPerformed

     private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          Empleadosbl empleado1 = new Empleadosbl();
          Empleados_Codigo empleado2 = new Empleados_Codigo();
          if (!idtxt.getText().equals("")) {
               empleado1.setId(Integer.parseInt(idtxt.getText()));
               empleado1.setNombre(nombretxt.getText());
               empleado1.setApellido(txtapellido.getText());
               empleado1.setCorreo(txtcorreo.getText());
               empleado2.editar(empleado1);
               mostrar("");

          }
     }//GEN-LAST:event_btnEditarActionPerformed

     private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
          int fila = Tabla.rowAtPoint(evt.getPoint());
          idtxt.setText(Tabla.getValueAt(fila, 0).toString());
          nombretxt.setText(Tabla.getValueAt(fila, 1).toString());
          txtapellido.setText(Tabla.getValueAt(fila, 2).toString());
          txtcorreo.setText(Tabla.getValueAt(fila, 3).toString());


     }//GEN-LAST:event_TablaMouseClicked

     private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          if (!idtxt.getText().equals("")) {
               int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de Eliminar al Empleado?", "confimar", 2);
               if (confirmacion == 0) {
                    Empleadosbl empleado1 = new Empleadosbl();
                    Empleados_Codigo empleado2 = new Empleados_Codigo();
                    empleado1.setId(Integer.parseInt(idtxt.getText()));
                    empleado2.eliminar(empleado1);
                    mostrar("");

               }
          }
     }//GEN-LAST:event_btnEliminarActionPerformed

     private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          limpiar();
     }//GEN-LAST:event_btnLimpiarActionPerformed

     private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
          this.setExtendedState(ICONIFIED);
     }//GEN-LAST:event_jLabel5MousePressed
     public void mostrar(String buscar) {
          try {

               Empleados_Codigo func = new Empleados_Codigo();
               Modelo = func.Mostrar(buscar);
               Tabla.setModel(Modelo);

          } catch (Exception e) {
               JOptionPane.showConfirmDialog(rootPane, e);
          }
     }
     public void limpiar(){
          idtxt.setText("");
          nombretxt.setText("");
          txtapellido.setText("");
          txtcorreo.setText("");
          
     }

     /**
      * @param args the command line arguments
      */
     public static void main(String args[]) {
          /* Set the Nimbus look and feel */
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
          /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
           */
          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ClassNotFoundException ex) {
               java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new formulario().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JTable Tabla;
     private javax.swing.JButton btnAgregar;
     private javax.swing.JButton btnEditar;
     private javax.swing.JButton btnEliminar;
     private javax.swing.JButton btnLimpiar;
     private javax.swing.JTextField idtxt;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JSeparator jSeparator1;
     private javax.swing.JSeparator jSeparator2;
     private javax.swing.JSeparator jSeparator3;
     private javax.swing.JSeparator jSeparator4;
     private javax.swing.JTextField nombretxt;
     private javax.swing.JTextField txtapellido;
     private javax.swing.JTextField txtcorreo;
     // End of variables declaration//GEN-END:variables
}