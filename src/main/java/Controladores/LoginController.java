package Controladores;

import Modelos.Persona;
import Vistas.LoginVista;
import Vistas.MaquinasVista;
import Vistas.MenuVista;
import Vistas.RegistroVista;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mycompany.proyectofinal.Conexion;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController implements ActionListener {
    
    private final Persona modelo;
    private final LoginVista vista;
    
    public LoginController() {
        modelo = new Persona();
        vista = new LoginVista(); 
        
        vista.btnInicioSesion.addActionListener(this);
        vista.btnRegistro.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Inicio Sesion");
        vista.setVisible(true);
    }
    
    public void limpiar() {
        vista.txtCorreo.setText("");
        vista.txtContra.setText("");
    }
    
    public void recuperarUsuario(String correo, String contra) {
        Conexion conexion = new Conexion();
        String query = "select * from persona where correo='"+correo+"' and password='"+contra+"'";
        
        try {                    
            Statement stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                modelo.setNombre(rs.getString("nombre"));
                modelo.setPrimerAp(rs.getString("primerAp"));
                modelo.setSegundoAp(rs.getString("segundoAp"));
                modelo.setEdad(rs.getInt("edad"));
                modelo.setCorreo(rs.getString("correo"));
                modelo.setContraseña(rs.getString("password"));
                modelo.setTelefono(rs.getString("telefono"));
                modelo.setCedula(rs.getString("cedula"));
                modelo.setEstado(rs.getBoolean("estado"));

                switch (rs.getString("rol")) {
                    case "Cosechador" -> {
                        modelo.setRol("Cosechador");
                        modelo.setEspecialidad(rs.getString("especialidad"));
                    }
                    case "Empleado" -> {
                        modelo.setRol("Empleado");
                        modelo.setDepartamento(rs.getString("departamento"));
                        modelo.setSalario(rs.getDouble("salario"));
                    }
                    case "Gerente" -> {
                        modelo.setRol("Gerente");
                        modelo.setDepartamento(rs.getString("departamento"));
                        modelo.setSalario(rs.getDouble("salario"));
                        modelo.setNumColaboradores(rs.getInt("numeroColaboradores"));
                    }
                    default -> {
                    }
                }

                JOptionPane.showMessageDialog(vista, "Bienvendo al sistema");
                
                limpiar();

                Persona personaLoggeada = modelo;
                MenuVista menuVista = new MenuVista(vista, personaLoggeada);

                menuVista.setVisible(true);
                vista.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(vista, "Credenciales invalidas. Intente de nuevo");
                limpiar();
            }
            
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnInicioSesion) {
            String correo = vista.txtCorreo.getText();
            String contra = vista.txtContra.getText();
            recuperarUsuario(correo, contra);
        }
        
        if (e.getSource() == vista.btnRegistro) { 
            RegistroVista registroVista = new RegistroVista(vista);
            registroVista.setVisible(true);
            vista.setVisible(false);
        }
    }        
    
}