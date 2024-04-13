package Vistas;

import Controladores.CosechadorController;
import Controladores.EmpleadoController;
import Controladores.GerenteController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import Modelos.Persona;
import javax.swing.JOptionPane;

public class RegistroVista extends javax.swing.JFrame {   
    
    private final Persona persona = new Persona();

    public RegistroVista(JFrame loginV) {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                vistaLogin.setVisible(true);
                dispose();
            }
        
        });        
        
        vistaLogin = loginV;
        
        btnGroupRegistro.add(btnCosechador);
        btnGroupRegistro.add(btnEmpleado);
        btnGroupRegistro.add(btnGerente);    
        
        lblColaboradores.setVisible(false);
        txtColaboradores.setVisible(false);
        lblDepartamento.setVisible(false);
        cbDepartamento.setVisible(false);
        lblEspecialidad.setVisible(false);
        cbEspecialidad.setVisible(false);
        lblSalario.setVisible(false);
        txtSalario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupRegistro = new javax.swing.ButtonGroup();
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
        txtSegundoAp = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrimerAp = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCosechador = new javax.swing.JRadioButton();
        btnEmpleado = new javax.swing.JRadioButton();
        btnGerente = new javax.swing.JRadioButton();
        lblEspecialidad = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblColaboradores = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtColaboradores = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        cbEspecialidad = new javax.swing.JComboBox<>();
        cbDepartamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro en el sistema");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese sus datos por favor");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Primer Apellido:");

        jLabel5.setText("Segundo Apellido:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Correo:");

        jLabel8.setText("Contraseña:");

        jLabel9.setText("Telefono:");

        jLabel10.setText("Cedula:");

        jLabel11.setText("Seleccione su funcion dentro del sistema");

        btnGroupRegistro.add(btnCosechador);
        btnCosechador.setText("Cosechador");
        btnCosechador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosechadorActionPerformed(evt);
            }
        });

        btnGroupRegistro.add(btnEmpleado);
        btnEmpleado.setText("Empleado");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnGroupRegistro.add(btnGerente);
        btnGerente.setText("Gerente");
        btnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenteActionPerformed(evt);
            }
        });

        lblEspecialidad.setText("Especialidad:");

        lblDepartamento.setText("Departamento:");

        lblSalario.setText("Salario:");

        lblColaboradores.setText("Num. Colaboradores:");

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnLogin.setText("Volver al Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cereales", "Leguminosas", "Hortalizas", "Ornamentales", "Raices y Tuberculos", "Frutales" }));

        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Administrativo", "Limpieza", "TI", "Mercadeo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSegundoAp)
                            .addComponent(txtEdad)
                            .addComponent(txtPrimerAp)
                            .addComponent(txtNombre)
                            .addComponent(txtCorreo)
                            .addComponent(txtContra)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtCedula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCosechador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEmpleado))
                                    .addComponent(btnRegistrarse))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGerente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblColaboradores)
                                    .addComponent(lblSalario)
                                    .addComponent(lblDepartamento)
                                    .addComponent(lblEspecialidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColaboradores)
                                    .addComponent(txtSalario)
                                    .addComponent(cbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnLogin)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrimerAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSegundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCosechador)
                    .addComponent(btnEmpleado)
                    .addComponent(btnGerente))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidad)
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColaboradores)
                    .addComponent(txtColaboradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        volverLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        try {
            persona.setCedula(txtCedula.getText());
            persona.setNombre(txtNombre.getText());
            persona.setPrimerAp(txtPrimerAp.getText());
            persona.setSegundoAp(txtSegundoAp.getText());
            persona.setEdad(Integer.parseInt(txtEdad.getText()));
            persona.setTelefono(txtTelefono.getText());
            persona.setCorreo(txtCorreo.getText());
            persona.setContraseña(txtContra.getText());
            persona.setEspecialidad(cbEspecialidad.getSelectedItem().toString());
            persona.setDepartamento(cbDepartamento.getSelectedItem().toString());
            persona.setSalario(Double.parseDouble(txtSalario.getText()));
            persona.setNumColaboradores(Integer.parseInt(txtColaboradores.getText()));
        } catch(NumberFormatException ex) {
            if (!btnCosechador.isSelected() && !btnEmpleado.isSelected() && !btnGerente.isSelected()) {
                JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un rol para poder continuar",
                    "No hay rol seleccionado",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (btnEmpleado.isSelected() && txtSalario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Revise que el campo de salario sea un numero y este lleno",
                    "Error al leer el salario ingresado",
                    JOptionPane.WARNING_MESSAGE);
                return;
            } 
            
            if (btnGerente.isSelected() && txtSalario.getText().isBlank() && txtColaboradores.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Revise que los campos de salario y numero de colaboradores seas numeros y esten llenos",
                    "Error al leer el salario y la cantidad de colaboradores ingresada",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        if (evt.getSource() == btnRegistrarse) {
            if (verificarCorreo(persona.getCorreo())) {                
                if (btnCosechador.isSelected()) {
                    if (CosechadorController.agregarCosechador(persona)) {
                        JOptionPane.showMessageDialog(this, "Cosechador registrado con exito!");
                        limpiar();
                        volverLogin();
                    }   
                }
            
                if (btnEmpleado.isSelected()) {
                    if (EmpleadoController.agregarEmpleado(persona)) {
                        JOptionPane.showMessageDialog(this, "Empleado registrado con exito!");
                        limpiar();
                        volverLogin();
                    }
                }
            
                if (btnGerente.isSelected()) {
                    if (GerenteController.agregarGerente(persona)) {
                        JOptionPane.showMessageDialog(this, "Gerente registrado con exito!");
                        limpiar();
                        volverLogin();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El correo no cumple el formato adecuado. Intente de nuevo");
            }                    
        }

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnCosechadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosechadorActionPerformed
        lblColaboradores.setVisible(false);
        txtColaboradores.setVisible(false);
        lblDepartamento.setVisible(false);
        cbDepartamento.setVisible(false);
        lblEspecialidad.setVisible(true);
        cbEspecialidad.setVisible(true);
        lblSalario.setVisible(false);
        txtSalario.setVisible(false);
        
        persona.setRol("Cosechador");
        persona.setEspecialidad(cbEspecialidad.getSelectedItem().toString()); 
        
    }//GEN-LAST:event_btnCosechadorActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        try {
            lblColaboradores.setVisible(false);
            txtColaboradores.setVisible(false);
            lblDepartamento.setVisible(true);
            cbDepartamento.setVisible(true);
            lblEspecialidad.setVisible(false);
            cbEspecialidad.setVisible(false);
            lblSalario.setVisible(true);
            txtSalario.setVisible(true);

            persona.setRol("Empleado");
            persona.setDepartamento(cbDepartamento.getSelectedItem().toString());
            persona.setSalario(Double.parseDouble(txtSalario.getText()));
        } catch (NumberFormatException ex) {
            System.out.println("");
        }                
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenteActionPerformed
        try {
            lblColaboradores.setVisible(true);
            txtColaboradores.setVisible(true);
            lblDepartamento.setVisible(true);
            cbDepartamento.setVisible(true);
            lblEspecialidad.setVisible(false);
            cbEspecialidad.setVisible(false);
            lblSalario.setVisible(true);
            txtSalario.setVisible(true);

            persona.setRol("Gerente");
            persona.setDepartamento(cbDepartamento.getSelectedItem().toString());
            persona.setSalario(Double.parseDouble(txtSalario.getText()));
            persona.setNumColaboradores(Integer.parseInt(txtColaboradores.getText()));
        } catch (NumberFormatException ex) {
            System.out.println("");
        }
    }//GEN-LAST:event_btnGerenteActionPerformed
    
    private void limpiar() {
        txtCedula.setText("");
        txtColaboradores.setText("");
        txtContra.setText("");
        txtCorreo.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        txtPrimerAp.setText("");
        txtSalario.setText("");
        txtSegundoAp.setText("");
        txtTelefono.setText("");
        cbDepartamento.setSelectedItem("Ventas");
        cbEspecialidad.setSelectedItem("Cereales");
        btnCosechador.setSelected(false);
        btnEmpleado.setSelected(false);
        btnGerente.setSelected(false);
    }

    private boolean verificarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }
    
    private void volverLogin() {
        vistaLogin.setVisible(true);
        this.dispose();
    }
    
    private final JFrame vistaLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton btnCosechador;
    public javax.swing.JRadioButton btnEmpleado;
    public javax.swing.JRadioButton btnGerente;
    public javax.swing.ButtonGroup btnGroupRegistro;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbEspecialidad;
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
    public javax.swing.JLabel lblColaboradores;
    public javax.swing.JLabel lblDepartamento;
    public javax.swing.JLabel lblEspecialidad;
    public javax.swing.JLabel lblSalario;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtColaboradores;
    public javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrimerAp;
    public javax.swing.JTextField txtSalario;
    public javax.swing.JTextField txtSegundoAp;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
