package com.mycompany.proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String url;
    private String database;
    private String user;
    private String password;   
    private String driver;
    private Connection connection;
    
    public Conexion() {
        url = "jdbc:mysql://127.0.0.1:3306/";
        database = "proyecto";
        user = "root";
        password = "Danm0309#";
        driver = "com.mysql.cj.jdbc.Driver";
    }
    
    public Connection conectar() {
        try {
            Class.forName(driver);
            connection = DriverManager
                    .getConnection(url + database, user, password);
            return connection;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error (Class): " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error (SQL): " + ex.getMessage());
        }
        return null;
    }

    public void desconectar() {
        try {
            System.out.println("Conexion finalizada");
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error (SQL): " + ex.getMessage());
        }
    }

}
