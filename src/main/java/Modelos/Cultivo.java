package Modelos;

public class Cultivo {

    // atributos
    private int id;
    private String fechaSiembra;
    private String fechaRecoleccion;
    private String plantaSembrada;
    private String tipoCultivo;
    private String ubicacion;
    private boolean estado;

    // constructor
    public Cultivo() {
    }

    public Cultivo(int id, String fechaSiembra, String fechaRecoleccion, String plantaSembrada, String tipoCultivo, String ubicacion, boolean estado) {
        this.id = id;
        this.fechaSiembra = fechaSiembra;
        this.fechaRecoleccion = fechaRecoleccion;
        this.plantaSembrada = plantaSembrada;
        this.tipoCultivo = tipoCultivo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public Cultivo(String fechaSiembra, String fechaRecoleccion, String plantaSembrada, String tipoCultivo, String ubicacion, boolean estado) {
        this.fechaSiembra = fechaSiembra;
        this.fechaRecoleccion = fechaRecoleccion;
        this.plantaSembrada = plantaSembrada;
        this.tipoCultivo = tipoCultivo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    // encapsuladores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(String fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public String getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public void setFechaRecoleccion(String fechaRecoleccion) {
        this.fechaRecoleccion = fechaRecoleccion;
    }

    public String getPlantaSembrada() {
        return plantaSembrada;
    }

    public void setPlantaSembrada(String plantaSembrada) {
        this.plantaSembrada = plantaSembrada;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
