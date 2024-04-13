package Modelos;

public class Maquina {
    
    // atributos
    private int id;
    private String nombre;
    private int tiempoReparacion;
    private double costo;
    private boolean enUso;

    // constructor
    public Maquina() {
    }       
    
    public Maquina(int id, String nombre, int tiempoReparacion, double costo, boolean enUso) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoReparacion = tiempoReparacion;
        this.costo = costo;
        this.enUso = enUso;
    }

    public Maquina(String nombre, int tiempoReparacion, double costo, boolean enUso) {
        this.nombre = nombre;
        this.tiempoReparacion = tiempoReparacion;
        this.costo = costo;
        this.enUso = enUso;
    }

    // encapsuladores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoReparacion() {
        return tiempoReparacion;
    }

    public void setTiempoReparacion(int tiempoReparacion) {
        this.tiempoReparacion = tiempoReparacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }        
    
}
