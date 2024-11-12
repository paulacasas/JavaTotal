package Aprendiendo.Ejercicios.Vectores.Desplazar;

import java.util.Scanner;

public class B_DesplazarAvanzado {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] vector = new int[10];
        int numero;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = datos.nextInt();
        }
        System.out.print("Ingrese el número de posiciones a mover: ");
        numero = datos.nextInt();

        int ultimo = vector[numero];

        for (int ii = numero; ii >= 0; ii--) {
            vector[ii] = vector[ii - 1];
        }

        vector[0] = ultimo;

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
    }
}
