package Aprendiendo.Ejercicios.Ordenamientos;

import java.util.Scanner;

public class A_MetodoBurbuja {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Funciona revisando cada elemento de la lista con el siguiente
        // Los elementos mas pequeños subiran

        System.out.println("Ingrese la cantida de elementos que va tener el arreglo: ");
        int elementos = datos.nextInt();

        int aux; // Variable auxiliar
        int[] numeros = new int[elementos];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = datos.nextInt();
        } // Método burbuja
        for (int i = 0; i < (elementos - 1); i++) { ///
            for (int ii = 0; ii < (elementos - 1); ii++) {
                if (numeros[ii] > numeros[ii + 1]) {
                    aux = numeros[ii];
                    numeros[ii] = numeros[ii + 1];
                    numeros[ii + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado en forma creciente");

        for (int i = 0; i < elementos; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nArreglo ordenado de forma decreciente");
        for (int i = (elementos - 1); i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
