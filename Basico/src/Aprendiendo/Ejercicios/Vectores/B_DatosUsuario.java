package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class B_DatosUsuario {
    public static void main(String[] args) {
        int mujer = 0, hombre = 0;
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de usuarios a evaluar: ");
        int usuarios = datos.nextInt();
        String nombres[] = new String[usuarios];
        int edad[] = new int[usuarios];
        char genero[] = new char[usuarios];

        for (int i = 0; i < usuarios; i++) {
            System.out.print("\nIngrese el nombre del usuario: ");
            nombres[i] = datos.next();
            System.out.print("Ingrese la edad del usuario: ");
            edad[i] = datos.nextInt();
            do {
                System.out.print("Ingrese el genero del usuario: ");
                genero[i] = datos.next().charAt(0);
            } while (genero[i] != 'M' && genero[i] != 'F');

            if (genero[i] == 'F') {
                mujer++;
            } else {
                hombre++;
            }
        }
        for (int i = 0; i < usuarios; i++) {
            System.out.println("Nombre: " + nombres[i] + " Edad: " + edad[i] + " Genero: " + genero[i]);
        }
        System.out.println("Cantidad de mujeres: " + mujer);
        System.out.println("Cantidad de hombres: " + hombre);
    }
}
