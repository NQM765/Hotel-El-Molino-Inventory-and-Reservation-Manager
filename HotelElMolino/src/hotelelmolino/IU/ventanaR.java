/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelelmolino.IU;
    import java.sql.*;
    import java.util.ArrayList; 


/**
 *
 * @author angie
 */
public class ventanaR extends javax.swing.JFrame {
    static ventanaLogin ventanalogin = new ventanaLogin();   
    static ArrayList<String> datos = new ArrayList<String>();
    String rol =ventanalogin.getRol();

    /**
     * Creates new form ventanaR
     */
    public ventanaR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 149, 253));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel5.setText("Registros de");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setText("HOTEL EL MOLINO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel6.setText(ventanalogin.getTabla());

        jButton6.setBackground(null);
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelelmolino/IMAGENES/regresra.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("");
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Cargar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton6)
                .addContainerGap(822, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel3)
                .addGap(73, 246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton6)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(142, 142, 142))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        ventanalogin.verificarRol(this);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(rol.equals("AtencionAlCliente") && ventanalogin.getTabla().equals("parqueadero")){
            try {
            Statement s = ventanalogin.getConexion().createStatement();
            ResultSet rs = s.executeQuery("select * from "+ventanalogin.getTabla()); 
            String ocupado;
            while (rs.next()) {
                if(rs.getInt(2)==1){ocupado="Ocupado";}else{ocupado="Disponible";}
                if(rs.getInt(3)==0){
                    datos.add(
                        "Número parqueadero: " + rs.getInt(1)
                        + "\t" + ocupado+"\n");
                }else{
                    datos.add(
                        "Número del parqueadero: " + rs.getInt(1)
                        + "\t" + ocupado
                        + "\tCabaña asociada: " + rs.getInt(3)+"\n");}
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }
        if(rol.equals("AtencionAlCliente") && ventanalogin.getTabla().equals("cabaña")){
            try {
            Statement s = ventanalogin.getConexion().createStatement();
            ResultSet rs = s.executeQuery("select * from "+ventanalogin.getTabla());            
            while (rs.next()) {
                datos.add(
                        "Número de cabaña: " + rs.getInt(1)
                        + "\tCapacidad: " + rs.getInt(2)
                        + "\t\tCamas Dobles: " + rs.getInt(3)
                        + "\tCamas Sencillas: " + rs.getInt(4)
                        + "\tHabitaciones: " + rs.getInt(5)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }
        if(rol.equals("AtencionAlCliente")&& ventanalogin.getTabla().equals("servicios")){
            try {            
            Statement s2 = ventanalogin.getConexion().createStatement();
            ResultSet rs2 = s2.executeQuery("select * from cabaña_has_servicio"); 
            while (rs2.next()) {
                datos.add(
                        "Servicio: " + rs2.getString(1)
                        + "\tCabaña que lo tiene: " + rs2.getInt(2)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }
        if(rol.equals("AdministradorReservas")&& ventanalogin.getTabla().equals("servicios")){
            try {            
            Statement s2 = ventanalogin.getConexion().createStatement();
            ResultSet rs2 = s2.executeQuery("select * from vista_admin_reserva_cabaña_servicio"); 
            while (rs2.next()) {
                datos.add(
                        "Número de cabaña: " + rs2.getInt(1)
                        + "\tCapacidad: " + rs2.getInt(2)
                        + "\t\tCamas Dobles: " + rs2.getInt(3)
                        + "\tCamas Sencillas: " + rs2.getInt(4)
                        + "\tHabitaciones: " + rs2.getInt(5)
                                + "\tServicio que tiene: " + rs2.getString(6)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }
        if(rol.equals("AdministradorReservas")&& ventanalogin.getTabla().equals("servicios")){
            try {            
            Statement s2 = ventanalogin.getConexion().createStatement();
            ResultSet rs2 = s2.executeQuery("select * from vista_admin_reserva_cabaña_servicio"); 
            while (rs2.next()) {
                datos.add(
                        "Número de cabaña: " + rs2.getInt(1)
                        + "\tCapacidad: " + rs2.getInt(2)
                        + "\t\tCamas Dobles: " + rs2.getInt(3)
                        + "\tCamas Sencillas: " + rs2.getInt(4)
                        + "\tHabitaciones: " + rs2.getInt(5)
                                + "\tServicio que tiene: " + rs2.getString(6)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }
        if(rol.equals("AdministradorReservas")&& ventanalogin.getTabla().equals("sugerencia")){
            try {            
            Statement s2 = ventanalogin.getConexion().createStatement();
            ResultSet rs2 = s2.executeQuery("select * from sugerencia"); 
            while (rs2.next()) {
                datos.add(
                        "Id: " + rs2.getInt(1)
                        + "\tFecha: " + rs2.getDate(2)
                        + "\tDescripción: " + rs2.getString(3)
                        + "\tId reserva asociada: " + rs2.getInt(4)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }
        }
        if(rol.equals("AdministradorReservas") && ventanalogin.getTabla().equals("reserva")){
            try {
            Statement s = ventanalogin.getConexion().createStatement();
            ResultSet rs = s.executeQuery("select * from vista_admin_reserva_cabaña");            
            while (rs.next()) {
                datos.add(
                        "Id Reserva: " + rs.getInt(1)
                        + "\tCliente Id: " + rs.getInt(2)
                        + "\tDuracion estadía: " + rs.getInt(3)
                        + "\tCheck In: " + rs.getDate(4)
                        + "\tCheck Out: " + rs.getDate(5)
                        + "\tCosto: " + rs.getInt(6)
                        + "\tMétodo de pago: " + rs.getString(7)+
                                "Cantidad Huespedes: " + rs.getInt(8)
                        + "\tAdmin Id: " + rs.getInt(9)
                        + "\tTrabajador Id: " + rs.getInt(10)
                        + "\tCapacidad Cabaña: " + rs.getInt(11)
                        + "\tCAmas Dobles: " + rs.getInt(12)
                        + "\tCamas sencillas: " + rs.getInt(13)
                        + "\tHabitaciones: " + rs.getInt(14)+"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }        
        }      
        jTextArea1.setText(""+datos);
        datos.clear();        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(ventanaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaR().setVisible(true);                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
