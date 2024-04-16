package Controladores;

import Modelos.Cultivo;
import Vistas.CultivosVista;
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

public class CultivoController {

    private final ArrayList<Cultivo> cultivos;
    private final Cultivo cultivo;
    private final CultivosVista vista;

    public CultivoController(JFrame menu) {
        cultivos = new ArrayList();
        cultivo = new Cultivo();
        vista = new CultivosVista(menu);

        vista.txtId.setEditable(false);

        vista.tbCultivos.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int fila = vista.tbCultivos.getSelectedRow();

                vista.txtId.setText(vista.tbCultivos.getValueAt(fila, 0).toString());
                vista.txtFechaSiembra.setText(vista.tbCultivos.getValueAt(fila, 1).toString());
                vista.txtFechaRecoleccion.setText(vista.tbCultivos.getValueAt(fila, 2).toString());
                vista.txtPlanta.setText(vista.tbCultivos.getValueAt(fila, 3).toString());

                if (vista.tbCultivos.getValueAt(fila, 4).equals("Cereales")) {
                    vista.cbTipo.setSelectedItem("Cereales");
                } else if (vista.tbCultivos.getValueAt(fila, 4).equals("Leguminosas")) {
                    vista.cbTipo.setSelectedItem("Leguminosas");
                } else if (vista.tbCultivos.getValueAt(fila, 4).equals("Hortalizas")) {
                    vista.cbTipo.setSelectedItem("Hortalizas");
                } else if (vista.tbCultivos.getValueAt(fila, 4).equals("Ornamentales")) {
                    vista.cbTipo.setSelectedItem("Ornamentales");
                } else if (vista.tbCultivos.getValueAt(fila, 4).equals("Raices y Tuberculos")) {
                    vista.cbTipo.setSelectedItem("Raices y Tuberculos");
                } else if (vista.tbCultivos.getValueAt(fila, 4).equals("Frutales")) {
                    vista.cbTipo.setSelectedItem("Frutales");
                }

                vista.txtUbicacion.setText(vista.tbCultivos.getValueAt(fila, 5).toString());

                if (vista.tbCultivos.getValueAt(fila, 6).equals("Recolectado")) {
                    vista.cbEstado.setSelectedItem("Recolectado");
                } else if (vista.tbCultivos.getValueAt(fila, 6).equals("Por Recolectar")) {
                    vista.cbEstado.setSelectedItem("Por Recolectar");
                }

            }
        });
    }

    public void iniciar() {
        vista.txtId.setText("0");
        vista.txtId.setEditable(false);
        vista.setTitle("Cultivos");
        vista.setVisible(true);
        cargarCultivos();
    }

    public void limpiar() {
        vista.txtId.setText("0");
        vista.txtFechaSiembra.setText("");
        vista.txtFechaRecoleccion.setText("");
        vista.txtPlanta.setText("");
        vista.cbTipo.setSelectedIndex(0);
        vista.txtUbicacion.setText("");
        vista.cbEstado.setSelectedIndex(0);
    }

    public void cargarCultivos() {
        cultivos.clear();

        DefaultTableModel tbModel = new DefaultTableModel();
        tbModel.addColumn("ID");
        tbModel.addColumn("Fecha Siembra");
        tbModel.addColumn("Fecha Recoleccion");
        tbModel.addColumn("Planta");
        tbModel.addColumn("Tipo");
        tbModel.addColumn("Ubicacion");
        tbModel.addColumn("Estado");

        if (consultarDatos(cultivos)) {
            if (!cultivos.isEmpty()) {
                for (Cultivo cultivo : cultivos) {
                    tbModel.addRow(new String[]{
                            String.valueOf(cultivo.getId()),
                            cultivo.getFechaSiembra(),
                            cultivo.getFechaRecoleccion(),
                            cultivo.getPlantaSembrada(),
                            cultivo.getTipoCultivo(),
                            cultivo.getUbicacion(),
                            cultivo.isEstado() ? "Recolectado" : "Por Recolectar"});
                }
                vista.tbCultivos.setModel(tbModel);
            } else {
                JOptionPane.showMessageDialog(vista, "No hay cultivos registrados");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Error al cargar los cultivos");
        }
    }

    public boolean consultarDatos(ArrayList<Cultivo> cultivos) {
        Conexion conexion = new Conexion();
        String query = "SELECT * FROM cultivo";

        try {
            Statement stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Cultivo cultivo = new Cultivo();
                cultivo.setId(rs.getInt("id"));
                cultivo.setFechaSiembra(rs.getString("fechaSiembra"));
                cultivo.setFechaRecoleccion(rs.getString("fechaRecoleccion"));
                cultivo.setPlantaSembrada(rs.getString("plantaSembrada"));
                cultivo.setTipoCultivo(rs.getString("tipoCultivo"));
                cultivo.setUbicacion(rs.getString("ubicacionCultivo"));
                cultivo.setEstado(rs.getBoolean("estado"));
                cultivos.add(cultivo);
            }

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean agregarCultivo (Cultivo cultivo) {
        Conexion conexion = new Conexion();
        String query = "insert into Cultivo (fechaSiembra, fechaRecoleccion, plantaSembrada, tipoCultivo, ubicacionCultivo, estado) values (?, ?, ?, ?, ?, ?)";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, cultivo.getFechaSiembra());
            stmt.setString(2, cultivo.getFechaRecoleccion());
            stmt.setString(3, cultivo.getPlantaSembrada());
            stmt.setString(4, cultivo.getTipoCultivo());
            stmt.setString(5, cultivo.getUbicacion());
            stmt.setBoolean(6, cultivo.isEstado());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean editarCultivo (Cultivo cultivo) {
        Conexion conexion = new Conexion();
        String query = "update Cultivo set fechaSiembra = ?, fechaRecoleccion = ?, plantaSembrada = ?, tipoCultivo = ?, ubicacionCultivo = ?, estado = ? where id = ?";

        try {
            CallableStatement stmt = conexion.conectar().prepareCall(query);

            stmt.setString(1, cultivo.getFechaSiembra());
            stmt.setString(2, cultivo.getFechaRecoleccion());
            stmt.setString(3, cultivo.getPlantaSembrada());
            stmt.setString(4, cultivo.getTipoCultivo());
            stmt.setString(5, cultivo.getUbicacion());
            stmt.setBoolean(6, cultivo.isEstado());
            stmt.setInt(7, cultivo.getId());

            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean eliminarCultivo (int id) {
        Conexion conexion = new Conexion();
        String query = "delete from Cultivo where id = ?";

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