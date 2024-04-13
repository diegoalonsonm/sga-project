package Vistas;

import Controladores.MaquinaController;
import Modelos.Persona;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuVista extends javax.swing.JFrame {       
    
    public MenuVista(JFrame vista, Persona persona) {
        initComponents();
        
        principal = vista;
        
        lblSaludo.setText(lblSaludo.getText() + persona.getNombre());
        lblFuncion.setText(lblFuncion.getText() + persona.getRol());
        
        btnCosechadores.setVisible(false);
        btnEmpleados.setVisible(false);
        btnCultivos.setVisible(false);
        btnMaquinaria.setVisible(false);
        
        DataInputStream in;
        DataOutputStream out;
        
        try {
            Socket cliente = new Socket("127.0.0.1", 6000);
            
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
            
            switch(persona.getRol()) {
                case "Cosechador" -> out.writeUTF("CHDR");
                case "Empleado" -> out.writeUTF("EMPLD");
                case "Gerente" -> out.writeUTF("GRNT");
                default ->  out.writeUTF("Error");
            }
            
            String rol = in.readUTF();     
            
            switch (rol) {
                case "Cosechador" -> {
                    btnMaquinaria.setVisible(true);
                    btnCultivos.setVisible(true);
                }
                case "Empleado" -> {
                    btnMaquinaria.setVisible(true);
                    btnCultivos.setVisible(true);
                    btnCosechadores.setVisible(true);
                }
                case "Gerente" -> {
                    btnCultivos.setVisible(true);
                    btnMaquinaria.setVisible(true);
                    btnEmpleados.setVisible(true);
                    btnCosechadores.setVisible(true);
                }
                default -> {
                    System.out.println("no tiene permisos de nada");
                }
            }
            
        } catch (IOException ex) {
            System.out.println("Error de servidor: " + ex.getMessage());
        } 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        lblFuncion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCultivos = new javax.swing.JButton();
        btnCosechadores = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnMaquinaria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSaludo.setText("Gracias por utilizar nuestro sistema, ");

        lblFuncion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFuncion.setText("Usted cumple la funcion de: ");

        jLabel2.setText("Que desea hacer hoy");

        btnCultivos.setText("Administrar Cultivos");

        btnCosechadores.setText("Adminsitrar Cosechadores");

        btnEmpleados.setText("Administrar Empleados");

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnMaquinaria.setText("Administrar Maquinaria");
        btnMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaquinariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMaquinaria)
                    .addComponent(btnCerrarSesion)
                    .addComponent(btnEmpleados)
                    .addComponent(btnCosechadores)
                    .addComponent(btnCultivos)
                    .addComponent(jLabel2)
                    .addComponent(lblFuncion)
                    .addComponent(lblSaludo))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaludo)
                .addGap(18, 18, 18)
                .addComponent(lblFuncion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCultivos)
                .addGap(18, 18, 18)
                .addComponent(btnMaquinaria)
                .addGap(18, 18, 18)
                .addComponent(btnCosechadores)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "De verdad deseas cerrar sesion?");
        
        if (opc == 0) {
            JOptionPane.showMessageDialog(this, "Gracias por preferirnos");
            this.dispose();
            principal.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaquinariaActionPerformed
        this.dispose();
                               
        MaquinaController maquinas = new MaquinaController(this);
        maquinas.iniciar();
        
    }//GEN-LAST:event_btnMaquinariaActionPerformed

    private final JFrame principal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCosechadores;
    private javax.swing.JButton btnCultivos;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnMaquinaria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFuncion;
    private javax.swing.JLabel lblSaludo;
    // End of variables declaration//GEN-END:variables
}
