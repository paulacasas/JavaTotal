package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class M_MostrarIndex {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int num;
        int[] vector = new int[10];
        boolean creciente = true, encontrado = false;

        do {
            for (int i = 0; i < vector.length; i++) {
                System.out.print("Ingrese elemento N°" + (i + 1) + ": ");
                vector[i] = datos.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (vector[i] < vector[i + 1]) {
                    creciente = true;
                }
                if (vector[i] > vector[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta de forma creciente");
            }
        } while (creciente == false);

        System.out.print("Digite elemento a encontrar: ");
        num = datos.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) { // Verificar si el número esta en el vector
                System.out.println("Numero encontrado, posición " + i);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("El numero no se encuentra en el vector");
        }
    }
}
