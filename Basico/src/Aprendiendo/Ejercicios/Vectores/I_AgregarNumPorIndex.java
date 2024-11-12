package Aprendiendo.Ejercicios.Vectores;

import java.util.Scanner;

public class I_AgregarNumPorIndex {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeroA, posicion;
        int[] numeros = new int[9];

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = datos.nextInt();
        }

        System.out.print("Digite el numero que quiere agregar en la tabla: ");
        numeroA = datos.nextInt();
        do {
            System.out.print("Digite la posición: ");
            posicion = datos.nextInt();
        } while ((posicion <= 0) || (posicion >= 10));

        if (posicion < 9) {
            for (int i = 8; i >= posicion; i--) {
                numeros[i] = numeros[i - 1];
            }
        }
        numeros[(posicion - 1)] = numeroA;

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
