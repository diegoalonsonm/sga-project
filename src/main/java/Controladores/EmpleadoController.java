package Controladores;

import Modelos.Persona;
import Vistas.EmpleadosVista;
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

public class EmpleadoController {

    private final ArrayList<Persona> empleados;
    private final Persona empleado;
    private final EmpleadosVista vista;

    public EmpleadoController(JFrame menu) {
        empleados = new ArrayList();
        empleado = new Persona();
        vista = new EmpleadosVista(menu);

        vista.txtID.setEditable(false);

        vista.tbEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int fila = vista.tbEmpleados.getSelectedRow();

                vista.txtID.setText(vista.tbEmpleados.getValueAt(fila, 0).toString());
                vista.txtNombre.setText(vista.tbEmpleados.getValueAt(fila, 1).toString());
                vista.txtPrimerAp.setText(vista.tbEmpleados.getValueAt(fila, 2).toString());
                vista.txtSegundoAp.setText(vista.tbEmpleados.getValueAt(fila, 3).toString());
                vista.txtEdad.setText(vista.tbEmpleados.getValueAt(fila, 4).toString());
                vista.txtCorreo.setText(vista.tbEmpleados.getValueAt(fila, 5).toString());
                vista.txtContra.setText(vista.tbEmpleados.getValueAt(fila, 6).toString());
                vista.txtTelefono.setText(vista.tbEmpleados.getValueAt(fila, 7).toString());
                vista.txtCedula.setText(vista.tbEmpleados.getValueAt(fila, 8).toString());

                if (vista.tbEmpleados.getValueAt(fila, 9).toString().equals("Ventas")) {
                    vista.cbDepartamento.setSelectedItem("Ventas");
                } else if (vista.tbEmpleados.getValueAt(fila, 9).toString().equals("Administrativo")) {
                    vista.cbDepartamento.setSelectedItem("Administrativo");
                } else if (vista.tbEmpleados.getValueAt(fila, 9).toString().equals("Limpieza")) {
                    vista.cbDepartamento.setSelectedItem("Limpieza");
                } else if (vista.tbEmpleados.getValueAt(fila, 9).toString().equals("TI")) {
                    vista.cbDepartamento.setSelectedItem("TI");
                } else if (vista.tbEmpleados.getValueAt(fila, 9).toString().equals("Mercadeo")) {
                    vista.cbDepartamento.setSelectedItem("Mercadeo");
                }

                vista.txtSalario.setText(vista.tbEmpleados.getValueAt(fila, 10).toString());
            }
        });
    }

    // metodos
    public void iniciar() {
        vista.txtID.setText("0");
        vista.txtID.setEditable(false);
        vista.setTitle("Empleados");
        vista.setVisible(true);
        cargarEmpleados();
    }

    public void cargarEmpleados() {
        empleados.clear();

        DefaultTableModel tbModel = new DefaultTableModel();
        tbModel.addColumn("ID");
        tbModel.addColumn("Nombre");
        tbModel.addColumn("Primer Apellido");
        tbModel.addColumn("Segundo Apellido");
        tbModel.addColumn("Edad");
        tbModel.addColumn("Correo");
        tbModel.addColumn("Contraseña");
        tbModel.addColumn("Telefono");
        tbModel.addColumn("Cedula");
        tbModel.addColumn("Departamento");
        tbModel.addColumn("Salario");

        if (consultarDatos(empleados)) {
            if (!empleados.isEmpty()) {
                for (Persona empleado : empleados) {
                    tbModel.addRow(new String[]{
                            String.valueOf(empleado.getId()),
                            empleado.getNombre(),
                            empleado.getPrimerAp(),
                            empleado.getSegundoAp(),
                            String.valueOf(empleado.getEdad()),
                            empleado.getCorreo(),
                            empleado.getContraseña(),
                            empleado.getTelefono(),
                            empleado.getCedula(),
                            empleado.getDepartamento(),
                            String.valueOf(empleado.getSalario())
                    });
                }
                vista.tbEmpleados.setModel(tbModel);
            } else {
                JOptionPane.showMessageDialog(vista, "No hay empleados registrados");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Error al cargar los empleados");
        }
    }

    public void limpiar() {
        vista.txtID.setText("0");
        vista.txtNombre.setText("");
        vista.txtPrimerAp.setText("");
        vista.txtSegundoAp.setText("");
        vista.txtEdad.setText("");
        vista.txtCorreo.setText("");
        vista.txtContra.setText("");
        vista.txtTelefono.setText("");
        vista.txtCedula.setText("");
        vista.cbDepartamento.setSelectedItem("Ventas");
        vista.txtSalario.setText("");
    }

    // metodos crud
    public boolean consultarDatos(ArrayList<Persona> empleados) {
        Conexion conexion = new Conexion();
        String query = "select * from persona where rol = 'empleado'";

        try {
            Statement stmt = conexion.conectar().prepareCall(query);
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Persona empleado = new Persona();
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setPrimerAp(rs.getString("primerAp"));
                empleado.setSegundoAp(rs.getString("segundoAp"));
                empleado.setEdad(rs.getInt("edad"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setContraseña(rs.getString("password"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setCedula(rs.getString("cedula"));
                empleado.setRol(rs.getString("rol"));
                empleado.setDepartamento(rs.getString("departamento"));
                empleado.setSalario(rs.getDouble("salario"));
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public static boolean agregarEmpleado(Persona empleado) {
        Conexion conexion = new Conexion();
        String query = "insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, departamento, salario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getPrimerAp());
            stmt.setString(3, empleado.getSegundoAp());
            stmt.setInt(4, empleado.getEdad());
            stmt.setString(5, empleado.getCorreo());
            stmt.setString(6, empleado.getContraseña());
            stmt.setString(7, empleado.getTelefono());
            stmt.setString(8, empleado.getCedula());
            stmt.setBoolean(9, true);
            stmt.setString(10, "Empleado");
            stmt.setString(11, empleado.getDepartamento());
            stmt.setDouble(12, empleado.getSalario());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public static boolean editarEmpleado (Persona empleado) {
        Conexion conexion = new Conexion();
        String query = "update persona set nombre = ?, primerAp = ?, segundoAp = ?, edad = ?, correo = ?, password = ?, telefono = ?, cedula = ?, departamento = ?, salario = ? where id = ?";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getPrimerAp());
            stmt.setString(3, empleado.getSegundoAp());
            stmt.setInt(4, empleado.getEdad());
            stmt.setString(5, empleado.getCorreo());
            stmt.setString(6, empleado.getContraseña());
            stmt.setString(7, empleado.getTelefono());
            stmt.setString(8, empleado.getCedula());
            stmt.setString(9, empleado.getDepartamento());
            stmt.setDouble(10, empleado.getSalario());
            stmt.setInt(11, empleado.getId());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean eliminarEmpleado(Persona empleado) {
        Conexion conexion = new Conexion();
        String query = "delete from persona where id = ?";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setInt(1, empleado.getId());

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
