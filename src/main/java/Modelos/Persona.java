package Modelos;

public class Persona {
    
    // atributos
    private int id;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private int edad;
    private String correo;
    private String contraseña;
    private String telefono;
    private String cedula;
    private boolean estado;
    private String rol;
    private String especialidad;
    private String departamento;
    private double salario;
    private int numColaboradores;
    
    // constructor
    public Persona() {
    }

    public Persona(String nombre, String primerAp, String segundoAp, int edad, String correo, String contraseña, String telefono, String cedula, boolean estado, String rol) {
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cedula = cedula;
        this.estado = estado;
        this.rol = rol;
    }

    public Persona(String nombre, String primerAp, String segundoAp, int edad, String correo, String contraseña, String telefono, String cedula, boolean estado, String rol, String departamento, double salario, int numColaboradores) {
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cedula = cedula;
        this.estado = estado;
        this.rol = rol;
        this.departamento = departamento;
        this.salario = salario;
        this.numColaboradores = numColaboradores;
    }

    public Persona(String nombre, String primerAp, String segundoAp, int edad, String correo, String contraseña, String telefono, String cedula, boolean estado, String rol, String departamento, double salario) {
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cedula = cedula;
        this.estado = estado;
        this.rol = rol;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Persona(String nombre, String primerAp, String segundoAp, int edad, String correo, String contraseña, String telefono, String cedula, boolean estado, String rol, String especialidad) {       
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.cedula = cedula;
        this.estado = estado;
        this.rol = rol;
        this.especialidad = especialidad;
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

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumColaboradores() {
        return numColaboradores;
    }

    public void setNumColaboradores(int numColaboradores) {
        this.numColaboradores = numColaboradores;
    }      
    
}
