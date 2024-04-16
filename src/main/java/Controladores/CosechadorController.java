package Controladores;

import Modelos.Persona;
import Vistas.CosechadorVista;
import com.mycompany.proyectofinal.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CosechadorController {

    private final ArrayList<Persona> cosechadores;
    private final Persona cosechador;
    private final CosechadorVista vista;

    public CosechadorController(JFrame menu) {
        cosechadores = new ArrayList();
        cosechador = new Persona();
        vista = new CosechadorVista(menu);

        vista.txtId.setEditable(false);

        vista.tbCosechadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int fila = vista.tbCosechadores.getSelectedRow();

                vista.txtId.setText(vista.tbCosechadores.getValueAt(fila, 0).toString());
                vista.txtNombre.setText(vista.tbCosechadores.getValueAt(fila, 1).toString());
                vista.txtPrimerAp.setText(vista.tbCosechadores.getValueAt(fila, 2).toString());
                vista.txtSegundoAp.setText(vista.tbCosechadores.getValueAt(fila, 3).toString());
                vista.txtEdad.setText(vista.tbCosechadores.getValueAt(fila, 4).toString());
                vista.txtCorreo.setText(vista.tbCosechadores.getValueAt(fila, 5).toString());
                vista.txtTelefono.setText(vista.tbCosechadores.getValueAt(fila, 6).toString());
                vista.txtCedula.setText(vista.tbCosechadores.getValueAt(fila, 7).toString());

                if (vista.tbCosechadores.getValueAt(fila, 8).toString().equals("Activo")) {
                    vista.cbEstado.setSelectedItem("Activo");
                } else {
                    vista.cbEstado.setSelectedItem("Inactivo");
                }

                if (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Cereales")) {
                    vista.cbEspecialidad.setSelectedItem("Cereales");
                } else if  (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Leguminosas")) {
                    vista.cbEspecialidad.setSelectedItem("Leguminosas");
                } else if  (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Hortalizas")) {
                    vista.cbEspecialidad.setSelectedItem("Hortalizas");
                } else if  (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Ornamentales")) {
                    vista.cbEspecialidad.setSelectedItem("Ornamentales");
                } else if  (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Raices y Tuberculos")) {
                    vista.cbEspecialidad.setSelectedItem("Raices y Tuberculos");
                } else if  (vista.tbCosechadores.getValueAt(fila, 9).toString().equals("Frutales")) {
                    vista.cbEspecialidad.setSelectedItem("Frutales");
                }

            }
        });
    }

    public void iniciar() {
        vista.txtId.setText("0");
        vista.txtId.setEditable(false);
        vista.setTitle("Cosechadores");
        vista.setVisible(true);
        cargarCosechadores();
    }

    public void limpiar() {
        vista.txtId.setText("0");
        vista.txtCedula.setText("");
        vista.txtNombre.setText("");
        vista.txtPrimerAp.setText("");
        vista.txtSegundoAp.setText("");
        vista.txtEdad.setText("");
        vista.txtCorreo.setText("");
        vista.txtTelefono.setText("");
        vista.cbEstado.setSelectedItem("Activo");
        vista.cbEspecialidad.setSelectedItem("Cereales");
    }

    public void cargarCosechadores() {
        cosechadores.clear();

        DefaultTableModel tbModel = new DefaultTableModel();
        tbModel.addColumn("ID");
        tbModel.addColumn("Nombre");
        tbModel.addColumn("Primer Apellido");
        tbModel.addColumn("Segundo Apellido");
        tbModel.addColumn("Edad");
        tbModel.addColumn("Correo");
        tbModel.addColumn("Telefono");
        tbModel.addColumn("Cedula");
        tbModel.addColumn("Estado");
        tbModel.addColumn("Especialidad");

        if (consultarDatos(cosechadores)) {
            if (!cosechadores.isEmpty()) {
                for (Persona cosechador : cosechadores) {
                    tbModel.addRow(new String[]{
                            String.valueOf(cosechador.getId()),
                            cosechador.getNombre(),
                            cosechador.getPrimerAp(),
                            cosechador.getSegundoAp(),
                            String.valueOf(cosechador.getEdad()),
                            cosechador.getCorreo(),
                            cosechador.getTelefono(),
                            cosechador.getCedula(),
                            cosechador.isEstado() ? "Activo" : "Inactivo",
                            cosechador.getEspecialidad()
                    });
                }
                vista.tbCosechadores.setModel(tbModel);
            } else {
                JOptionPane.showMessageDialog(vista, "No hay cosechadores registrados");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Error al cargar los cosechadores");
        }
    }

    public boolean consultarDatos(ArrayList<Persona> cosechadores) {
        Conexion conexion = new Conexion();
        String query = "select * from persona where rol = 'Cosechador'";

        try {
            Statement stmt = conexion.conectar().prepareCall(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Persona cosechador = new Persona();
                cosechador.setId(rs.getInt("id"));
                cosechador.setNombre(rs.getString("nombre"));
                cosechador.setPrimerAp(rs.getString("primerAp"));
                cosechador.setSegundoAp(rs.getString("segundoAp"));
                cosechador.setEdad(rs.getInt("edad"));
                cosechador.setCorreo(rs.getString("correo"));
                cosechador.setTelefono(rs.getString("telefono"));
                cosechador.setCedula(rs.getString("cedula"));
                cosechador.setEstado(rs.getBoolean("estado"));
                cosechador.setEspecialidad(rs.getString("especialidad"));

                cosechadores.add(cosechador);
            }

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public static boolean agregarCosechador(Persona cosechador) {
        Conexion conexion = new Conexion();
        String query = "insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, especialidad) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, cosechador.getNombre());
            stmt.setString(2, cosechador.getPrimerAp());
            stmt.setString(3, cosechador.getSegundoAp());
            stmt.setInt(4, cosechador.getEdad());
            stmt.setString(5, cosechador.getCorreo());
            stmt.setString(6, cosechador.getContraseña());
            stmt.setString(7, cosechador.getTelefono());
            stmt.setString(8, cosechador.getCedula());
            stmt.setBoolean(9, true);
            stmt.setString(10, cosechador.getRol());
            stmt.setString(11, cosechador.getEspecialidad());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public  static boolean editarCosechador(Persona cosechador) {
        Conexion conexion = new Conexion();
        String query = "update persona set nombre = ?, primerAp = ?, segundoAp = ?, edad = ?, correo = ?, telefono = ?, cedula = ?, estado = ?, especialidad = ? where id = ?";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, cosechador.getNombre());
            stmt.setString(2, cosechador.getPrimerAp());
            stmt.setString(3, cosechador.getSegundoAp());
            stmt.setInt(4, cosechador.getEdad());
            stmt.setString(5, cosechador.getCorreo());
            stmt.setString(6, cosechador.getTelefono());
            stmt.setString(7, cosechador.getCedula());
            stmt.setBoolean(8, cosechador.isEstado());
            stmt.setString(9, cosechador.getEspecialidad());
            stmt.setInt(10, cosechador.getId());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public static boolean eliminarCosechador(int id) {
        Conexion conexion = new Conexion();
        String query = "delete from persona where id = ?";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setInt(1, id);

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

}
