package co.edu.uniquindio.empresa_transporte.model;

public class Usuario extends Persona{

    private int edad;

    public Usuario(String nombre, String cedula, String correo, String telefono, int edad) {
        super(nombre, cedula, correo, telefono);
        this.edad = edad;
    }

    public Usuario(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
