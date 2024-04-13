package Controladores;

import Modelos.Persona;
import com.mycompany.proyectofinal.Conexion;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CosechadorController {

    private final ArrayList<Persona> cosechadores;
    private final Persona cosechador;

    public CosechadorController() {
        cosechadores = new ArrayList();
        cosechador = new Persona();
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

}
