package co.edu.uniquindio.empresa_transporte.model;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajeros;

    public VehiculoTransporte() {
    }


    public VehiculoTransporte(String placa, String modelo, String marca, String color,
                         int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

}
