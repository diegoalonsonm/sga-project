package Controladores;

import Modelos.Persona;
import com.mycompany.proyectofinal.Conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadoController {

    private final ArrayList<Persona> empleados;
    private final Persona empleado;

    public EmpleadoController() {
        empleados = new ArrayList();
        empleado = new Persona();
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
            stmt.setString(10, empleado.getRol());
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
}
