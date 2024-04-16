package Vistas;

import Controladores.EmpleadoController;
import Modelos.Persona;

import javax.swing.*;

public class EmpleadosVista extends javax.swing.JFrame {

    public EmpleadosVista(JFrame menuV) {
        initComponents();

        menu = menuV;
        empleado = new Persona();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        cbDepartamento = new javax.swing.JComboBox<>();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSegundoAp = new javax.swing.JTextField();
        txtPrimerAp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnAgrergar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Primer Ap:");

        jLabel4.setText("SegundoAp:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Correo:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Cedula:");

        jLabel12.setText("Departamento:");

        jLabel13.setText("Salario:");

        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Administrativo", "Limpieza", "TI", "Mercadeo" }));

        btnAgrergar.setText("Agregar");
        btnAgrergar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrergarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });

        bntLimpiar.setText("Limpiar");
        bntLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtContra)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtEdad)
                                    .addComponent(txtSegundoAp)
                                    .addComponent(txtPrimerAp)
                                    .addComponent(txtNombre)
                                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgrergar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(bntEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(bntLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(jLabel12)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgrergar)
                    .addComponent(btnModificar)
                    .addComponent(bntEliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntLimpiar)
                    .addComponent(btnVolver))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla"));

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbEmpleados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgrergarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrergarActionPerformed

        EmpleadoController controller = new EmpleadoController(this);

        try {
            empleado.setNombre(txtNombre.getText());
            empleado.setPrimerAp(txtPrimerAp.getText());
            empleado.setSegundoAp(txtSegundoAp.getText());
            empleado.setEdad(Integer.parseInt(txtEdad.getText()));
            empleado.setCorreo(txtCorreo.getText());
            empleado.setContraseña(txtContra.getText());
            empleado.setTelefono(txtTelefono.getText());
            empleado.setCedula(txtCedula.getText());
            empleado.setDepartamento(cbDepartamento.getSelectedItem().toString());
            empleado.setSalario(Double.parseDouble(txtSalario.getText()));

            if (controller.agregarEmpleado(empleado)) {
                controller.cargarEmpleados();
                controller.limpiar();
                JOptionPane.showMessageDialog(this, "Empleado agregado");
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar empleado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La edad y el salario deben ser valores numericos");
        }

    }//GEN-LAST:event_btnAgrergarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        EmpleadoController controller = new EmpleadoController(this);

        try {
            empleado.setId(Integer.parseInt(txtID.getText()));
            empleado.setNombre(txtNombre.getText());
            empleado.setPrimerAp(txtPrimerAp.getText());
            empleado.setSegundoAp(txtSegundoAp.getText());
            empleado.setEdad(Integer.parseInt(txtEdad.getText()));
            empleado.setCorreo(txtCorreo.getText());
            empleado.setContraseña(txtContra.getText());
            empleado.setTelefono(txtTelefono.getText());
            empleado.setCedula(txtCedula.getText());
            empleado.setDepartamento(cbDepartamento.getSelectedItem().toString());
            empleado.setSalario(Double.parseDouble(txtSalario.getText()));

            if (controller.editarEmpleado(empleado)) {
                controller.cargarEmpleados();
                controller.limpiar();
                JOptionPane.showMessageDialog(this, "Empleado modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar empleado");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La edad y el salario deben ser valores numericos");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed

        EmpleadoController controller = new EmpleadoController(this);

        try {
            empleado.setId(Integer.parseInt(txtID.getText()));

            int opc = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opc == 0) {
                if (controller.eliminarEmpleado(empleado)) {
                    controller.cargarEmpleados();
                    controller.limpiar();
                    JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar empleado");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un valor numerico");
        }

    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed

        txtID.setText("0");
        txtNombre.setText("");
        txtPrimerAp.setText("");
        txtSegundoAp.setText("");
        txtEdad.setText("");
        txtCorreo.setText("");
        txtContra.setText("");
        txtTelefono.setText("");
        txtCedula.setText("");
        cbDepartamento.setSelectedItem("Ventas");
        txtSalario.setText("");

    }//GEN-LAST:event_bntLimpiarActionPerformed


    private final JFrame menu;
    private final Persona empleado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntEliminar;
    public javax.swing.JButton bntLimpiar;
    public javax.swing.JButton btnAgrergar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    public javax.swing.JTable tbEmpleados;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrimerAp;
    public javax.swing.JTextField txtSalario;
    public javax.swing.JTextField txtSegundoAp;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
