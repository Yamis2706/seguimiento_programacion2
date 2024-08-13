package co.edu.uniquindio.empresa_transporte;

import co.edu.uniquindio.empresa_transporte.model.Propietario;
import co.edu.uniquindio.empresa_transporte.model.Usuario;
import co.edu.uniquindio.empresa_transporte.model.VehiculoCarga;
import co.edu.uniquindio.empresa_transporte.model.VehiculoTransporte;

import java.util.Scanner;

public class MainTransporte {

    public static void main(String[] args) {

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

        scanner.close();

    }

    public void incializarDatosPropietario1() {

        // Inicializamos los datos del propietario
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

    public void incializarDatosUsuario1() {

        // Inicializamos los datos del usuario
        Usuario usuario1 = new Usuario("Fabián", "6789",
                "fabian@correo.com", "567890", 22);

        Usuario usuario2 = new Usuario("Federico", "5151",
                "fedetico@correo.com", "5678590", 24);
    }
}
