package Controladores;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modelos.Maquina;
import Vistas.MaquinasVista;
import java.awt.event.ActionListener;
import com.mycompany.proyectofinal.Conexion;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MaquinaController implements ActionListener {

    // atributos
    private final ArrayList<Maquina> maquinas;
    private final Maquina maquina;
    private final MaquinasVista vista;

    // constructor
    public MaquinaController(JFrame menu) {
        maquinas = new ArrayList();
        maquina = new Maquina();
        vista = new MaquinasVista(menu);

        vista.txtId.setEditable(false);
        
        vista.tblMaquinas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int fila = vista.tblMaquinas.getSelectedRow();

                vista.txtId.setText(vista.tblMaquinas.getValueAt(fila, 0).toString());
                vista.txtNombre.setText(vista.tblMaquinas.getValueAt(fila, 1).toString());
                vista.txtTiempoReparacion.setText(vista.tblMaquinas.getValueAt(fila, 2).toString());
                vista.txtCosto.setText(vista.tblMaquinas.getValueAt(fila, 3).toString());
                vista.cbEstado.setSelectedItem(vista.tblMaquinas.getValueAt(fila, 4).toString());
            }            
        });      
    }

    // metodos
    public void iniciar() {
        vista.txtId.setText("0");
        vista.txtId.setEditable(false);
        vista.setTitle("Maquinas");
        vista.setVisible(true);
        cargarMaquinas();
    }
    
    public void cargarMaquinas() {
        maquinas.clear();

        DefaultTableModel tbModelo = new DefaultTableModel();
        tbModelo.addColumn("ID");
        tbModelo.addColumn("Nombre");
        tbModelo.addColumn("Tiempo de Reparación");
        tbModelo.addColumn("Costo /h");
        tbModelo.addColumn("Estado");

        if (consultarDatos(maquinas)) {
            if (!maquinas.isEmpty()) {
                for (Maquina maquina : maquinas) {
                    tbModelo.addRow(new String[] {
                            String.valueOf(maquina.getId()),
                            maquina.getNombre(),
                            String.valueOf(maquina.getTiempoReparacion()),
                            String.valueOf(maquina.getCosto()),
                            maquina.isEnUso() ? "En uso" : "Disponible"
                    });
                }
                vista.tblMaquinas.setModel(tbModelo);
            } else {
                JOptionPane.showMessageDialog(vista, "No hay datos para mostrar");
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Error al consultar los datos");
        }
        vista.tblMaquinas.setModel(tbModelo);
    }

    public void limpiar() {
        vista.txtId.setText("0");
        vista.txtNombre.setText("");
        vista.txtCosto.setText("");
        vista.txtTiempoReparacion.setText("");
        vista.cbEstado.setSelectedItem("Disponible");
    }

    // metodos crud
    public boolean consultarDatos(ArrayList<Maquina> maquinas) {
        Conexion conexion = new Conexion();
        String query = "select * from maquinas_agricolas";

        try {
            Statement stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Maquina maquina = new Maquina(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getBoolean(5)
                );
                maquinas.add(maquina);
            }

        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean agregarMaquina(Maquina maquina) {
        Conexion conexion = new Conexion();
        String query = "insert into maquinas_agricolas (nombre, tiemporeparacion, costohora, enuso) values (?, ?, ?, ?)";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(query);

            cs.setString(1, maquina.getNombre());
            cs.setInt(2, maquina.getTiempoReparacion());
            cs.setDouble(3, maquina.getCosto());
            cs.setBoolean(4, maquina.isEnUso());

            cs.execute();
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean editarMaquina(Maquina maquina) {
        Conexion conexion = new Conexion();
        String query = "update maquinas_agricolas set nombre = ?, tiemporeparacion = ?, costohora = ?, enuso = ? where codigo = ?";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(query);

            cs.setString(1, maquina.getNombre());
            cs.setInt(2, maquina.getTiempoReparacion());
            cs.setDouble(3, maquina.getCosto());
            cs.setBoolean(4, maquina.isEnUso());
            cs.setInt(5, maquina.getId());

            cs.execute();
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    public boolean eliminarMaquina(Maquina maquina) {
        Conexion conexion = new Conexion();
        String query = "delete from maquinas_agricolas where id = ?";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(query);

            cs.setInt(1, maquina.getId());

            cs.execute();
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
            return false;
        } finally {
            conexion.desconectar();
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            maquina.setId(Integer.parseInt(vista.txtId.getText()));
            maquina.setNombre(vista.txtNombre.getText());
            maquina.setCosto(Double.parseDouble(vista.txtCosto.getText()));
            maquina.setTiempoReparacion(Integer.parseInt(vista.txtTiempoReparacion.getText()));
            if (vista.cbEstado.getSelectedItem().equals("Disponible")) {
                maquina.setEnUso(false);
            } else {
                maquina.setEnUso(true);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista,
                    "El tiempo de reparacion y el coste deben ser numeros. Revise de nuevo",
                    "Error en el formato del tiempo de reparacion o el costo",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (e.getSource() == vista.btnAgregar) {
            if (agregarMaquina(maquina)) {
                JOptionPane.showMessageDialog(vista, "Maquina agregada correctamente");
                cargarMaquinas();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error al agregar la maquina");
            }
        }

        if (e.getSource() == vista.btnModificar) {
            if (editarMaquina(maquina)) {
                JOptionPane.showMessageDialog(vista, "Maquina editada correctamente");
                cargarMaquinas();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error al editar la maquina");
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            int opc = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar la maquina?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opc == 0) {
                if (eliminarMaquina(maquina)) {
                    JOptionPane.showMessageDialog(vista, "Maquina eliminada correctamente");
                    cargarMaquinas();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al eliminar la maquina");
                }
            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }
}
