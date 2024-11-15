package Poligono;

import java.util.ArrayList;

import java.util.Scanner;

public class Principal {
    // Arreglo dinámico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        // Llenar poligono
        llenarPoligono();
        // Mostrar datos y area
        mostrarResultados();

    }

    public static void llenarPoligono() {
        int opcion;
        char respuest;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.print("2. Rectangulo \n>> ");
                opcion = datos.nextInt();
            } while (opcion < 1 && opcion > 2);
            switch (opcion) {
                case 1: // LLenar triangulo
                    triangulo();
                    break;
                case 2: // LLenar rectangulo
                    rectangulo();
                    break;
            }
            System.out.println("Desea introducir otro poligono (s/n): ");
            respuest = datos.next().charAt(0);
        } while (respuest == 's' || respuest == 'S');
        System.out.println();
    }

    public static void triangulo() {
        double lado1, lado2, lado3;

        System.out.print("Digite el lado 1 del triangulo: ");
        lado1 = datos.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = datos.nextDouble();
        System.out.print("Digite el lado 3 del triangulo: ");
        lado3 = datos.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }

    public static void rectangulo() {
        double lado1, lado2;
        System.out.print("Digite el lado 1 del rectangulo: ");
        lado1 = datos.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo: ");
        lado2 = datos.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);

    }

    public static void mostrarResultados() {
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: " + poli.area());
            System.out.println("");
        }
    }
}
