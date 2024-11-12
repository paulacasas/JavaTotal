/* Construir un programa que dada serie de vehículos caracterizados por su marca, 
 * modelo y precio, imprima las propiedades del vehículo más barato.
 * Para ello, se deberán leer por teclado las características de cada vehículo y crear
 * una clase que represente uno de ellos
 */

import java.util.Scanner;

public class Vehiculo {
    private double precio;
    private String modelo;
    private String marca;

    // Constructor
    public Vehiculo(double precio, String modelo, String marca) {
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.println("Precio: $" + precio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }

    public static int indexCarroCaro(Vehiculo vehiculos[]) {
        double precio;
        int index = 0;

        precio = vehiculos[0].getPrecio();

        for (int i = 1; i > vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                index = i;
            }

        }
        return index;
    }

    public static int indexCarroBarato(Vehiculo vehiculos[]) {
        double precio;
        int index = 0;

        precio = vehiculos[0].getPrecio();

        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Scanner datosS = new Scanner(System.in);

        String marca;
        String modelo;
        double precio;

        System.out.print("Digite la cantidad de vehiculos: ");
        int cantidad = datos.nextInt();

        // Crear arreglos
        Vehiculo vehiculos[] = new Vehiculo[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite las características del carro " + (i + 1) + "");
            System.out.print("Marca: ");
            marca = datosS.nextLine();
            System.out.print("Modelo: ");
            modelo = datosS.nextLine();
            System.out.print("Precio: ");
            precio = datos.nextDouble();

            vehiculos[i] = new Vehiculo(precio, modelo, marca);
        }

        int indexCocheB = indexCarroBarato(vehiculos);
        System.out.print("Carro más barato: ");
        vehiculos[indexCocheB].mostrarDatos();

        int indexCocheC = indexCarroCaro(vehiculos);
        System.out.print("Carro más caro: ");
        vehiculos[indexCocheC].mostrarDatos();

        datos.close();
        datosS.close();
    }

}
