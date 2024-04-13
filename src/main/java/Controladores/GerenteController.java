package Controladores;

import Modelos.Persona;
import com.mycompany.proyectofinal.Conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class GerenteController {

    private final ArrayList<Persona> gerentes;
    private final Persona gerente;

    public GerenteController() {
        gerentes = new ArrayList();
        gerente = new Persona();
    }

    public static boolean agregarGerente(Persona gerente) {
        Conexion conexion = new Conexion();
        String query = "insert into persona (nombre, primerAp, segundoAp, edad, correo, password, telefono, cedula, estado, rol, departamento, salario, numeroColaboradores) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, gerente.getNombre());
            stmt.setString(2, gerente.getPrimerAp());
            stmt.setString(3, gerente.getSegundoAp());
            stmt.setInt(4, gerente.getEdad());
            stmt.setString(5, gerente.getCorreo());
            stmt.setString(6, gerente.getContraseña());
            stmt.setString(7, gerente.getTelefono());
            stmt.setString(8, gerente.getCedula());
            stmt.setBoolean(9, true);
            stmt.setString(10, gerente.getRol());
            stmt.setString(11, gerente.getDepartamento());
            stmt.setDouble(12, gerente.getSalario());
            stmt.setInt(13, gerente.getNumColaboradores());

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
