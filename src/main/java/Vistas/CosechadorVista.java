package Vistas;

import Controladores.CosechadorController;
import Modelos.Persona;

import javax.swing.*;

public class CosechadorVista extends javax.swing.JFrame {
    
    private final JFrame menu;
    private final Persona cosechador;

    public CosechadorVista(JFrame menuV) {
        initComponents();
        
        menu = menuV;
        cosechador = new Persona();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtSegundoAp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrimerAp = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCosechadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Primer Apellido:");

        jLabel4.setText("Segundo Apellido:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Correo:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Cedula:");

        jLabel10.setText("Estado:");

        jLabel11.setText("Especialidad:");

        btnAgregar.setText(" Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cereales", "Leguminosas", "Hortalizas", "Ornamentales", "Raices y Tuberculos", "Frutales" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSegundoAp)
                                    .addComponent(txtNombre)
                                    .addComponent(txtPrimerAp)
                                    .addComponent(txtEdad)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtContra)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtId)
                                    .addComponent(txtCedula)
                                    .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnLimpiar)
                        .addGap(46, 46, 46)
                        .addComponent(btnVolver)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrimerAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSegundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnVolver))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cosechadores"));

        tbCosechadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbCosechadores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        CosechadorController controller = new CosechadorController(this);

        try {
            cosechador.setNombre(txtNombre.getText());
            cosechador.setPrimerAp(txtPrimerAp.getText());
            cosechador.setSegundoAp(txtSegundoAp.getText());
            cosechador.setEdad(Integer.parseInt(txtEdad.getText()));
            cosechador.setCorreo(txtCorreo.getText());
            cosechador.setContraseña(txtContra.getText());
            cosechador.setTelefono(txtTelefono.getText());
            cosechador.setCedula(txtCedula.getText());

            if (cbEstado.getSelectedItem().toString().equals("Activo")) {
                cosechador.setEstado(true);
            } else {
                cosechador.setEstado(false);
            }

            if (cbEspecialidad.getSelectedItem().toString().equals("Cereales")) {
                cosechador.setEspecialidad("Cereales");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Leguminosas")) {
                cosechador.setEspecialidad("Leguminosas");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Hortalizas")) {
                cosechador.setEspecialidad("Hortalizas");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Ornamentales")) {
                cosechador.setEspecialidad("Ornamentales");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Raices y Tuberculos")) {
                cosechador.setEspecialidad("Raices y Tuberculos");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Frutales")) {
                cosechador.setEspecialidad("Frutales");
            }

            if (controller.agregarCosechador(cosechador)) {
                controller.limpiar();
                JOptionPane.showMessageDialog(this, "Cosechador agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar cosechador");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un numero");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        CosechadorController controller = new CosechadorController(this);

        try {
            cosechador.setId(Integer.parseInt(txtId.getText()));
            cosechador.setNombre(txtNombre.getText());
            cosechador.setPrimerAp(txtPrimerAp.getText());
            cosechador.setSegundoAp(txtSegundoAp.getText());
            cosechador.setEdad(Integer.parseInt(txtEdad.getText()));
            cosechador.setCorreo(txtCorreo.getText());
            cosechador.setContraseña(txtContra.getText());
            cosechador.setTelefono(txtTelefono.getText());
            cosechador.setCedula(txtCedula.getText());

            if (cbEstado.getSelectedItem().toString().equals("Activo")) {
                cosechador.setEstado(true);
            } else {
                cosechador.setEstado(false);
            }

            if (cbEspecialidad.getSelectedItem().toString().equals("Cereales")) {
                cosechador.setEspecialidad("Cereales");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Leguminosas")) {
                cosechador.setEspecialidad("Leguminosas");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Hortalizas")) {
                cosechador.setEspecialidad("Hortalizas");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Ornamentales")) {
                cosechador.setEspecialidad("Ornamentales");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Raices y Tuberculos")) {
                cosechador.setEspecialidad("Raices y Tuberculos");
            } else if (cbEspecialidad.getSelectedItem().toString().equals("Frutales")) {
                cosechador.setEspecialidad("Frutales");
            }

            if (controller.editarCosechador(cosechador)) {
                controller.limpiar();
                JOptionPane.showMessageDialog(this, "Cosechador modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar cosechador");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un numero");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        CosechadorController controller = new CosechadorController(this);

        try {
            cosechador.setId(Integer.parseInt(txtId.getText()));

            if (controller.eliminarCosechador(cosechador.getId())) {
                controller.limpiar();
                JOptionPane.showMessageDialog(this, "Cosechador eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar cosechador");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar cosechador");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtId.setText("0");
        txtCedula.setText("");
        txtNombre.setText("");
        txtPrimerAp.setText("");
        txtSegundoAp.setText("");
        txtEdad.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cbEstado.setSelectedItem("Activo");
        cbEspecialidad.setSelectedItem("Cereales");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        this.dispose();
        menu.setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbEspecialidad;
    public javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbCosechadores;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrimerAp;
    public javax.swing.JTextField txtSegundoAp;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
