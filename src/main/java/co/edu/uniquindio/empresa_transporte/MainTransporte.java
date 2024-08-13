package co.edu.uniquindio.empresa_transporte;

import co.edu.uniquindio.empresa_transporte.model.Propietario;
import co.edu.uniquindio.empresa_transporte.model.Usuario;
import co.edu.uniquindio.empresa_transporte.model.VehiculoCarga;
import co.edu.uniquindio.empresa_transporte.model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTransporte {

    public static void main(String[] args) {

        calcularTotalPasajeros();
        Scanner scanner = new Scanner(System.in);


        // Capturar datos del Propietario por consola
        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cédula del propietario:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el correo del propietario:");
        String correo = scanner.nextLine();

        System.out.println("Ingrese el teléfono del propietario:");
        String telefono = scanner.nextLine();

        Propietario propietario = new Propietario(nombre, cedula, correo, telefono);

        // Capturar datos del Vehículo de Carga
        System.out.println("Ingrese la placa del vehículo de carga:");
        String placa = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo de carga:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la marca del vehículo de carga:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el color del vehículo de carga:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el peso máximo del vehículo de carga (en kilogramos):");
        double pesoMaximo = scanner.nextDouble();

        System.out.println("Ingrese el número de ejes del vehículo de carga:");
        int numeroEjes = scanner.nextInt();

        VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, pesoMaximo, numeroEjes);

        propietario.agregarVehiculoCarga(vehiculoCarga);


        System.out.println("\nDatos del propietario y su vehículo de carga:");
        System.out.println(propietario);


        // Capturar datos del Vehículo de Transporte
        System.out.println("Ingrese la cantidad máxima de pasajeros del " +
                "vehículo de transporte:");
        String maximoPasajeros = scanner.nextLine();


        VehiculoTransporte vehiculoTransporte = new VehiculoTransporte(maximoPasajeros);

        propietario.agregarVehiculoTransporte(vehiculoTransporte);


        scanner.close();

    }

    // Inicializamos los datos del propietario
    public void incializarDatosPropietario1() {

        Propietario propietario = new Propietario("Yamileth", "12345",
                "correo@correo.com", "123456");

        // Inicializamos los datos de los vehículos del propietario

        VehiculoCarga vehiculoCargaMercedes = new VehiculoCarga("RJF147",
                "2022", "Mercedes", "Blanco", 1750.0, 3);

        VehiculoTransporte vehiculoTransporteMercedes =
                new VehiculoTransporte("RFF128", "2024", "Mercedes", "Negro",
                        24);

        propietario.agregarVehiculoCarga(vehiculoCargaMercedes);
        propietario.agregarVehiculoCarga(vehiculoTransporteMercedes);
    }


    // Inicializamos los datos del usuario
    public void incializarDatosUsuario1() {

        Usuario usuario1 = new Usuario("Fabián", "6789",
                "fabian@correo.com", "567890", 22);

        Usuario usuario2 = new Usuario("Federico", "5151",
                "federico@correo.com", "5678590", 24);
    }

    // private static void asociarVehiculo() {
    //VehiculoCarga vehiculoCarga = new VehiculoCarga();
    //vehiculoCarga.setPlaca("QJH10E");
    //vehiculoCarga.setModelo("2023");
    //vehiculoCarga.setMarca("KIA");
    //vehiculoCarga.setColor("NEGRO");
    //vehiculoCarga.setCapacidadCarga(3500);
    //vehiculoCarga.setNumeroEjes(4);


    //Propietario propietario = new Propietario();
    //propietario.setNombre("LUIS");
    //propietario.setCedula("98765432");
    //propietario.setCorreo("luis@.com");
    //propietario.setTelefono("325673");

    //propietario.setVehiculo(vehiculoCarga);
    //System.out.println("Señor(a): " + propietario.getNombre() +
    // " Su vehículo de placa : " + vehiculoCarga.getPlaca() + "Ha
    // " +
    // "sido" +
    // " creado en nuestro sistema ");
//}

    public static void calcularTotalPasajeros() {
        VehiculoTransporte autobus1 = new VehiculoTransporte();
        autobus1.setMaximoPasajeros(40);

        VehiculoTransporte autobus2 = new VehiculoTransporte();
        autobus2.setMaximoPasajeros(55);

        VehiculoTransporte autobus3 = new VehiculoTransporte();
        autobus3.setMaximoPasajeros(72);


        List<VehiculoTransporte> vehiculos = new ArrayList<>();
        vehiculos.add(autobus1);
        vehiculos.add(autobus2);
        vehiculos.add(autobus3);

        int[] viajesPorVehiculo = {3, 10, 7};

        int totalPasajerosTransportados = calcularTotalPasajeros(vehiculos,
                viajesPorVehiculo);
        System.out.println("El total de pasajeros transportados en el día " +
                "por este vehículo es: " + totalPasajerosTransportados);
    }

    public static int calcularTotalPasajeros(List<VehiculoTransporte> vehiculos, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            totalPasajeros += vehiculos.get(i).getMaximoPasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }
}



