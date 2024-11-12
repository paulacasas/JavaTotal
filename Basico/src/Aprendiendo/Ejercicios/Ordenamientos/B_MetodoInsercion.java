package Aprendiendo.Ejercicios.Ordenamientos;

import java.util.Scanner;

public class B_MetodoInsercion {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Comprueba si el numero anterior es menor
        System.out.println("Ingrese la cantidad de elementos que tendra el vector: ");
        int elementos = datos.nextInt();
        int[] valor = new int[elementos];

        for (int i = 0; i < elementos; i++) {
            System.out.println("Ingrese un elemento: ");
            valor[i] = datos.nextInt();
        }
        int pos, aux;

        // Ordenamiento por inserción
        for (int i = 0; i < elementos; i++) {
            pos = i; // Variable con el valor de i en cada iteración
            aux = valor[i]; // Variable que almacena el valor almacenado en el vector

            while ((pos > 0) && (valor[pos - 1] > aux)) {
                valor[pos] = valor[pos - 1];
                pos--;
            }
            valor[pos] = aux;
        }
        System.out.println("Orden ascendente: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(valor[i] + " ");
        }
        System.out.println("\nOrden descendente: ");
        for (int i = elementos - 1; i > 0; i--) {
            System.out.print(valor[i] + " ");
        }

    }
}
