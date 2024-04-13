package com.mycompany.proyectofinal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket cliente = null;
        
        DataInputStream in;
        DataOutputStream out;
        
        try {
            System.out.println("servidor iniciado en el puerto 6000");
            servidor = new ServerSocket(6000);

            while (true) {
                cliente = servidor.accept();

                in = new DataInputStream(cliente.getInputStream());
                out = new DataOutputStream(cliente.getOutputStream());

                String mensaje = in.readUTF();

                switch (mensaje) {
                    case "CHDR" -> out.writeUTF("Cosechador");
                    case "EMPLD" -> out.writeUTF("Empleado");
                    case "GRNT" -> out.writeUTF("Gerente");
                    default ->  out.writeUTF("Error");
                }

                cliente.close();
            }
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
