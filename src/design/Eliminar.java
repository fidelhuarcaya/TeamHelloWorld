package design;

import clases.Conectarbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {

    
    public Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtId = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("ELIMINAR POSTULANTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtId);

        jLabel1.setText("INGRESE EL DNI: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             //OPCION ELIMINAR  
      Conectarbd con=new Conectarbd();
      PreparedStatement ps = null;
      String dni="";
      dni=txtId.getText();
      //ELIMINACION TABLA POSTULANTE
        try {
            Connection c = con.Conectar();
            String sql="DELETE FROM postulante WHERE DNI=? ";           
             ps =c.prepareStatement(sql);    
            ps.setString(1,dni);                    
         } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }          
//        //ELIMINACION TABLA AREA_INTERES
//        try {
//          Connection  c1 = con.Conectar();
//          String sql2="DELETE FROM AREA_INTERES WHERE POSTULANTE_DNI= ";  
//           ps =c1.prepareStatement(sql2);
//          ps.setString(1,dni);        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }       
//        //ELIMINACION TABLA DETALLE_POSTULANTE_IDIOMA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM DETALLE_POSTULANTE_IDIOMA WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,dni);        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//        //ELIMINACION TABLA DETALLE_POSTULANTE_SOFTWARE
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM DETALLE_POSTULANTE_SOFTWARE WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        //ELIMINACION TABLA EDU_SUPERIOR
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM EDU_SUPERIOR WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA EDUCACION
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM EDUCACION WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA EDUCACION_BASICA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM EDUCACION_BASICA WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        } catch (SQLException ex) {
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA EMPRESA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM EDUCACION_BASICA WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA FAMILIAR
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM FAMILIAR WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA FUNCION_PUBLICA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM FUNCION_PUBLICA WHERE DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA LUGAR_PREFERENCIA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM LUGAR_PREFERENCIA WHERE POSTULANTE_DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA PREGUNTA
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM PREGUNTA WHERE POSTULANTE_DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //ELIMINACION TABLA REFERENCIA_LABORAL
//        try {
//          Connection  c3 = con.Conectar();
//          String sql2="DELETE FROM REFERENCIA_LABORAL WHERE POSTULANTE_DNI= ";  
//           ps =c3.prepareStatement(sql2);
//          ps.setString(1,txtId.getText());        
//        }catch (SQLException ex){
//            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
//        } 
        //CONFIRMACION DE USUARIO ELIMINADO        
        try {
            int res = ps.executeUpdate();
            if(res==1){
                JOptionPane.showMessageDialog(null,"PERSONA ELIMINADA");        
            }else{             
                JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR PERSONA");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtId;
    // End of variables declaration//GEN-END:variables
}
