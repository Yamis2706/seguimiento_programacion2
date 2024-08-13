package co.edu.uniquindio.empresa_transporte.model;

import java.util.List;

public class Propietario extends Persona {

    private List<Vehiculo> listaVehiculosAsociados;

    public Propietario(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
    }

    public Propietario(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public Propietario() {

    }

    public void agregarVehiculoCarga(Vehiculo vehiculo) {
        this.listaVehiculosAsociados.add(vehiculo);

    }
    public void agregarVehiculoTransporte(Vehiculo vehiculo) {
        this.listaVehiculosAsociados.add(vehiculo);
    }

    public void setVehiculo(VehiculoCarga vehiculoCarga) {
    }
}
