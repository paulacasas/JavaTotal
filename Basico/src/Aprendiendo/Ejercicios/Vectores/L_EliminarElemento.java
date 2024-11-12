package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class L_EliminarElemento {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        String[] nombres = new String[5];

        int eliminar;

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese su nombre: ");
            nombres[i] = datos.next();
        }
        do {
            System.out.println("Elije una posición a eliminar: ");
            eliminar = datos.nextInt();
        } while (eliminar >= 5 || eliminar < 0);

        for (int i = 0; i < 4; i++) {
            if (i >= eliminar) {
                nombres[i] = nombres[i + 1];
            }
        }
        System.out.println("Elementos del array: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]);
        }
    }
}
