package co.edu.uniquindio.empresa_transporte.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona {

    private List<Vehiculo> listaVehiculosAsociados;

    public Propietario(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
    }

    public Propietario(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public void agregarVehiculoCarga(Vehiculo vehiculo) {
        this.listaVehiculosAsociados.add(vehiculo);
    }

}
